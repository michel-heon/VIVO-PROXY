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

package ca.uqam.tool.vivoproxy.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * AuthorOfADocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-10-23T07:39:42.585-04:00[America/New_York]")public class AuthorOfADocument   {
  @JsonProperty("documentIRI")
  private String documentIRI = null;

  @JsonProperty("personIRI")
  private String personIRI = null;

  public AuthorOfADocument documentIRI(String documentIRI) {
    this.documentIRI = documentIRI;
    return this;
  }

  /**
   * Get documentIRI
   * @return documentIRI
   **/
  @JsonProperty("documentIRI")
  @Schema(example = "http://localhost:8080/vivo/individual/n7440", required = true, description = "")
  @NotNull
  public String getDocumentIRI() {
    return documentIRI;
  }

  public void setDocumentIRI(String documentIRI) {
    this.documentIRI = documentIRI;
  }

  public AuthorOfADocument personIRI(String personIRI) {
    this.personIRI = personIRI;
    return this;
  }

  /**
   * Get personIRI
   * @return personIRI
   **/
  @JsonProperty("personIRI")
  @Schema(example = "http://localhost:8080/vivo/individual/n32", required = true, description = "")
  @NotNull
  public String getPersonIRI() {
    return personIRI;
  }

  public void setPersonIRI(String personIRI) {
    this.personIRI = personIRI;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorOfADocument authorOfADocument = (AuthorOfADocument) o;
    return Objects.equals(this.documentIRI, authorOfADocument.documentIRI) &&
        Objects.equals(this.personIRI, authorOfADocument.personIRI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentIRI, personIRI);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorOfADocument {\n");
    
    sb.append("    documentIRI: ").append(toIndentedString(documentIRI)).append("\n");
    sb.append("    personIRI: ").append(toIndentedString(personIRI)).append("\n");
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
