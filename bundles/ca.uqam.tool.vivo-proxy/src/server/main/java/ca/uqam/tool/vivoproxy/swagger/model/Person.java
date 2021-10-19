/*
 * VIVO Proxy API
 * Proxy API for VIVO Data Manipulation
 *
 * OpenAPI spec version: 1.0.0 - 2021-10-07
 * Contact: vivo@uqam.ca
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ca.uqam.tool.vivoproxy.swagger.model;

import java.util.Objects;
import ca.uqam.tool.vivoproxy.swagger.model.LinguisticLabel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Person
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-10-19T03:59:19.892-04:00[America/New_York]")public class Person   {
  @JsonProperty("personType")
  private String personType = null;

  @JsonProperty("firstName")
  private List<LinguisticLabel> firstName = new ArrayList<LinguisticLabel>();

  @JsonProperty("lastName")
  private List<LinguisticLabel> lastName = new ArrayList<LinguisticLabel>();

  public Person personType(String personType) {
    this.personType = personType;
    return this;
  }

  /**
   * Get personType
   * @return personType
   **/
  @JsonProperty("personType")
  @Schema(example = "http://vivoweb.org/ontology/core#FacultyMember", required = true, description = "")
  @NotNull
  public String getPersonType() {
    return personType;
  }

  public void setPersonType(String personType) {
    this.personType = personType;
  }

  public Person firstName(List<LinguisticLabel> firstName) {
    this.firstName = firstName;
    return this;
  }

  public Person addFirstNameItem(LinguisticLabel firstNameItem) {
    this.firstName.add(firstNameItem);
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @JsonProperty("firstName")
  @Schema(example = "[{\"label\":\"Peter\",\"language\":\"fr-CA\"},{\"label\":\"Peter\",\"language\":\"en-US\"}]", required = true, description = "")
  @NotNull
  @Valid
  public List<LinguisticLabel> getFirstName() {
    return firstName;
  }

  public void setFirstName(List<LinguisticLabel> firstName) {
    this.firstName = firstName;
  }

  public Person lastName(List<LinguisticLabel> lastName) {
    this.lastName = lastName;
    return this;
  }

  public Person addLastNameItem(LinguisticLabel lastNameItem) {
    this.lastName.add(lastNameItem);
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  @JsonProperty("lastName")
  @Schema(example = "[{\"label\":\"Jasper\",\"language\":\"fr-CA\"},{\"label\":\"Jasper\",\"language\":\"en-US\"}]", required = true, description = "")
  @NotNull
  @Valid
  public List<LinguisticLabel> getLastName() {
    return lastName;
  }

  public void setLastName(List<LinguisticLabel> lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.personType, person.personType) &&
        Objects.equals(this.firstName, person.firstName) &&
        Objects.equals(this.lastName, person.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personType, firstName, lastName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    personType: ").append(toIndentedString(personType)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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
