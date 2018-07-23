package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Status;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CaseApplication
 */
@Validated

public class CaseApplication   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("app-seq")
  private Object appSeq = null;

  @JsonProperty("business-process")
  private String businessProcess = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("creation-date")
  private String creationDate = null;

  @JsonProperty("creation-user")
  private String creationUser = null;

  @JsonProperty("modification-date")
  private String modificationDate = null;

  @JsonProperty("modification-user")
  private String modificationUser = null;

  public CaseApplication id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id of case application
   * @return id
  **/
  @ApiModelProperty(example = "100", value = "id of case application")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CaseApplication appSeq(Object appSeq) {
    this.appSeq = appSeq;
    return this;
  }

  /**
   * 
   * @return appSeq
  **/
  @ApiModelProperty(example = "\"\"", value = "")


  public Object getAppSeq() {
    return appSeq;
  }

  public void setAppSeq(Object appSeq) {
    this.appSeq = appSeq;
  }

  public CaseApplication businessProcess(String businessProcess) {
    this.businessProcess = businessProcess;
    return this;
  }

  /**
   * 
   * @return businessProcess
  **/
  @ApiModelProperty(example = "", value = "")


  public String getBusinessProcess() {
    return businessProcess;
  }

  public void setBusinessProcess(String businessProcess) {
    this.businessProcess = businessProcess;
  }

  public CaseApplication status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public CaseApplication creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Creation date of the case request
   * @return creationDate
  **/
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Creation date of the case request")


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public CaseApplication creationUser(String creationUser) {
    this.creationUser = creationUser;
    return this;
  }

  /**
   * Creation user of the case request
   * @return creationUser
  **/
  @ApiModelProperty(example = "Ferris", value = "Creation user of the case request")


  public String getCreationUser() {
    return creationUser;
  }

  public void setCreationUser(String creationUser) {
    this.creationUser = creationUser;
  }

  public CaseApplication modificationDate(String modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

  /**
   * Modification date of the case request
   * @return modificationDate
  **/
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Modification date of the case request")


  public String getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(String modificationDate) {
    this.modificationDate = modificationDate;
  }

  public CaseApplication modificationUser(String modificationUser) {
    this.modificationUser = modificationUser;
    return this;
  }

  /**
   * Modification date of the case request
   * @return modificationUser
  **/
  @ApiModelProperty(example = "Tom", value = "Modification date of the case request")


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
    CaseApplication caseApplication = (CaseApplication) o;
    return Objects.equals(this.id, caseApplication.id) &&
        Objects.equals(this.appSeq, caseApplication.appSeq) &&
        Objects.equals(this.businessProcess, caseApplication.businessProcess) &&
        Objects.equals(this.status, caseApplication.status) &&
        Objects.equals(this.creationDate, caseApplication.creationDate) &&
        Objects.equals(this.creationUser, caseApplication.creationUser) &&
        Objects.equals(this.modificationDate, caseApplication.modificationDate) &&
        Objects.equals(this.modificationUser, caseApplication.modificationUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, appSeq, businessProcess, status, creationDate, creationUser, modificationDate, modificationUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseApplication {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    appSeq: ").append(toIndentedString(appSeq)).append("\n");
    sb.append("    businessProcess: ").append(toIndentedString(businessProcess)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

