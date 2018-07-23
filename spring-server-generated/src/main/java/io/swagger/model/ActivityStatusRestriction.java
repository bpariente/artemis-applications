package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Activity;
import io.swagger.model.Status;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActivityStatusRestriction
 */
@Validated

public class ActivityStatusRestriction   {
  @JsonProperty("id-activity-status")
  private String idActivityStatus = null;

  @JsonProperty("id-status")
  private Status idStatus = null;

  @JsonProperty("id-activity")
  private Activity idActivity = null;

  public ActivityStatusRestriction idActivityStatus(String idActivityStatus) {
    this.idActivityStatus = idActivityStatus;
    return this;
  }

  /**
   * id of activity-status
   * @return idActivityStatus
  **/
  @ApiModelProperty(example = "0100", value = "id of activity-status")


  public String getIdActivityStatus() {
    return idActivityStatus;
  }

  public void setIdActivityStatus(String idActivityStatus) {
    this.idActivityStatus = idActivityStatus;
  }

  public ActivityStatusRestriction idStatus(Status idStatus) {
    this.idStatus = idStatus;
    return this;
  }

  /**
   * Get idStatus
   * @return idStatus
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Status getIdStatus() {
    return idStatus;
  }

  public void setIdStatus(Status idStatus) {
    this.idStatus = idStatus;
  }

  public ActivityStatusRestriction idActivity(Activity idActivity) {
    this.idActivity = idActivity;
    return this;
  }

  /**
   * Get idActivity
   * @return idActivity
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Activity getIdActivity() {
    return idActivity;
  }

  public void setIdActivity(Activity idActivity) {
    this.idActivity = idActivity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityStatusRestriction activityStatusRestriction = (ActivityStatusRestriction) o;
    return Objects.equals(this.idActivityStatus, activityStatusRestriction.idActivityStatus) &&
        Objects.equals(this.idStatus, activityStatusRestriction.idStatus) &&
        Objects.equals(this.idActivity, activityStatusRestriction.idActivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idActivityStatus, idStatus, idActivity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityStatusRestriction {\n");
    
    sb.append("    idActivityStatus: ").append(toIndentedString(idActivityStatus)).append("\n");
    sb.append("    idStatus: ").append(toIndentedString(idStatus)).append("\n");
    sb.append("    idActivity: ").append(toIndentedString(idActivity)).append("\n");
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

