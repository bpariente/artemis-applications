package com.artemis.application.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Status
 */
@Validated

public class Status   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private Integer description = null;

  public Status id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id of status
   * @return id
  **/
//  @ApiModelProperty(example = "0100", value = "id of status")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Status description(Integer description) {
    this.description = description;
    return this;
  }

  /**
   * status
   * @return description
  **/
//  @ApiModelProperty(example = "100", value = "status")


  public Integer getDescription() {
    return description;
  }

  public void setDescription(Integer description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.id, status.id) &&
        Objects.equals(this.description, status.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

