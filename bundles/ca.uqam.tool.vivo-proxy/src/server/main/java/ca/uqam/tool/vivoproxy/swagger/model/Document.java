/*
 * VIVO Proxy API
 * Proxy API for VIVO Data Manipulation
 *
 * OpenAPI spec version: 1.0.0
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
 * Document
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-09-07T12:17:12.241-04:00[America/New_York]")public class Document   {
  @JsonProperty("docTypeIRI")
  private String docTypeIRI = null;

  @JsonProperty("title")
  private String title = null;

  public Document docTypeIRI(String docTypeIRI) {
    this.docTypeIRI = docTypeIRI;
    return this;
  }

  /**
   * Get docTypeIRI
   * @return docTypeIRI
   **/
  @JsonProperty("docTypeIRI")
  @Schema(example = "http://vivoweb.org/ontology/core#ConferencePaper", required = true, description = "")
  @NotNull
  public String getDocTypeIRI() {
    return docTypeIRI;
  }

  public void setDocTypeIRI(String docTypeIRI) {
    this.docTypeIRI = docTypeIRI;
  }

  public Document title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @JsonProperty("title")
  @Schema(example = "Les écrans, des machines de vision", required = true, description = "")
  @NotNull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.docTypeIRI, document.docTypeIRI) &&
        Objects.equals(this.title, document.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docTypeIRI, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    docTypeIRI: ").append(toIndentedString(docTypeIRI)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
