package com.artemis.application.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaseRequest
 */
@Validated

public class CaseRequest   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("entity")
  private Entity entity = null;

  @JsonProperty("case-application")
  private CaseApplication caseApplication = null;

  @JsonProperty("case-raw-data")
  private CaseApplication caseRawData = null;

  @JsonProperty("case-raw-attachments")
  private CaseRawAttachments caseRawAttachments = null;

  @JsonProperty("creation-date")
  private String creationDate = null;

  @JsonProperty("creation-user")
  private String creationUser = null;

  @JsonProperty("modification-date")
  private String modificationDate = null;

  @JsonProperty("modification-user")
  private String modificationUser = null;

  public CaseRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of Case Request
   * @return id
  **/
//  @ApiModelProperty(example = "0100", value = "ID of Case Request")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CaseRequest entity(Entity entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Get entity
   * @return entity
  **/
//  @ApiModelProperty(value = "")

  @Valid

  public Entity getEntity() {
    return entity;
  }

  public void setEntity(Entity entity) {
    this.entity = entity;
  }

  public CaseRequest caseApplication(CaseApplication caseApplication) {
    this.caseApplication = caseApplication;
    return this;
  }

  /**
   * Get caseApplication
   * @return caseApplication
  **/
//  @ApiModelProperty(value = "")

  @Valid

  public CaseApplication getCaseApplication() {
    return caseApplication;
  }

  public void setCaseApplication(CaseApplication caseApplication) {
    this.caseApplication = caseApplication;
  }

  public CaseRequest caseRawData(CaseApplication caseRawData) {
    this.caseRawData = caseRawData;
    return this;
  }

  /**
   * Get caseRawData
   * @return caseRawData
  **/
//  @ApiModelProperty(value = "")

  @Valid

  public CaseApplication getCaseRawData() {
    return caseRawData;
  }

  public void setCaseRawData(CaseApplication caseRawData) {
    this.caseRawData = caseRawData;
  }

  public CaseRequest caseRawAttachments(CaseRawAttachments caseRawAttachments) {
    this.caseRawAttachments = caseRawAttachments;
    return this;
  }

  /**
   * Get caseRawAttachments
   * @return caseRawAttachments
  **/
//  @ApiModelProperty(value = "")

  @Valid

  public CaseRawAttachments getCaseRawAttachments() {
    return caseRawAttachments;
  }

  public void setCaseRawAttachments(CaseRawAttachments caseRawAttachments) {
    this.caseRawAttachments = caseRawAttachments;
  }

  public CaseRequest creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Creation date of the case request
   * @return creationDate
  **/
//  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Creation date of the case request")


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public CaseRequest creationUser(String creationUser) {
    this.creationUser = creationUser;
    return this;
  }

  /**
   * Creation user of the case request
   * @return creationUser
  **/
//  @ApiModelProperty(example = "Al", value = "Creation user of the case request")


  public String getCreationUser() {
    return creationUser;
  }

  public void setCreationUser(String creationUser) {
    this.creationUser = creationUser;
  }

  public CaseRequest modificationDate(String modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

  /**
   * Modification date of the case request
   * @return modificationDate
  **/
//  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Modification date of the case request")


  public String getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(String modificationDate) {
    this.modificationDate = modificationDate;
  }

  public CaseRequest modificationUser(String modificationUser) {
    this.modificationUser = modificationUser;
    return this;
  }

  /**
   * Modification date of the case request
   * @return modificationUser
  **/
//  @ApiModelProperty(example = "Ed", value = "Modification date of the case request")


  public String getModificationUser() {
    return modificationUser;
  }

  public void setModificationUser(String modificationUser) {
    this.modificationUser = modificationUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseRequest caseRequest = (CaseRequest) o;
    return Objects.equals(this.id, caseRequest.id) &&
        Objects.equals(this.entity, caseRequest.entity) &&
        Objects.equals(this.caseApplication, caseRequest.caseApplication) &&
        Objects.equals(this.caseRawData, caseRequest.caseRawData) &&
        Objects.equals(this.caseRawAttachments, caseRequest.caseRawAttachments) &&
        Objects.equals(this.creationDate, caseRequest.creationDate) &&
        Objects.equals(this.creationUser, caseRequest.creationUser) &&
        Objects.equals(this.modificationDate, caseRequest.modificationDate) &&
        Objects.equals(this.modificationUser, caseRequest.modificationUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entity, caseApplication, caseRawData, caseRawAttachments, creationDate, creationUser, modificationDate, modificationUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    caseApplication: ").append(toIndentedString(caseApplication)).append("\n");
    sb.append("    caseRawData: ").append(toIndentedString(caseRawData)).append("\n");
    sb.append("    caseRawAttachments: ").append(toIndentedString(caseRawAttachments)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creationUser: ").append(toIndentedString(creationUser)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    modificationUser: ").append(toIndentedString(modificationUser)).append("\n");
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

