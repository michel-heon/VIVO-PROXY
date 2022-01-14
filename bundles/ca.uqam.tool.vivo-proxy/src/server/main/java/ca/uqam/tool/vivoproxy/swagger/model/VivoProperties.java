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
 * Required properties for vivo-proxy to connect to a VIVO instance
 */
@Schema(description = "Required properties for vivo-proxy to connect to a VIVO instance")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2022-01-14T03:45:37.393-05:00[America/New_York]")public class VivoProperties   {
  @JsonProperty("vivo-URL")
  private String vivoURL = null;

  @JsonProperty("sparql-query-URL")
  private String sparqlQueryURL = null;

  @JsonProperty("sparql-update-URL")
  private String sparqlUpdateURL = null;

  @JsonProperty("VIVO-admin-login")
  private String viVOAdminLogin = null;

  @JsonProperty("VIVO-admin-password")
  private String viVOAdminPassword = null;

  public VivoProperties vivoURL(String vivoURL) {
    this.vivoURL = vivoURL;
    return this;
  }

  /**
   * Remote VIVO URL
   * @return vivoURL
   **/
  @JsonProperty("vivo-URL")
  @Schema(example = "http://vivo-uqam.ca-central-1.elasticbeanstalk.com/#", description = "Remote VIVO URL")
  public String getVivoURL() {
    return vivoURL;
  }

  public void setVivoURL(String vivoURL) {
    this.vivoURL = vivoURL;
  }

  public VivoProperties sparqlQueryURL(String sparqlQueryURL) {
    this.sparqlQueryURL = sparqlQueryURL;
    return this;
  }

  /**
   * Remote SPARQL endPoint for query
   * @return sparqlQueryURL
   **/
  @JsonProperty("sparql-query-URL")
  @Schema(example = "https://vivo-demo-db.cluster-c2o1sdzzfasi.ca-central-1.neptune.amazonaws.com:8182/sparql", description = "Remote SPARQL endPoint for query")
  public String getSparqlQueryURL() {
    return sparqlQueryURL;
  }

  public void setSparqlQueryURL(String sparqlQueryURL) {
    this.sparqlQueryURL = sparqlQueryURL;
  }

  public VivoProperties sparqlUpdateURL(String sparqlUpdateURL) {
    this.sparqlUpdateURL = sparqlUpdateURL;
    return this;
  }

  /**
   * Remote SPARQL endPoint for update
   * @return sparqlUpdateURL
   **/
  @JsonProperty("sparql-update-URL")
  @Schema(example = "https://vivo-demo-db.cluster-c2o1sdzzfasi.ca-central-1.neptune.amazonaws.com:8182/sparql", description = "Remote SPARQL endPoint for update")
  public String getSparqlUpdateURL() {
    return sparqlUpdateURL;
  }

  public void setSparqlUpdateURL(String sparqlUpdateURL) {
    this.sparqlUpdateURL = sparqlUpdateURL;
  }

  public VivoProperties viVOAdminLogin(String viVOAdminLogin) {
    this.viVOAdminLogin = viVOAdminLogin;
    return this;
  }

  /**
   * Login name for VIVO admin (root)
   * @return viVOAdminLogin
   **/
  @JsonProperty("VIVO-admin-login")
  @Schema(example = "vivo@uqam.ca", description = "Login name for VIVO admin (root)")
  public String getViVOAdminLogin() {
    return viVOAdminLogin;
  }

  public void setViVOAdminLogin(String viVOAdminLogin) {
    this.viVOAdminLogin = viVOAdminLogin;
  }

  public VivoProperties viVOAdminPassword(String viVOAdminPassword) {
    this.viVOAdminPassword = viVOAdminPassword;
    return this;
  }

  /**
   * Password used by VIVO admin (root)
   * @return viVOAdminPassword
   **/
  @JsonProperty("VIVO-admin-password")
  @Schema(example = "Vivo1234.", description = "Password used by VIVO admin (root)")
  public String getViVOAdminPassword() {
    return viVOAdminPassword;
  }

  public void setViVOAdminPassword(String viVOAdminPassword) {
    this.viVOAdminPassword = viVOAdminPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VivoProperties vivoProperties = (VivoProperties) o;
    return Objects.equals(this.vivoURL, vivoProperties.vivoURL) &&
        Objects.equals(this.sparqlQueryURL, vivoProperties.sparqlQueryURL) &&
        Objects.equals(this.sparqlUpdateURL, vivoProperties.sparqlUpdateURL) &&
        Objects.equals(this.viVOAdminLogin, vivoProperties.viVOAdminLogin) &&
        Objects.equals(this.viVOAdminPassword, vivoProperties.viVOAdminPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vivoURL, sparqlQueryURL, sparqlUpdateURL, viVOAdminLogin, viVOAdminPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VivoProperties {\n");
    
    sb.append("    vivoURL: ").append(toIndentedString(vivoURL)).append("\n");
    sb.append("    sparqlQueryURL: ").append(toIndentedString(sparqlQueryURL)).append("\n");
    sb.append("    sparqlUpdateURL: ").append(toIndentedString(sparqlUpdateURL)).append("\n");
    sb.append("    viVOAdminLogin: ").append(toIndentedString(viVOAdminLogin)).append("\n");
    sb.append("    viVOAdminPassword: ").append(toIndentedString(viVOAdminPassword)).append("\n");
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