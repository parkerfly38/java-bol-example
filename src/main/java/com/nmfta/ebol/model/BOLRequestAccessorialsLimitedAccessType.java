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
 * Required when accessorial code LTDAP or LTDAD is present in the accessorial.codes list. 
 */
@Schema(description = "Required when accessorial code LTDAP or LTDAD is present in the accessorial.codes list. ")

public class BOLRequestAccessorialsLimitedAccessType {
  @SerializedName("origin")
  private String origin = null;

  @SerializedName("destination")
  private String destination = null;

  public BOLRequestAccessorialsLimitedAccessType origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Required when accessorial code LTDAP is present in the accessorial.codes list.   Valid Values: See the Limited_Acess_Types schema at the bottom of this page.  
   * @return origin
  **/
  @Schema(example = "Church", description = "Required when accessorial code LTDAP is present in the accessorial.codes list.   Valid Values: See the Limited_Acess_Types schema at the bottom of this page.  ")
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public BOLRequestAccessorialsLimitedAccessType destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Required when accessorial code LTDAD is present in the accessorial.codes list.   Valid Values: See the Limited_Acess_Types schema at the bottom of this page.  
   * @return destination
  **/
  @Schema(example = "Secure", description = "Required when accessorial code LTDAD is present in the accessorial.codes list.   Valid Values: See the Limited_Acess_Types schema at the bottom of this page.  ")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BOLRequestAccessorialsLimitedAccessType boLRequestAccessorialsLimitedAccessType = (BOLRequestAccessorialsLimitedAccessType) o;
    return Objects.equals(this.origin, boLRequestAccessorialsLimitedAccessType.origin) &&
        Objects.equals(this.destination, boLRequestAccessorialsLimitedAccessType.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origin, destination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BOLRequestAccessorialsLimitedAccessType {\n");
    
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
