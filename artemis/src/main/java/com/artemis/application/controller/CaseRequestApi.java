package com.artemis.application.controller;

import com.artemis.application.domain.CaseApplication;
import com.artemis.application.domain.CaseParticipant;
import com.artemis.application.domain.CaseRawAttachments;
import com.artemis.application.domain.CaseRawData;
import com.artemis.application.domain.CaseRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

public interface CaseRequestApi {

    void createApplicationCaseRequest();
    void createAttachmentsCaseRequest();
    void createCaseRequest();
    void createParticipantsCaseRequest();

    void getApplicationCaseRequest();
    void getAttachmentsCaseRequest();
    void getCaseRequest();
    void getParticipantsCaseRequest();

//        @ApiOperation(value = "Create Application on Case Request", nickname = "createApplicationCaseRequest", notes = "Create Application on Case Request based on the given ID Case Request", response = CaseApplication.class, tags={ "CreateApplicationCaseRequest", })
//        @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Empty response when successful creation", response = CaseApplication.class),
//            @ApiResponse(code = 400, message = "application error"),
//            @ApiResponse(code = 404, message = "application data is not updated"),
//            @ApiResponse(code = 500, message = "business or technical error") })
//        @RequestMapping(value = "/case-request/{id_case-request}/applications",
//            produces = { "application/json" },
//            consumes = { "application/json" },
//            method = RequestMethod.POST)
//        ResponseEntity<CaseApplication> createApplicationCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "Create Application of Case Request" ,required=true )  @Valid @RequestBody CaseApplication data);


//        @ApiOperation(value = "Create Customer Basic Data for legal entity", nickname = "createAttachmentsCaseRequest", notes = "Creates a Customer Basic Data; Calls P011", response = CaseRawAttachments.class, tags={ "createAttachmentsCaseRequest", })
//        @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Empty response when successful creation", response = CaseRawAttachments.class),
//            @ApiResponse(code = 400, message = "application error"),
//            @ApiResponse(code = 404, message = "basic data not found"),
//            @ApiResponse(code = 500, message = "business or technical error") })
//        @RequestMapping(value = "/case-request/{id_case-request}/attachments",
//            produces = { "application/json" },
//            consumes = { "application/json" },
//            method = RequestMethod.POST)
//        ResponseEntity<CaseRawAttachments> createAttachmentsCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "Create Attachments Case Request" ,required=true )  @Valid @RequestBody CaseRawAttachments data);
//
//
//        @ApiOperation(value = "Create Case Request", nickname = "createCaseRequest", notes = "Creates a Case Request", response = CaseRequest.class, tags={ "CaseRequest", })
//        @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Empty response when successful creation", response = CaseRequest.class),
//            @ApiResponse(code = 400, message = "application error"),
//            @ApiResponse(code = 404, message = "data is not valid"),
//            @ApiResponse(code = 500, message = "business or technical error") })
//        @RequestMapping(value = "/case-request",
//            produces = { "application/json" },
//            consumes = { "application/json" },
//            method = RequestMethod.POST)
//        ResponseEntity<CaseRequest> createCaseRequest(@ApiParam(value = "Create CaseRequest" ,required=true )  @Valid @RequestBody CaseRequest data);
//
//
//        @ApiOperation(value = "Create Customer Basic Data for legal entity", nickname = "createParticipantsCaseRequest", notes = "Creates a Customer Basic Data; Calls P011", response = CaseParticipant.class, tags={ "createParticipantsCaseRequest", })
//        @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Empty response when successful creation", response = CaseParticipant.class),
//            @ApiResponse(code = 400, message = "application error"),
//            @ApiResponse(code = 404, message = "basic data not found"),
//            @ApiResponse(code = 500, message = "business or technical error") })
//        @RequestMapping(value = "/case-request/{id_case-request}/participants",
//            produces = { "application/json" },
//            consumes = { "application/json" },
//            method = RequestMethod.POST)
//        ResponseEntity<CaseParticipant> createParticipantsCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "Create Participants Case Request" ,required=true )  @Valid @RequestBody CaseParticipant data);
//
//
//        @ApiOperation(value = "create Raw Data Case Request", nickname = "createRawDataCaseRequest", notes = "create Raw Data Case Request", response = CaseRawData.class, tags={ "CreateRawDataCaseRequest", })
//        @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Empty response when successful creation", response = CaseRawData.class),
//            @ApiResponse(code = 400, message = "application error"),
//            @ApiResponse(code = 404, message = "basic data not found"),
//            @ApiResponse(code = 500, message = "business or technical error") })
//        @RequestMapping(value = "/case-request/{id_case-request}/raw-data",
//            produces = { "application/json" },
//            consumes = { "application/json" },
//            method = RequestMethod.POST)
//        ResponseEntity<CaseRawData> createRawDataCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "Create Raw Data Case Request" ,required=true )  @Valid @RequestBody CaseRawData data);
//
//
//        @ApiOperation(value = "Retrieve Case Request by id", nickname = "getApllicationCaseRequest", notes = "Returns the case request", response = CaseApplication.class, tags={ "GetApllicationCaseRequest", })
//        @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Retrieved Case Request based on the given id", response = CaseApplication.class),
//            @ApiResponse(code = 400, message = "application error"),
//            @ApiResponse(code = 404, message = "basic data not found"),
//            @ApiResponse(code = 500, message = "business or technical error") })
//        @RequestMapping(value = "/case-request/{id_case-request}/applications/{id_application}",
//            produces = { "application/json" },
//            method = RequestMethod.GET)
//        ResponseEntity<CaseApplication> getApllicationCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "id_raw-data",required=true) @PathVariable("id_application") String idApplication);
//
//
//        @ApiOperation(value = "Get Attachments Case Request", nickname = "getAttachmentsCaseRequest", notes = "Get Attachments Case Request", response = CaseRawAttachments.class, tags={ "GetAttachmentsCaseRequest", })
//        @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "", response = CaseRawAttachments.class),
//        @ApiResponse(code = 400, message = "application error"),
//        @ApiResponse(code = 404, message = "basic data not found"),
//        @ApiResponse(code = 500, message = "business or technical error") })
//    @RequestMapping(value = "/case-request/{id_case-request}/attachments/{id_attachment}",
//        produces = { "application/json" },
//        method = RequestMethod.GET)
//    ResponseEntity<CaseRawAttachments> getAttachmentsCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "id_attachment",required=true) @PathVariable("id_attachment") String idAttachment);
//
//
//    @ApiOperation(value = "Retrieve Case Request by id", nickname = "getCaseRequest", notes = "Returns the case request", response = CaseRequest.class, tags={ "GetCaseRequest", })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "Retrieved Case Request based on the given id", response = CaseRequest.class),
//        @ApiResponse(code = 400, message = "application error"),
//        @ApiResponse(code = 404, message = "basic data not found"),
//        @ApiResponse(code = 500, message = "business or technical error") })
//    @RequestMapping(value = "/case-request/{id_case-request}",
//        produces = { "application/json" },
//        method = RequestMethod.GET)
//    ResponseEntity<CaseRequest> getCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest);
//
//
//    @ApiOperation(value = "Retrieve Customer Additional Data", nickname = "getRawDataCaseRequest", notes = "", response = CaseRawData.class, tags={ "GetRawDataCaseRequest", })
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "Retrieved Raw Data", response = CaseRawData.class),
//        @ApiResponse(code = 400, message = "application error"),
//        @ApiResponse(code = 404, message = "basic data not found"),
//        @ApiResponse(code = 500, message = "business or technical error") })
//    @RequestMapping(value = "/case-request/{id_case-request}/raw-data/{id_raw-data}",
//        produces = { "application/json" },
//        method = RequestMethod.GET)
//    ResponseEntity<CaseRawData> getRawDataCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "id_raw-data",required=true) @PathVariable("id_raw-data") String idRawData);

}
