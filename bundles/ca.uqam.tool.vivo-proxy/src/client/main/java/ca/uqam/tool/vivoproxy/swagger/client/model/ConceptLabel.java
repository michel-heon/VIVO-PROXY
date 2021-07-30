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

package ca.uqam.tool.vivoproxy.swagger.client.model;

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
 * ConceptLabel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-30T09:54:09.424-04:00[America/New_York]")
public class ConceptLabel {
  @SerializedName("label")
  private String label = null;

  @SerializedName("language")
  private String language = null;

  public ConceptLabel label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @Schema(example = "semantic web", required = true, description = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ConceptLabel language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Using the &#x27;Language Tags and Locale Identifiers for the World Wide Web&#x27; defined at https://www.w3.org/TR/ltli/ for this field
   * @return language
  **/
  @Schema(example = "en-US", required = true, description = "Using the 'Language Tags and Locale Identifiers for the World Wide Web' defined at https://www.w3.org/TR/ltli/ for this field")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConceptLabel conceptLabel = (ConceptLabel) o;
    return Objects.equals(this.label, conceptLabel.label) &&
        Objects.equals(this.language, conceptLabel.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptLabel {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
