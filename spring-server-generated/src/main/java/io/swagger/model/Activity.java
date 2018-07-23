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
 * Activity
 */
@Validated

public class Activity   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private Integer description = null;

  public Activity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id of activity
   * @return id
  **/
  @ApiModelProperty(example = "0100", value = "id of activity")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Activity description(Integer description) {
    this.description = description;
    return this;
  }

  /**
   * activity
   * @return description
  **/
  @ApiModelProperty(example = "100", value = "activity")


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
    Activity activity = (Activity) o;
    return Objects.equals(this.id, activity.id) &&
        Objects.equals(this.description, activity.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
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

