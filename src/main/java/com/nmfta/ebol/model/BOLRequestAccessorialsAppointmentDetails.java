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
import com.nmfta.ebol.model.BOLRequestAccessorialsAppointmentDetailsDelivery;
import com.nmfta.ebol.model.BOLRequestAccessorialsAppointmentDetailsPickup;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * BOLRequestAccessorialsAppointmentDetails
 */

public class BOLRequestAccessorialsAppointmentDetails {
  @SerializedName("pickup")
  private BOLRequestAccessorialsAppointmentDetailsPickup pickup = null;

  @SerializedName("delivery")
  private BOLRequestAccessorialsAppointmentDetailsDelivery delivery = null;

  public BOLRequestAccessorialsAppointmentDetails pickup(BOLRequestAccessorialsAppointmentDetailsPickup pickup) {
    this.pickup = pickup;
    return this;
  }

   /**
   * Get pickup
   * @return pickup
  **/
  @Schema(description = "")
  public BOLRequestAccessorialsAppointmentDetailsPickup getPickup() {
    return pickup;
  }

  public void setPickup(BOLRequestAccessorialsAppointmentDetailsPickup pickup) {
    this.pickup = pickup;
  }

  public BOLRequestAccessorialsAppointmentDetails delivery(BOLRequestAccessorialsAppointmentDetailsDelivery delivery) {
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  @Schema(description = "")
  public BOLRequestAccessorialsAppointmentDetailsDelivery getDelivery() {
    return delivery;
  }

  public void setDelivery(BOLRequestAccessorialsAppointmentDetailsDelivery delivery) {
    this.delivery = delivery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BOLRequestAccessorialsAppointmentDetails boLRequestAccessorialsAppointmentDetails = (BOLRequestAccessorialsAppointmentDetails) o;
    return Objects.equals(this.pickup, boLRequestAccessorialsAppointmentDetails.pickup) &&
        Objects.equals(this.delivery, boLRequestAccessorialsAppointmentDetails.delivery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickup, delivery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BOLRequestAccessorialsAppointmentDetails {\n");
    
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
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