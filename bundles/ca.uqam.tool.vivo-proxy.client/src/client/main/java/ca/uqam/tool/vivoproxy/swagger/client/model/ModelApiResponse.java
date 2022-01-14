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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ModelApiResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-01-14T06:04:56.236-05:00[America/New_York]")
public class ModelApiResponse {
  @SerializedName("code")
  private Integer code = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("apiMessage")
  private String apiMessage = null;

  @SerializedName("IRI-value")
  private String irIValue = null;

  @SerializedName("VivoMessage")
  private String vivoMessage = null;

  public ModelApiResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Proxy return code
   * @return code
  **/
  @Schema(description = "Proxy return code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ModelApiResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Proxy return type code
   * @return type
  **/
  @Schema(description = "Proxy return type code")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ModelApiResponse apiMessage(String apiMessage) {
    this.apiMessage = apiMessage;
    return this;
  }

   /**
   * Proxy return message
   * @return apiMessage
  **/
  @Schema(description = "Proxy return message")
  public String getApiMessage() {
    return apiMessage;
  }

  public void setApiMessage(String apiMessage) {
    this.apiMessage = apiMessage;
  }

  public ModelApiResponse irIValue(String irIValue) {
    this.irIValue = irIValue;
    return this;
  }

   /**
   * The subject IRI of the created statement
   * @return irIValue
  **/
  @Schema(example = "http://localhost:8080/vivo/individual/n774", description = "The subject IRI of the created statement")
  public String getIrIValue() {
    return irIValue;
  }

  public void setIrIValue(String irIValue) {
    this.irIValue = irIValue;
  }

  public ModelApiResponse vivoMessage(String vivoMessage) {
    this.vivoMessage = vivoMessage;
    return this;
  }

   /**
   * The transaction message transmitted by the VIVO server
   * @return vivoMessage
  **/
  @Schema(example = "<H1>200 SPARQL update accepted.</H1>", description = "The transaction message transmitted by the VIVO server")
  public String getVivoMessage() {
    return vivoMessage;
  }

  public void setVivoMessage(String vivoMessage) {
    this.vivoMessage = vivoMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelApiResponse _apiResponse = (ModelApiResponse) o;
    return Objects.equals(this.code, _apiResponse.code) &&
        Objects.equals(this.type, _apiResponse.type) &&
        Objects.equals(this.apiMessage, _apiResponse.apiMessage) &&
        Objects.equals(this.irIValue, _apiResponse.irIValue) &&
        Objects.equals(this.vivoMessage, _apiResponse.vivoMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, apiMessage, irIValue, vivoMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    apiMessage: ").append(toIndentedString(apiMessage)).append("\n");
    sb.append("    irIValue: ").append(toIndentedString(irIValue)).append("\n");
    sb.append("    vivoMessage: ").append(toIndentedString(vivoMessage)).append("\n");
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
