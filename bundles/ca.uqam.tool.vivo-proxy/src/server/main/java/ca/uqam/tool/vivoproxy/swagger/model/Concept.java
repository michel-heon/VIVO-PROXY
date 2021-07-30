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
import ca.uqam.tool.vivoproxy.swagger.model.ConceptLabel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Concept
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-07-29T16:22:48.953-04:00[America/New_York]")public class Concept   {
  @JsonProperty("IRI")
  private String IRI = null;

  @JsonProperty("labels")
  private List<ConceptLabel> labels = new ArrayList<ConceptLabel>();

  public Concept IRI(String IRI) {
    this.IRI = IRI;
    return this;
  }

  /**
   * Get IRI
   * @return IRI
   **/
  @JsonProperty("IRI")
  @Schema(example = "http://purl.org/uqam.ca/vocabulary/expertise#semanticweb", required = true, description = "")
  @NotNull
  public String getIRI() {
    return IRI;
  }

  public void setIRI(String IRI) {
    this.IRI = IRI;
  }

  public Concept labels(List<ConceptLabel> labels) {
    this.labels = labels;
    return this;
  }

  public Concept addLabelsItem(ConceptLabel labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   **/
  @JsonProperty("labels")
  @Schema(required = true, description = "")
  @NotNull
  @Valid
  public List<ConceptLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<ConceptLabel> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Concept concept = (Concept) o;
    return Objects.equals(this.IRI, concept.IRI) &&
        Objects.equals(this.labels, concept.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IRI, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Concept {\n");
    
    sb.append("    IRI: ").append(toIndentedString(IRI)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
