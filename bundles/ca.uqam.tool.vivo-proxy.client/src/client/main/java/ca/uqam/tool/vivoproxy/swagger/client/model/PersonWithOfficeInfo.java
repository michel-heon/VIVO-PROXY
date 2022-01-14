/*
 * VIVO Proxy API
 * Proxy API for VIVO Data Manipulation
 *
 * OpenAPI spec version: 1.0.0 - 2021-10-23
 * Contact: vivo@uqam.ca
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ca.uqam.tool.vivoproxy.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ca.uqam.tool.vivoproxy.swagger.client.model.AddressSchema;
import ca.uqam.tool.vivoproxy.swagger.client.model.LinguisticLabel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PersonWithOfficeInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-01-14T06:04:56.236-05:00[America/New_York]")
public class PersonWithOfficeInfo {
  @SerializedName("personType")
  private String personType = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("displayName")
  private List<LinguisticLabel> displayName = null;

  @SerializedName("firstName")
  private List<LinguisticLabel> firstName = new ArrayList<LinguisticLabel>();

  @SerializedName("lastName")
  private List<LinguisticLabel> lastName = new ArrayList<LinguisticLabel>();

  @SerializedName("title")
  private List<LinguisticLabel> title = null;

  @SerializedName("secondaryTitle")
  private List<LinguisticLabel> secondaryTitle = null;

  @SerializedName("eMail")
  private String eMail = null;

  @SerializedName("secondaryMails")
  private List<String> secondaryMails = null;

  @SerializedName("telephone")
  private String telephone = null;

  @SerializedName("organization-unit-id")
  private String organizationUnitId = null;

  @SerializedName("address")
  private List<AddressSchema> address = null;

  public PersonWithOfficeInfo personType(String personType) {
    this.personType = personType;
    return this;
  }

   /**
   * Get personType
   * @return personType
  **/
  @Schema(example = "http://vivoweb.org/ontology/core#FacultyMember", required = true, description = "")
  public String getPersonType() {
    return personType;
  }

  public void setPersonType(String personType) {
    this.personType = personType;
  }

  public PersonWithOfficeInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * id of person
   * @return id
  **/
  @Schema(example = "SOME_ID", description = "id of person")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PersonWithOfficeInfo displayName(List<LinguisticLabel> displayName) {
    this.displayName = displayName;
    return this;
  }

  public PersonWithOfficeInfo addDisplayNameItem(LinguisticLabel displayNameItem) {
    if (this.displayName == null) {
      this.displayName = new ArrayList<LinguisticLabel>();
    }
    this.displayName.add(displayNameItem);
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(example = "[{\"label\":\"Peter Jasper\",\"language\":\"fr-CA\"},{\"label\":\"Peter Jasper\",\"language\":\"en-US\"}]", description = "")
  public List<LinguisticLabel> getDisplayName() {
    return displayName;
  }

  public void setDisplayName(List<LinguisticLabel> displayName) {
    this.displayName = displayName;
  }

  public PersonWithOfficeInfo firstName(List<LinguisticLabel> firstName) {
    this.firstName = firstName;
    return this;
  }

  public PersonWithOfficeInfo addFirstNameItem(LinguisticLabel firstNameItem) {
    this.firstName.add(firstNameItem);
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @Schema(example = "[{\"label\":\"Peter\",\"language\":\"fr-CA\"},{\"label\":\"Peter\",\"language\":\"en-US\"}]", required = true, description = "")
  public List<LinguisticLabel> getFirstName() {
    return firstName;
  }

  public void setFirstName(List<LinguisticLabel> firstName) {
    this.firstName = firstName;
  }

  public PersonWithOfficeInfo lastName(List<LinguisticLabel> lastName) {
    this.lastName = lastName;
    return this;
  }

  public PersonWithOfficeInfo addLastNameItem(LinguisticLabel lastNameItem) {
    this.lastName.add(lastNameItem);
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @Schema(example = "[{\"label\":\"Jasper\",\"language\":\"fr-CA\"},{\"label\":\"Jasper\",\"language\":\"en-US\"}]", required = true, description = "")
  public List<LinguisticLabel> getLastName() {
    return lastName;
  }

  public void setLastName(List<LinguisticLabel> lastName) {
    this.lastName = lastName;
  }

  public PersonWithOfficeInfo title(List<LinguisticLabel> title) {
    this.title = title;
    return this;
  }

  public PersonWithOfficeInfo addTitleItem(LinguisticLabel titleItem) {
    if (this.title == null) {
      this.title = new ArrayList<LinguisticLabel>();
    }
    this.title.add(titleItem);
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(example = "[{\"label\":\"Professeur\",\"language\":\"fr-CA\"},{\"label\":\"Professor\",\"language\":\"en-US\"}]", description = "")
  public List<LinguisticLabel> getTitle() {
    return title;
  }

  public void setTitle(List<LinguisticLabel> title) {
    this.title = title;
  }

  public PersonWithOfficeInfo secondaryTitle(List<LinguisticLabel> secondaryTitle) {
    this.secondaryTitle = secondaryTitle;
    return this;
  }

  public PersonWithOfficeInfo addSecondaryTitleItem(LinguisticLabel secondaryTitleItem) {
    if (this.secondaryTitle == null) {
      this.secondaryTitle = new ArrayList<LinguisticLabel>();
    }
    this.secondaryTitle.add(secondaryTitleItem);
    return this;
  }

   /**
   * Other useful title
   * @return secondaryTitle
  **/
  @Schema(description = "Other useful title")
  public List<LinguisticLabel> getSecondaryTitle() {
    return secondaryTitle;
  }

  public void setSecondaryTitle(List<LinguisticLabel> secondaryTitle) {
    this.secondaryTitle = secondaryTitle;
  }

  public PersonWithOfficeInfo eMail(String eMail) {
    this.eMail = eMail;
    return this;
  }

   /**
   * principal email that is used has key
   * @return eMail
  **/
  @Schema(example = "jasper.peter@example.org", required = true, description = "principal email that is used has key")
  public String getEMail() {
    return eMail;
  }

  public void setEMail(String eMail) {
    this.eMail = eMail;
  }

  public PersonWithOfficeInfo secondaryMails(List<String> secondaryMails) {
    this.secondaryMails = secondaryMails;
    return this;
  }

  public PersonWithOfficeInfo addSecondaryMailsItem(String secondaryMailsItem) {
    if (this.secondaryMails == null) {
      this.secondaryMails = new ArrayList<String>();
    }
    this.secondaryMails.add(secondaryMailsItem);
    return this;
  }

   /**
   * Other useful emails
   * @return secondaryMails
  **/
  @Schema(example = "[\"jaspers2.peter@example.org\",\"jaspers3.peter@example.org\"]", description = "Other useful emails")
  public List<String> getSecondaryMails() {
    return secondaryMails;
  }

  public void setSecondaryMails(List<String> secondaryMails) {
    this.secondaryMails = secondaryMails;
  }

  public PersonWithOfficeInfo telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

   /**
   * telephone number
   * @return telephone
  **/
  @Schema(example = "+1 (514) 987-3000 ext. 0000", description = "telephone number")
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public PersonWithOfficeInfo organizationUnitId(String organizationUnitId) {
    this.organizationUnitId = organizationUnitId;
    return this;
  }

   /**
   * id of organization unit
   * @return organizationUnitId
  **/
  @Schema(example = "6010", description = "id of organization unit")
  public String getOrganizationUnitId() {
    return organizationUnitId;
  }

  public void setOrganizationUnitId(String organizationUnitId) {
    this.organizationUnitId = organizationUnitId;
  }

  public PersonWithOfficeInfo address(List<AddressSchema> address) {
    this.address = address;
    return this;
  }

  public PersonWithOfficeInfo addAddressItem(AddressSchema addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<AddressSchema>();
    }
    this.address.add(addressItem);
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public List<AddressSchema> getAddress() {
    return address;
  }

  public void setAddress(List<AddressSchema> address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonWithOfficeInfo personWithOfficeInfo = (PersonWithOfficeInfo) o;
    return Objects.equals(this.personType, personWithOfficeInfo.personType) &&
        Objects.equals(this.id, personWithOfficeInfo.id) &&
        Objects.equals(this.displayName, personWithOfficeInfo.displayName) &&
        Objects.equals(this.firstName, personWithOfficeInfo.firstName) &&
        Objects.equals(this.lastName, personWithOfficeInfo.lastName) &&
        Objects.equals(this.title, personWithOfficeInfo.title) &&
        Objects.equals(this.secondaryTitle, personWithOfficeInfo.secondaryTitle) &&
        Objects.equals(this.eMail, personWithOfficeInfo.eMail) &&
        Objects.equals(this.secondaryMails, personWithOfficeInfo.secondaryMails) &&
        Objects.equals(this.telephone, personWithOfficeInfo.telephone) &&
        Objects.equals(this.organizationUnitId, personWithOfficeInfo.organizationUnitId) &&
        Objects.equals(this.address, personWithOfficeInfo.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personType, id, displayName, firstName, lastName, title, secondaryTitle, eMail, secondaryMails, telephone, organizationUnitId, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonWithOfficeInfo {\n");
    
    sb.append("    personType: ").append(toIndentedString(personType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    secondaryTitle: ").append(toIndentedString(secondaryTitle)).append("\n");
    sb.append("    eMail: ").append(toIndentedString(eMail)).append("\n");
    sb.append("    secondaryMails: ").append(toIndentedString(secondaryMails)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    organizationUnitId: ").append(toIndentedString(organizationUnitId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
