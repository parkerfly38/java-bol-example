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
import com.nmfta.ebol.model.BOLRequestAccessorialsAppointmentDetails;
import com.nmfta.ebol.model.BOLRequestAccessorialsCod;
import com.nmfta.ebol.model.BOLRequestAccessorialsExcessLiabilityDetails;
import com.nmfta.ebol.model.BOLRequestAccessorialsHazardousDetails;
import com.nmfta.ebol.model.BOLRequestAccessorialsLimitedAccessType;
import com.nmfta.ebol.model.BOLRequestAccessorialsMarkDetails;
import com.nmfta.ebol.model.BOLRequestAccessorialsSortAndSegregateDetails;
import com.nmfta.ebol.model.BOLRequestAccessorialsTimeCriticalDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * BOLRequestAccessorials
 */

public class BOLRequestAccessorials {
  @SerializedName("codes")
  private List<String> codes = null;

  @SerializedName("hazardousDetails")
  private BOLRequestAccessorialsHazardousDetails hazardousDetails = null;

  @SerializedName("cod")
  private BOLRequestAccessorialsCod cod = null;

  @SerializedName("sortAndSegregateDetails")
  private BOLRequestAccessorialsSortAndSegregateDetails sortAndSegregateDetails = null;

  @SerializedName("excessLiabilityDetails")
  private BOLRequestAccessorialsExcessLiabilityDetails excessLiabilityDetails = null;

  @SerializedName("markDetails")
  private BOLRequestAccessorialsMarkDetails markDetails = null;

  @SerializedName("limitedAccessType")
  private BOLRequestAccessorialsLimitedAccessType limitedAccessType = null;

  @SerializedName("timeCriticalDetails")
  private BOLRequestAccessorialsTimeCriticalDetails timeCriticalDetails = null;

  @SerializedName("appointmentDetails")
  private BOLRequestAccessorialsAppointmentDetails appointmentDetails = null;

  public BOLRequestAccessorials codes(List<String> codes) {
    this.codes = codes;
    return this;
  }

  public BOLRequestAccessorials addCodesItem(String codesItem) {
    if (this.codes == null) {
      this.codes = new ArrayList<String>();
    }
    this.codes.add(codesItem);
    return this;
  }

   /**
   * An array to hold the list of services requested for the shipment\&quot;  Valid Values: See the Accessorial_Codes schema at the bottom of this page. 
   * @return codes
  **/
  @Schema(example = "[\"IDL\",\"LFTP\"]", description = "An array to hold the list of services requested for the shipment\"  Valid Values: See the Accessorial_Codes schema at the bottom of this page. ")
  public List<String> getCodes() {
    return codes;
  }

  public void setCodes(List<String> codes) {
    this.codes = codes;
  }

  public BOLRequestAccessorials hazardousDetails(BOLRequestAccessorialsHazardousDetails hazardousDetails) {
    this.hazardousDetails = hazardousDetails;
    return this;
  }

   /**
   * Get hazardousDetails
   * @return hazardousDetails
  **/
  @Schema(description = "")
  public BOLRequestAccessorialsHazardousDetails getHazardousDetails() {
    return hazardousDetails;
  }

  public void setHazardousDetails(BOLRequestAccessorialsHazardousDetails hazardousDetails) {
    this.hazardousDetails = hazardousDetails;
  }

  public BOLRequestAccessorials cod(BOLRequestAccessorialsCod cod) {
    this.cod = cod;
    return this;
  }

   /**
   * Get cod
   * @return cod
  **/
  @Schema(description = "")
  public BOLRequestAccessorialsCod getCod() {
    return cod;
  }

  public void setCod(BOLRequestAccessorialsCod cod) {
    this.cod = cod;
  }

  public BOLRequestAccessorials sortAndSegregateDetails(BOLRequestAccessorialsSortAndSegregateDetails sortAndSegregateDetails) {
    this.sortAndSegregateDetails = sortAndSegregateDetails;
    return this;
  }

   /**
   * Get sortAndSegregateDetails
   * @return sortAndSegregateDetails
  **/
  @Schema(description = "")
  public BOLRequestAccessorialsSortAndSegregateDetails getSortAndSegregateDetails() {
    return sortAndSegregateDetails;
  }

  public void setSortAndSegregateDetails(BOLRequestAccessorialsSortAndSegregateDetails sortAndSegregateDetails) {
    this.sortAndSegregateDetails = sortAndSegregateDetails;
  }

  public BOLRequestAccessorials excessLiabilityDetails(BOLRequestAccessorialsExcessLiabilityDetails excessLiabilityDetails) {
    this.excessLiabilityDetails = excessLiabilityDetails;
    return this;
  }

   /**
   * Get excessLiabilityDetails
   * @return excessLiabilityDetails
  **/
  @Schema(description = "")
  public BOLRequestAccessorialsExcessLiabilityDetails getExcessLiabilityDetails() {
    return excessLiabilityDetails;
  }

  public void setExcessLiabilityDetails(BOLRequestAccessorialsExcessLiabilityDetails excessLiabilityDetails) {
    this.excessLiabilityDetails = excessLiabilityDetails;
  }

  public BOLRequestAccessorials markDetails(BOLRequestAccessorialsMarkDetails markDetails) {
    this.markDetails = markDetails;
    return this;
  }

   /**
   * Get markDetails
   * @return markDetails
  **/
  @Schema(description = "")
  public BOLRequestAccessorialsMarkDetails getMarkDetails() {
    return markDetails;
  }

  public void setMarkDetails(BOLRequestAccessorialsMarkDetails markDetails) {
    this.markDetails = markDetails;
  }

  public BOLRequestAccessorials limitedAccessType(BOLRequestAccessorialsLimitedAccessType limitedAccessType) {
    this.limitedAccessType = limitedAccessType;
    return this;
  }

   /**
   * Get limitedAccessType
   * @return limitedAccessType
  **/
  @Schema(description = "")
  public BOLRequestAccessorialsLimitedAccessType getLimitedAccessType() {
    return limitedAccessType;
  }

  public void setLimitedAccessType(BOLRequestAccessorialsLimitedAccessType limitedAccessType) {
    this.limitedAccessType = limitedAccessType;
  }

  public BOLRequestAccessorials timeCriticalDetails(BOLRequestAccessorialsTimeCriticalDetails timeCriticalDetails) {
    this.timeCriticalDetails = timeCriticalDetails;
    return this;
  }

   /**
   * Get timeCriticalDetails
   * @return timeCriticalDetails
  **/
  @Schema(description = "")
  public BOLRequestAccessorialsTimeCriticalDetails getTimeCriticalDetails() {
    return timeCriticalDetails;
  }

  public void setTimeCriticalDetails(BOLRequestAccessorialsTimeCriticalDetails timeCriticalDetails) {
    this.timeCriticalDetails = timeCriticalDetails;
  }

  public BOLRequestAccessorials appointmentDetails(BOLRequestAccessorialsAppointmentDetails appointmentDetails) {
    this.appointmentDetails = appointmentDetails;
    return this;
  }

   /**
   * Get appointmentDetails
   * @return appointmentDetails
  **/
  @Schema(description = "")
  public BOLRequestAccessorialsAppointmentDetails getAppointmentDetails() {
    return appointmentDetails;
  }

  public void setAppointmentDetails(BOLRequestAccessorialsAppointmentDetails appointmentDetails) {
    this.appointmentDetails = appointmentDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BOLRequestAccessorials boLRequestAccessorials = (BOLRequestAccessorials) o;
    return Objects.equals(this.codes, boLRequestAccessorials.codes) &&
        Objects.equals(this.hazardousDetails, boLRequestAccessorials.hazardousDetails) &&
        Objects.equals(this.cod, boLRequestAccessorials.cod) &&
        Objects.equals(this.sortAndSegregateDetails, boLRequestAccessorials.sortAndSegregateDetails) &&
        Objects.equals(this.excessLiabilityDetails, boLRequestAccessorials.excessLiabilityDetails) &&
        Objects.equals(this.markDetails, boLRequestAccessorials.markDetails) &&
        Objects.equals(this.limitedAccessType, boLRequestAccessorials.limitedAccessType) &&
        Objects.equals(this.timeCriticalDetails, boLRequestAccessorials.timeCriticalDetails) &&
        Objects.equals(this.appointmentDetails, boLRequestAccessorials.appointmentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codes, hazardousDetails, cod, sortAndSegregateDetails, excessLiabilityDetails, markDetails, limitedAccessType, timeCriticalDetails, appointmentDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BOLRequestAccessorials {\n");
    
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    hazardousDetails: ").append(toIndentedString(hazardousDetails)).append("\n");
    sb.append("    cod: ").append(toIndentedString(cod)).append("\n");
    sb.append("    sortAndSegregateDetails: ").append(toIndentedString(sortAndSegregateDetails)).append("\n");
    sb.append("    excessLiabilityDetails: ").append(toIndentedString(excessLiabilityDetails)).append("\n");
    sb.append("    markDetails: ").append(toIndentedString(markDetails)).append("\n");
    sb.append("    limitedAccessType: ").append(toIndentedString(limitedAccessType)).append("\n");
    sb.append("    timeCriticalDetails: ").append(toIndentedString(timeCriticalDetails)).append("\n");
    sb.append("    appointmentDetails: ").append(toIndentedString(appointmentDetails)).append("\n");
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
