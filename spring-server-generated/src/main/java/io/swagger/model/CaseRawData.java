package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaseRawData
 */
@Validated

public class CaseRawData   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("raw")
  private Object raw = null;

  public CaseRawData id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id of case raw-data
   * @return id
  **/
  @ApiModelProperty(example = "100", value = "id of case raw-data")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CaseRawData raw(Object raw) {
    this.raw = raw;
    return this;
  }

  /**
   * object JSON
   * @return raw
  **/
  @ApiModelProperty(example = "\"{\\\"name\\\":\\\"John\\\"}\"", value = "object JSON")


  public Object getRaw() {
    return raw;
  }

  public void setRaw(Object raw) {
    this.raw = raw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseRawData caseRawData = (CaseRawData) o;
    return Objects.equals(this.id, caseRawData.id) &&
        Objects.equals(this.raw, caseRawData.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, raw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseRawData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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

