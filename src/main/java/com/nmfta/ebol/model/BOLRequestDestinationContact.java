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
 * Object containing contact details for the destination. 
 */
@Schema(description = "Object containing contact details for the destination. ")

public class BOLRequestDestinationContact {
  @SerializedName("phone")
  private String phone = null;

  @SerializedName("phoneExt")
  private String phoneExt = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  public BOLRequestDestinationContact phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Ten digit phone number, without country code and/or dashes, for the destination location&#x27;s contact person.  Valid Formats: * ########## (10 digits - Area code + phone) 
   * @return phone
  **/
  @Schema(example = "5552226666", required = true, description = "Ten digit phone number, without country code and/or dashes, for the destination location's contact person.  Valid Formats: * ########## (10 digits - Area code + phone) ")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public BOLRequestDestinationContact phoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
    return this;
  }

   /**
   * Phone extensionfor the destination location&#x27;s contact person.
   * @return phoneExt
  **/
  @Schema(example = "99", description = "Phone extensionfor the destination location's contact person.")
  public String getPhoneExt() {
    return phoneExt;
  }

  public void setPhoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
  }

  public BOLRequestDestinationContact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the destination location&#x27;s contact person.
   * @return name
  **/
  @Schema(example = "Jay Pritchett", description = "Name of the destination location's contact person.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BOLRequestDestinationContact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of the destination location&#x27;s contact person.
   * @return email
  **/
  @Schema(example = "jpritchett@closets.com", description = "Email address of the destination location's contact person.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BOLRequestDestinationContact boLRequestDestinationContact = (BOLRequestDestinationContact) o;
    return Objects.equals(this.phone, boLRequestDestinationContact.phone) &&
        Objects.equals(this.phoneExt, boLRequestDestinationContact.phoneExt) &&
        Objects.equals(this.name, boLRequestDestinationContact.name) &&
        Objects.equals(this.email, boLRequestDestinationContact.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, phoneExt, name, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BOLRequestDestinationContact {\n");
    
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneExt: ").append(toIndentedString(phoneExt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
