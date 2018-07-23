package com.artemis.application.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaseRawAttachments
 */
@Validated

public class CaseRawAttachments   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("seq-id")
  private String seqId = null;

  @JsonProperty("data")
  private String data = null;

  @JsonProperty("metadata")
  private Object metadata = null;

  public CaseRawAttachments id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id of case raw-attachment
   * @return id
  **/
//  @ApiModelProperty(example = "1231", value = "id of case raw-attachment")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CaseRawAttachments seqId(String seqId) {
    this.seqId = seqId;
    return this;
  }

  /**
   * seq id of case raw-attachment
   * @return seqId
  **/
//  @ApiModelProperty(example = "1", value = "seq id of case raw-attachment")


  public String getSeqId() {
    return seqId;
  }

  public void setSeqId(String seqId) {
    this.seqId = seqId;
  }

  public CaseRawAttachments data(String data) {
    this.data = data;
    return this;
  }

  /**
   * 
   * @return data
  **/
//  @ApiModelProperty(example = "", value = "")


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public CaseRawAttachments metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * object JSON
   * @return metadata
  **/
//  @ApiModelProperty(example = "\"{\"timestamp_creation_user\": \"2017-07-21T17:32:28Z\"}\"", value = "object JSON")


  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseRawAttachments caseRawAttachments = (CaseRawAttachments) o;
    return Objects.equals(this.id, caseRawAttachments.id) &&
        Objects.equals(this.seqId, caseRawAttachments.seqId) &&
        Objects.equals(this.data, caseRawAttachments.data) &&
        Objects.equals(this.metadata, caseRawAttachments.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, seqId, data, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseRawAttachments {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    seqId: ").append(toIndentedString(seqId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

