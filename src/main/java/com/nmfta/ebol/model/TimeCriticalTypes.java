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
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Valid Values:   * Deliver On Date - Freight can only be delivered on the specified start date.   * Deliver On or After Date - Freight can only be delivered on or after the specified start date.   * Deliver By Date - Freight can only be delivered up to, and including, the specified start date.   * Delivery Window - Freight can only be delivered between the specified start and end dates. 
 */
@Schema(description = "Valid Values:   * Deliver On Date - Freight can only be delivered on the specified start date.   * Deliver On or After Date - Freight can only be delivered on or after the specified start date.   * Deliver By Date - Freight can only be delivered up to, and including, the specified start date.   * Delivery Window - Freight can only be delivered between the specified start and end dates. ")

public class TimeCriticalTypes {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeCriticalTypes {\n");
    
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