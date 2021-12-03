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
import ca.uqam.tool.vivoproxy.swagger.model.LinguisticLabel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Organization
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2021-12-03T05:51:13.026-05:00[America/New_York]")public class Organization   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("organizationType")
  private String organizationType = null;

  @JsonProperty("names")
  private List<LinguisticLabel> names = new ArrayList<LinguisticLabel>();

  @JsonProperty("overview")
  private List<LinguisticLabel> overview = null;

  public Organization id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("id")
  @Schema(example = "UQAM", required = true, description = "")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Organization organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

  /**
   * Get organizationType
   * @return organizationType
   **/
  @JsonProperty("organizationType")
  @Schema(example = "http://vivoweb.org/ontology/core#University", required = true, description = "")
  @NotNull
  public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public Organization names(List<LinguisticLabel> names) {
    this.names = names;
    return this;
  }

  public Organization addNamesItem(LinguisticLabel namesItem) {
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
   **/
  @JsonProperty("names")
  @Schema(example = "[{\"label\":\"Université du Québec à Montréal\",\"language\":\"fr-CA\"},{\"label\":\"University Of Québec in Montreal\",\"language\":\"en-US\"}]", required = true, description = "")
  @NotNull
  @Valid
  public List<LinguisticLabel> getNames() {
    return names;
  }

  public void setNames(List<LinguisticLabel> names) {
    this.names = names;
  }

  public Organization overview(List<LinguisticLabel> overview) {
    this.overview = overview;
    return this;
  }

  public Organization addOverviewItem(LinguisticLabel overviewItem) {
    if (this.overview == null) {
      this.overview = new ArrayList<LinguisticLabel>();
    }
    this.overview.add(overviewItem);
    return this;
  }

  /**
   * Get overview
   * @return overview
   **/
  @JsonProperty("overview")
  @Schema(example = "[{\"label\":\"L’Université du Québec à Montréal (UQAM) est une université publique de langue française dont le rayonnement est international. L’originalité et les caractéristiques propres de ses programmes, sa recherche de pointe souvent axée sur les préoccupations sociales ainsi que ses innovations en création ont contribué à bâtir sa renommée.\\nL’université offre de la formation sur le campus montréalais et dans ses campus régionaux situés dans la grande région métropolitaine de Montréal.\",\"language\":\"fr-CA\"},{\"label\":\"The Université du Québec à Montréal (UQAM) is a French-language public university with an international reputation. The originality and specific characteristics of its programs, its cutting-edge research often focused on social concerns, and its creative innovations have helped build its reputation.\\nThe university offers training on the Montreal campus and on its regional campuses located in the greater Montreal area.\",\"language\":\"en-US\"},{\"label\":\"The Université du Québec à Montréal (UQAM) is a French-language public university with an international reputation. The originality and specific characteristics of its programs, its cutting-edge research often focused on social concerns, and its creative innovations have helped build its reputation.\\nThe university offers training on the Montreal campus and on its regional campuses located in the greater Montreal area.\",\"language\":\"en-CA\"}]", description = "")
  @Valid
  public List<LinguisticLabel> getOverview() {
    return overview;
  }

  public void setOverview(List<LinguisticLabel> overview) {
    this.overview = overview;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.id, organization.id) &&
        Objects.equals(this.organizationType, organization.organizationType) &&
        Objects.equals(this.names, organization.names) &&
        Objects.equals(this.overview, organization.overview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationType, names, overview);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
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
