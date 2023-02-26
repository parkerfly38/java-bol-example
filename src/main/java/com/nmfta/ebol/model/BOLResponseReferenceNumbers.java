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
 * BOLResponseReferenceNumbers
 */


public class BOLResponseReferenceNumbers {
  @SerializedName("pro")
  private String pro = null;

  @SerializedName("shipmentConfirmationNumber")
  private String shipmentConfirmationNumber = null;

  public BOLResponseReferenceNumbers pro(String pro) {
    this.pro = pro;
    return this;
  }

   /**
   * Shipper&#x27;s pre-assigned PRO number for the requested carrier. If one was not provided in the request, one will be auto assigned by the carrier.
   * @return pro
  **/
  @Schema(example = "PRO1234", description = "Shipper's pre-assigned PRO number for the requested carrier. If one was not provided in the request, one will be auto assigned by the carrier.")
  public String getPro() {
    return pro;
  }

  public void setPro(String pro) {
    this.pro = pro;
  }

  public BOLResponseReferenceNumbers shipmentConfirmationNumber(String shipmentConfirmationNumber) {
    this.shipmentConfirmationNumber = shipmentConfirmationNumber;
    return this;
  }

   /**
   * Number provided by the carrier to acknowledge they accepted the BOL.
   * @return shipmentConfirmationNumber
  **/
  @Schema(example = "SCN1234", description = "Number provided by the carrier to acknowledge they accepted the BOL.")
  public String getShipmentConfirmationNumber() {
    return shipmentConfirmationNumber;
  }

  public void setShipmentConfirmationNumber(String shipmentConfirmationNumber) {
    this.shipmentConfirmationNumber = shipmentConfirmationNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BOLResponseReferenceNumbers boLResponseReferenceNumbers = (BOLResponseReferenceNumbers) o;
    return Objects.equals(this.pro, boLResponseReferenceNumbers.pro) &&
        Objects.equals(this.shipmentConfirmationNumber, boLResponseReferenceNumbers.shipmentConfirmationNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pro, shipmentConfirmationNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BOLResponseReferenceNumbers {\n");
    
    sb.append("    pro: ").append(toIndentedString(pro)).append("\n");
    sb.append("    shipmentConfirmationNumber: ").append(toIndentedString(shipmentConfirmationNumber)).append("\n");
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
