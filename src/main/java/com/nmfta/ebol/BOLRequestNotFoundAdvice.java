package com.nmfta.ebol;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BOLRequestNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(BOLRequestNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String bolRequetNotFoundHandler(BOLRequestNotFoundException exception)
	{
		return exception.getMessage();
	}
}
