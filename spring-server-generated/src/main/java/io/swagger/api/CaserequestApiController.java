package io.swagger.api;

import io.swagger.model.CaseParticipant;
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
public class CaserequestApiController implements CaserequestApi {

    private static final Logger log = LoggerFactory.getLogger(CaserequestApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CaserequestApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CaseParticipant> getParticipantsCaseRequest(@ApiParam(value = "id_case-request",required=true) @PathVariable("id_case-request") String idCaseRequest,@ApiParam(value = "id_participant",required=true) @PathVariable("id_participant") String idParticipant) {
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

}
