package com.cristian.football_api.exception;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ErrorResponse {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private Map<String, List<String>> errors;

    public ErrorResponse(LocalDateTime timestamp, int status, String error, Map<String, List<String>> errors) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.errors = errors;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public Map<String, List<String>> getErrors() {
        return errors;
    }

}
