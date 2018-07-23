package io.swagger.api;

import io.swagger.model.CaseApplication;
import io.swagger.model.CaseParticipant;
import io.swagger.model.CaseRawAttachments;
import io.swagger.model.CaseRawData;
import io.swagger.model.CaseRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class CaseRequestApiController implements CaseRequestApi {

    private static final Logger log = LoggerFactory.getLogger(CaseRequestApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CaseRequestApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CaseApplication> createApplicationCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "Create Application of Case Request" ,required=true )  @Valid @RequestBody CaseApplication data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CaseApplication>(objectMapper.readValue("{  \"modification-user\" : \"Tom\",  \"creation-user\" : \"Ferris\",  \"app-seq\" : \"\",  \"business-process\" : \"\",  \"creation-date\" : \"2017-07-21T17:32:28Z\",  \"modification-date\" : \"2017-07-21T17:32:28Z\",  \"id\" : 100,  \"status\" : {    \"description\" : 100,    \"id\" : \"0100\"  }}", CaseApplication.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CaseApplication>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CaseApplication>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CaseRawAttachments> createAttachmentsCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "Create Attachments Case Request" ,required=true )  @Valid @RequestBody CaseRawAttachments data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CaseRawAttachments>(objectMapper.readValue("{  \"metadata\" : \"{\\"timestamp_creation_user\\": \\"2017-07-21T17:32:28Z\\"}\",  \"data\" : \"\",  \"seq-id\" : \"1\",  \"id\" : 1231}", CaseRawAttachments.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CaseRawAttachments>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CaseRawAttachments>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CaseRequest> createCaseRequest(@ApiParam(value = "Create CaseRequest" ,required=true )  @Valid @RequestBody CaseRequest data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CaseRequest>(objectMapper.readValue("{  \"modification-user\" : \"Ed\",  \"case-raw-attachments\" : {    \"metadata\" : \"{\\"timestamp_creation_user\\": \\"2017-07-21T17:32:28Z\\"}\",    \"data\" : \"\",    \"seq-id\" : \"1\",    \"id\" : 1231  },  \"creation-user\" : \"Al\",  \"case-raw-data\" : {    \"modification-user\" : \"Tom\",    \"creation-user\" : \"Ferris\",    \"app-seq\" : \"\",    \"business-process\" : \"\",    \"creation-date\" : \"2017-07-21T17:32:28Z\",    \"modification-date\" : \"2017-07-21T17:32:28Z\",    \"id\" : 100,    \"status\" : {      \"description\" : 100,      \"id\" : \"0100\"    }  },  \"creation-date\" : \"2017-07-21T17:32:28Z\",  \"modification-date\" : \"2017-07-21T17:32:28Z\",  \"id\" : \"0100\",  \"entity\" : {    \"description\" : \"0100\",    \"id\" : \"0100\"  },  \"case-application\" : {    \"modification-user\" : \"Tom\",    \"creation-user\" : \"Ferris\",    \"app-seq\" : \"\",    \"business-process\" : \"\",    \"creation-date\" : \"2017-07-21T17:32:28Z\",    \"modification-date\" : \"2017-07-21T17:32:28Z\",    \"id\" : 100,    \"status\" : {      \"description\" : 100,      \"id\" : \"0100\"    }  }}", CaseRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CaseRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CaseRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CaseParticipant> createParticipantsCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "Create Participants Case Request" ,required=true )  @Valid @RequestBody CaseParticipant data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CaseParticipant>(objectMapper.readValue("{  \"participants-data\" : \"{\\"participants\\": [\\"John\\",\\"Al\\",\\"Ed\\"]}\",  \"id\" : 100}", CaseParticipant.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CaseParticipant>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CaseParticipant>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CaseRawData> createRawDataCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "Create Raw Data Case Request" ,required=true )  @Valid @RequestBody CaseRawData data) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CaseRawData>(objectMapper.readValue("{  \"raw\" : \"{\\"name\\":\\"John\\"}\",  \"id\" : 100}", CaseRawData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CaseRawData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CaseRawData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CaseApplication> getApllicationCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "id_raw-data",required=true) @PathVariable("id_application") String idApplication) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CaseApplication>(objectMapper.readValue("{  \"modification-user\" : \"Tom\",  \"creation-user\" : \"Ferris\",  \"app-seq\" : \"\",  \"business-process\" : \"\",  \"creation-date\" : \"2017-07-21T17:32:28Z\",  \"modification-date\" : \"2017-07-21T17:32:28Z\",  \"id\" : 100,  \"status\" : {    \"description\" : 100,    \"id\" : \"0100\"  }}", CaseApplication.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CaseApplication>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CaseApplication>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CaseRawAttachments> getAttachmentsCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "id_attachment",required=true) @PathVariable("id_attachment") String idAttachment) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CaseRawAttachments>(objectMapper.readValue("{  \"metadata\" : \"{\\"timestamp_creation_user\\": \\"2017-07-21T17:32:28Z\\"}\",  \"data\" : \"\",  \"seq-id\" : \"1\",  \"id\" : 1231}", CaseRawAttachments.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CaseRawAttachments>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CaseRawAttachments>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CaseRequest> getCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CaseRequest>(objectMapper.readValue("{  \"modification-user\" : \"Ed\",  \"case-raw-attachments\" : {    \"metadata\" : \"{\\"timestamp_creation_user\\": \\"2017-07-21T17:32:28Z\\"}\",    \"data\" : \"\",    \"seq-id\" : \"1\",    \"id\" : 1231  },  \"creation-user\" : \"Al\",  \"case-raw-data\" : {    \"modification-user\" : \"Tom\",    \"creation-user\" : \"Ferris\",    \"app-seq\" : \"\",    \"business-process\" : \"\",    \"creation-date\" : \"2017-07-21T17:32:28Z\",    \"modification-date\" : \"2017-07-21T17:32:28Z\",    \"id\" : 100,    \"status\" : {      \"description\" : 100,      \"id\" : \"0100\"    }  },  \"creation-date\" : \"2017-07-21T17:32:28Z\",  \"modification-date\" : \"2017-07-21T17:32:28Z\",  \"id\" : \"0100\",  \"entity\" : {    \"description\" : \"0100\",    \"id\" : \"0100\"  },  \"case-application\" : {    \"modification-user\" : \"Tom\",    \"creation-user\" : \"Ferris\",    \"app-seq\" : \"\",    \"business-process\" : \"\",    \"creation-date\" : \"2017-07-21T17:32:28Z\",    \"modification-date\" : \"2017-07-21T17:32:28Z\",    \"id\" : 100,    \"status\" : {      \"description\" : 100,      \"id\" : \"0100\"    }  }}", CaseRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CaseRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CaseRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CaseRawData> getRawDataCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "id_raw-data",required=true) @PathVariable("id_raw-data") String idRawData) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CaseRawData>(objectMapper.readValue("{  \"raw\" : \"{\\"name\\":\\"John\\"}\",  \"id\" : 100}", CaseRawData.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CaseRawData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CaseRawData>(HttpStatus.NOT_IMPLEMENTED);
    }

}
