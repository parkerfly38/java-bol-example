package com.nmfta.ebol.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nmfta.ebol.repository.BOLRepository;
import com.nmfta.ebol.BOLRequestNotFoundException;
import com.nmfta.ebol.model.BOLRequest;
import com.nmfta.ebol.model.BOLResponse;
import com.nmfta.ebol.model.BOLResponseImages;
import com.nmfta.ebol.model.BOLResponseMessageStatus;
import com.nmfta.ebol.model.BOLResponseMessageStatusInformation;
import com.nmfta.ebol.model.BOLResponseReferenceNumbers;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "BOL Services", description = "APIs for bills of lading.")
public class BOLController {
	private final BOLRepository repo;
	
	BOLController(BOLRepository repo)
	{
		this.repo = repo;
	}
	
	// Aggregate root
	// tag::get-aggregate-root[]
	@GetMapping("/bol")
	List<BOLRequest> all() {
		try {
			return repo.findAll();
		} catch (JpaSystemException exception)
		{
			exception.printStackTrace();
			return null;
		}
	}
	
	@PostMapping("/bol")
	BOLResponse newBOLRequest(@RequestBody BOLRequest newBOLRequest)
	{
		// here we may want to put any business logic that confirms / verifies
		// some of the contents of the BOL prior to saving.
		// it's a good place for address confirmations, looking
		// for invalid combinations of data, etc.
		// for our purposes, we will just save.
		repo.save(newBOLRequest);
		BOLResponse bolResponse = new BOLResponse();
		// for our reference numbers, we should already have the PRO, but we would probably want to retrieve
		// or generate our SCN
		BOLResponseReferenceNumbers refNumbers = new BOLResponseReferenceNumbers();
		refNumbers.setPro(newBOLRequest.getReferenceNumbers().getPro());
		refNumbers.setShipmentConfirmationNumber("SCN12345");
		bolResponse.setReferenceNumbers(refNumbers);
		// here we'd also be seeking retrieval or generations of our BOL PDF image and print labels
		// but for now, we're dropping in fake images, both base64 encoded file data.
		BOLResponseImages images = new BOLResponseImages();
		try {
			FileInputStream fis = new FileInputStream("src/main/resources/application.properties");
		
			Properties props = new Properties();
			props.load(fis);
		
			images.setBol(props.getProperty("bol.boldocument"));
			images.setShippingLabels(props.getProperty("bol.shippinglabel"));
		} catch (IOException exception)
		{
			exception.printStackTrace();
			images.setBol("");
			images.setShippingLabels("");
		}
		bolResponse.setImages(images);
		// do we have any errors?  well, here we would capture them
		// and return them with appropriate codes.  Note, DO frame
		// errors in business logic as either HTTP 400 or 422 as appropriate
		List<BOLResponseMessageStatusInformation> statusInformation = new ArrayList<BOLResponseMessageStatusInformation>();
		BOLResponseMessageStatus messageStatus = new BOLResponseMessageStatus();
		// a message in this spec has three possible statuses.
		// PASS, FAIL, WARNING.
		// If "FAIL", do return 400 or 422.
		messageStatus.setStatus("PASS");
		messageStatus.setCode("FAKE STATUS CODE");
		messageStatus.setMessage("Transaction was successful.");
		// this would be populated with guidance if we have a fail/warning
		messageStatus.setResolution("");
		messageStatus.setInformation(statusInformation);
		bolResponse.setMessageStatus(messageStatus);
		return bolResponse;		
	}
	
	@GetMapping("/bol/{id}")
	BOLRequest one(@PathVariable Long id)
	{
		return repo.findById(id)
				.orElseThrow(() -> new BOLRequestNotFoundException(id));
	}
	
	@PutMapping("/bol/{id}")
	BOLRequest replaceBOLRequest(@RequestBody BOLRequest newBOLRequest, @PathVariable Long id)
	{
		return repo.findById(id)
					.map(bol -> {
						bol.setAccessorials(newBOLRequest.getAccessorials());
						bol.setBillTo(newBOLRequest.getBillTo());
						bol.setBol(newBOLRequest.getBol());
						bol.setCommodities(newBOLRequest.getCommodities());
						bol.setCustomsBroker(newBOLRequest.getCustomsBroker());
						bol.setDestination(newBOLRequest.getDestination());
						bol.setImages(newBOLRequest.getImages());
						bol.setOrigin(newBOLRequest.getOrigin());
						bol.setPayment(newBOLRequest.getPayment());
						bol.setReferenceNumbers(newBOLRequest.getReferenceNumbers());
						bol.setShipmentTotals(newBOLRequest.getShipmentTotals());
						return repo.save(bol);
					})
					.orElseGet(() -> {
						newBOLRequest.setId(id);
						return repo.save(newBOLRequest);
					});
	}
	
	@DeleteMapping("/bol/{id}")
	void deleteBOL(@PathVariable Long id)
	{
		repo.deleteById(id);
	}
}
