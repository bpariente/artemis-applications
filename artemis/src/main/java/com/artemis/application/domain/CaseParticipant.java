package com.artemis.application.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaseParticipant
 */
@Validated

public class CaseParticipant   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("participants-data")
  private Object participantsData = null;

  public CaseParticipant id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id of case participant
   * @return id
  **/
//  @ApiModelProperty(example = "100", value = "id of case participant")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CaseParticipant participantsData(Object participantsData) {
    this.participantsData = participantsData;
    return this;
  }

  /**
   * jsonB
   * @return participantsData
  **/
//  @ApiModelProperty(example = "\"{\"participants\": [\"John\",\"Al\",\"Ed\"]}\"", value = "jsonB")

  public Object getParticipantsData() {
    return participantsData;
  }

  public void setParticipantsData(Object participantsData) {
    this.participantsData = participantsData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseParticipant caseParticipant = (CaseParticipant) o;
    return Objects.equals(this.id, caseParticipant.id) &&
        Objects.equals(this.participantsData, caseParticipant.participantsData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, participantsData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseParticipant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    participantsData: ").append(toIndentedString(participantsData)).append("\n");
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

