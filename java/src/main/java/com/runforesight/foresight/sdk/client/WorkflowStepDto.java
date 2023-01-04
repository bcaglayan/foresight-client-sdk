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
 * WorkflowStepDto
 */
@JsonPropertyOrder({
  WorkflowStepDto.JSON_PROPERTY_COMPLETED_AT,
  WorkflowStepDto.JSON_PROPERTY_CONCLUSION,
  WorkflowStepDto.JSON_PROPERTY_DURATION,
  WorkflowStepDto.JSON_PROPERTY_ID,
  WorkflowStepDto.JSON_PROPERTY_NAME,
  WorkflowStepDto.JSON_PROPERTY_NUMBER,
  WorkflowStepDto.JSON_PROPERTY_STARTED_AT,
  WorkflowStepDto.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-04T13:57:04.869044Z[Etc/UTC]")
public class WorkflowStepDto {
  public static final String JSON_PROPERTY_COMPLETED_AT = "completedAt";
  private Long completedAt;

  /**
   * Gets or Sets conclusion
   */
  public enum ConclusionEnum {
    ACTION_REQUIRED("ACTION_REQUIRED"),
    
    CANCELLED("CANCELLED"),
    
    FAILURE("FAILURE"),
    
    NEUTRAL("NEUTRAL"),
    
    SUCCESS("SUCCESS"),
    
    SKIPPED("SKIPPED"),
    
    STALE("STALE"),
    
    TIMED_OUT("TIMED_OUT"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    ConclusionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConclusionEnum fromValue(String value) {
      for (ConclusionEnum b : ConclusionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONCLUSION = "conclusion";
  private ConclusionEnum conclusion;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private Long number;

  public static final String JSON_PROPERTY_STARTED_AT = "startedAt";
  private Long startedAt;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    COMPLETED("COMPLETED"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public WorkflowStepDto() {
  }

  public WorkflowStepDto completedAt(Long completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCompletedAt() {
    return completedAt;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletedAt(Long completedAt) {
    this.completedAt = completedAt;
  }


  public WorkflowStepDto conclusion(ConclusionEnum conclusion) {
    
    this.conclusion = conclusion;
    return this;
  }

   /**
   * Get conclusion
   * @return conclusion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONCLUSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConclusionEnum getConclusion() {
    return conclusion;
  }


  @JsonProperty(JSON_PROPERTY_CONCLUSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConclusion(ConclusionEnum conclusion) {
    this.conclusion = conclusion;
  }


  public WorkflowStepDto duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public WorkflowStepDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public WorkflowStepDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public WorkflowStepDto number(Long number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(Long number) {
    this.number = number;
  }


  public WorkflowStepDto startedAt(Long startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartedAt() {
    return startedAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartedAt(Long startedAt) {
    this.startedAt = startedAt;
  }


  public WorkflowStepDto status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStepDto workflowStepDto = (WorkflowStepDto) o;
    return Objects.equals(this.completedAt, workflowStepDto.completedAt) &&
        Objects.equals(this.conclusion, workflowStepDto.conclusion) &&
        Objects.equals(this.duration, workflowStepDto.duration) &&
        Objects.equals(this.id, workflowStepDto.id) &&
        Objects.equals(this.name, workflowStepDto.name) &&
        Objects.equals(this.number, workflowStepDto.number) &&
        Objects.equals(this.startedAt, workflowStepDto.startedAt) &&
        Objects.equals(this.status, workflowStepDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedAt, conclusion, duration, id, name, number, startedAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStepDto {\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

