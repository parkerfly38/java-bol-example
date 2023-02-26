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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BOLRequestBol
 */


public class BOLRequestBol {
  @SerializedName("date")
  private String date = null;

  @SerializedName("function")
  private String function = null;

  @SerializedName("isTest")
  private Boolean isTest = null;

  @SerializedName("requestorRole")
  private String requestorRole = null;

  @SerializedName("specialInstructions")
  private String specialInstructions = null;

  public BOLRequestBol date(String date) {
    this.date = date;
    return this;
  }

   /**
   * The date associated with the creation of the bill of lading, which is typically displayed on the actual paper bill of lading.  Valid Formats: * YYYY-MM-DDTHH:mm:ss.sss (ISO 8601) 
   * @return date
  **/
  @Schema(example = "2021-05-20T00:00:00.000", required = true, description = "The date associated with the creation of the bill of lading, which is typically displayed on the actual paper bill of lading.  Valid Formats: * YYYY-MM-DDTHH:mm:ss.sss (ISO 8601) ")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public BOLRequestBol function(String function) {
    this.function = function;
    return this;
  }

   /**
   * The intent for the submitted request.  Valid Values: * Create - Used for initial creation 
   * @return function
  **/
  @Schema(example = "Create", required = true, description = "The intent for the submitted request.  Valid Values: * Create - Used for initial creation ")
  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public BOLRequestBol isTest(Boolean isTest) {
    this.isTest = isTest;
    return this;
  }

   /**
   * Indicates whether or not the submitted request is intended to be a test or not.
   * @return isTest
  **/
  @Schema(example = "true", required = true, description = "Indicates whether or not the submitted request is intended to be a test or not.")
  public Boolean isIsTest() {
    return isTest;
  }

  public void setIsTest(Boolean isTest) {
    this.isTest = isTest;
  }

  public BOLRequestBol requestorRole(String requestorRole) {
    this.requestorRole = requestorRole;
    return this;
  }

   /**
   * Identifies the party making the request.  Valid Values: See Requestor_Roles schema at the bottom of this page. 
   * @return requestorRole
  **/
  @Schema(example = "Third Party", required = true, description = "Identifies the party making the request.  Valid Values: See Requestor_Roles schema at the bottom of this page. ")
  public String getRequestorRole() {
    return requestorRole;
  }

  public void setRequestorRole(String requestorRole) {
    this.requestorRole = requestorRole;
  }

  public BOLRequestBol specialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
    return this;
  }

   /**
   * Special delivery instructions that need to be followed for the shipment&#x27;s delivery.
   * @return specialInstructions
  **/
  @Schema(example = "Gate code 123 to enter complex", description = "Special delivery instructions that need to be followed for the shipment's delivery.")
  public String getSpecialInstructions() {
    return specialInstructions;
  }

  public void setSpecialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BOLRequestBol boLRequestBol = (BOLRequestBol) o;
    return Objects.equals(this.date, boLRequestBol.date) &&
        Objects.equals(this.function, boLRequestBol.function) &&
        Objects.equals(this.isTest, boLRequestBol.isTest) &&
        Objects.equals(this.requestorRole, boLRequestBol.requestorRole) &&
        Objects.equals(this.specialInstructions, boLRequestBol.specialInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, function, isTest, requestorRole, specialInstructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BOLRequestBol {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    isTest: ").append(toIndentedString(isTest)).append("\n");
    sb.append("    requestorRole: ").append(toIndentedString(requestorRole)).append("\n");
    sb.append("    specialInstructions: ").append(toIndentedString(specialInstructions)).append("\n");
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
