/*
 * Electronic Bill Of Lading Service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.nmfta.ebol.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.nmfta.ebol.model.BOLRequestAccessorialsCodRemitTo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Required when accessorial code COD is present in the accessorial.codes list.  
 */
@Schema(description = "Required when accessorial code COD is present in the accessorial.codes list.  ")
public class BOLRequestAccessorialsCod {
  @SerializedName("amount")
  private String amount = null;

  @SerializedName("terms")
  private String terms = null;

  @SerializedName("customerCheckAcceptable")
  private Boolean customerCheckAcceptable = null;

  @SerializedName("remitTo")
  private BOLRequestAccessorialsCodRemitTo remitTo = null;

  public BOLRequestAccessorialsCod amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount to be received for the COD.  Valid Formats: * ##.## (2 decimal places only) 
   * @return amount
  **/
  @Schema(example = "56.71", description = "Amount to be received for the COD.  Valid Formats: * ##.## (2 decimal places only) ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public BOLRequestAccessorialsCod terms(String terms) {
    this.terms = terms;
    return this;
  }

   /**
   * Payment terms associated with the COD.  Valid Values: * Prepaid * Collect 
   * @return terms
  **/
  @Schema(example = "Collect", description = "Payment terms associated with the COD.  Valid Values: * Prepaid * Collect ")
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public BOLRequestAccessorialsCod customerCheckAcceptable(Boolean customerCheckAcceptable) {
    this.customerCheckAcceptable = customerCheckAcceptable;
    return this;
  }

   /**
   * Indicates whether or not a customer check or cash is acceptable.
   * @return customerCheckAcceptable
  **/
  @Schema(example = "true", description = "Indicates whether or not a customer check or cash is acceptable.")
  public Boolean isCustomerCheckAcceptable() {
    return customerCheckAcceptable;
  }

  public void setCustomerCheckAcceptable(Boolean customerCheckAcceptable) {
    this.customerCheckAcceptable = customerCheckAcceptable;
  }

  public BOLRequestAccessorialsCod remitTo(BOLRequestAccessorialsCodRemitTo remitTo) {
    this.remitTo = remitTo;
    return this;
  }

   /**
   * Get remitTo
   * @return remitTo
  **/
  @Schema(description = "")
  public BOLRequestAccessorialsCodRemitTo getRemitTo() {
    return remitTo;
  }

  public void setRemitTo(BOLRequestAccessorialsCodRemitTo remitTo) {
    this.remitTo = remitTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BOLRequestAccessorialsCod boLRequestAccessorialsCod = (BOLRequestAccessorialsCod) o;
    return Objects.equals(this.amount, boLRequestAccessorialsCod.amount) &&
        Objects.equals(this.terms, boLRequestAccessorialsCod.terms) &&
        Objects.equals(this.customerCheckAcceptable, boLRequestAccessorialsCod.customerCheckAcceptable) &&
        Objects.equals(this.remitTo, boLRequestAccessorialsCod.remitTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, terms, customerCheckAcceptable, remitTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BOLRequestAccessorialsCod {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    customerCheckAcceptable: ").append(toIndentedString(customerCheckAcceptable)).append("\n");
    sb.append("    remitTo: ").append(toIndentedString(remitTo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
