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
import com.nmfta.ebol.model.BOLRequestAccessorialsTimeCriticalDetailsDate;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BOLRequestAccessorialsTimeCriticalDetails
 */


public class BOLRequestAccessorialsTimeCriticalDetails {
  @SerializedName("type")
  private String type = null;

  @SerializedName("date")
  private BOLRequestAccessorialsTimeCriticalDetailsDate date = null;

  public BOLRequestAccessorialsTimeCriticalDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of delivery required for the requested Time Critical Service.  Required when accessorials.code list include TCS.  Valid Values: See the Time_Critical_Types schema at the bottom of this page. 
   * @return type
  **/
  @Schema(example = "Delivery Window", description = "Type of delivery required for the requested Time Critical Service.  Required when accessorials.code list include TCS.  Valid Values: See the Time_Critical_Types schema at the bottom of this page. ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BOLRequestAccessorialsTimeCriticalDetails date(BOLRequestAccessorialsTimeCriticalDetailsDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public BOLRequestAccessorialsTimeCriticalDetailsDate getDate() {
    return date;
  }

  public void setDate(BOLRequestAccessorialsTimeCriticalDetailsDate date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BOLRequestAccessorialsTimeCriticalDetails boLRequestAccessorialsTimeCriticalDetails = (BOLRequestAccessorialsTimeCriticalDetails) o;
    return Objects.equals(this.type, boLRequestAccessorialsTimeCriticalDetails.type) &&
        Objects.equals(this.date, boLRequestAccessorialsTimeCriticalDetails.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BOLRequestAccessorialsTimeCriticalDetails {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
