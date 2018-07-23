package com.artemis.application.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Entity
 */
@Validated

public class Entity   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  public Entity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id of the entity
   * @return id
  **/
//  @ApiModelProperty(example = "0100", value = "id of the entity")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Entity description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Entity
   * @return description
  **/
//  @ApiModelProperty(example = "0100", value = "Entity")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
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
    Entity entity = (Entity) o;
    return Objects.equals(this.id, entity.id) &&
        Objects.equals(this.description, entity.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entity {\n");
    
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

