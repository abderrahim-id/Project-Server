package io.getarrays.server.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;


// This class is for getting a response of our api whatever can get (success or error)
// This is a response for all the requests that comes into the application from the user


@Data
@SuperBuilder
@JsonInclude(NON_NULL)
public class Response {
    protected LocalDateTime timeStamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String reason;        // reason of the error
    protected String message;       // a message to show for the user
    protected String developerMessage;      // just another message but more technical and more detailed
    protected Map<?,?> data;
}

// @JsonInclude(NON_NULL)  if I'm sending a success response then the developerMessage is gonna be null so we don't want it to be included in the response
