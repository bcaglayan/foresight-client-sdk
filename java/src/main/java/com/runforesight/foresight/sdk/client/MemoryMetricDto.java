/*
 * Foresight Private REST API
 * \"Foresight Private REST API for clients\"
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: info@runforesight.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.runforesight.foresight.sdk.client;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MemoryMetricDto
 */
@JsonPropertyOrder({
  MemoryMetricDto.JSON_PROPERTY_MEMORY_USAGE_ACTIVE,
  MemoryMetricDto.JSON_PROPERTY_MEMORY_USAGE_AVAILABLE,
  MemoryMetricDto.JSON_PROPERTY_MEMORY_USAGE_TOTAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-04T13:57:04.869044Z[Etc/UTC]")
public class MemoryMetricDto {
  public static final String JSON_PROPERTY_MEMORY_USAGE_ACTIVE = "memoryUsageActive";
  private Double memoryUsageActive;

  public static final String JSON_PROPERTY_MEMORY_USAGE_AVAILABLE = "memoryUsageAvailable";
  private Double memoryUsageAvailable;

  public static final String JSON_PROPERTY_MEMORY_USAGE_TOTAL = "memoryUsageTotal";
  private Double memoryUsageTotal;

  public MemoryMetricDto() {
  }

  public MemoryMetricDto memoryUsageActive(Double memoryUsageActive) {
    
    this.memoryUsageActive = memoryUsageActive;
    return this;
  }

   /**
   * Get memoryUsageActive
   * @return memoryUsageActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMORY_USAGE_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMemoryUsageActive() {
    return memoryUsageActive;
  }


  @JsonProperty(JSON_PROPERTY_MEMORY_USAGE_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemoryUsageActive(Double memoryUsageActive) {
    this.memoryUsageActive = memoryUsageActive;
  }


  public MemoryMetricDto memoryUsageAvailable(Double memoryUsageAvailable) {
    
    this.memoryUsageAvailable = memoryUsageAvailable;
    return this;
  }

   /**
   * Get memoryUsageAvailable
   * @return memoryUsageAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMORY_USAGE_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMemoryUsageAvailable() {
    return memoryUsageAvailable;
  }


  @JsonProperty(JSON_PROPERTY_MEMORY_USAGE_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemoryUsageAvailable(Double memoryUsageAvailable) {
    this.memoryUsageAvailable = memoryUsageAvailable;
  }


  public MemoryMetricDto memoryUsageTotal(Double memoryUsageTotal) {
    
    this.memoryUsageTotal = memoryUsageTotal;
    return this;
  }

   /**
   * Get memoryUsageTotal
   * @return memoryUsageTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMORY_USAGE_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getMemoryUsageTotal() {
    return memoryUsageTotal;
  }


  @JsonProperty(JSON_PROPERTY_MEMORY_USAGE_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemoryUsageTotal(Double memoryUsageTotal) {
    this.memoryUsageTotal = memoryUsageTotal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemoryMetricDto memoryMetricDto = (MemoryMetricDto) o;
    return Objects.equals(this.memoryUsageActive, memoryMetricDto.memoryUsageActive) &&
        Objects.equals(this.memoryUsageAvailable, memoryMetricDto.memoryUsageAvailable) &&
        Objects.equals(this.memoryUsageTotal, memoryMetricDto.memoryUsageTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memoryUsageActive, memoryUsageAvailable, memoryUsageTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemoryMetricDto {\n");
    sb.append("    memoryUsageActive: ").append(toIndentedString(memoryUsageActive)).append("\n");
    sb.append("    memoryUsageAvailable: ").append(toIndentedString(memoryUsageAvailable)).append("\n");
    sb.append("    memoryUsageTotal: ").append(toIndentedString(memoryUsageTotal)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

