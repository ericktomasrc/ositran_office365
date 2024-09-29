package ositranoffice365.ositran_office365_shared;

import java.util.List;

public class StatusResponse <T> extends StatusSimpleResponse{
    private T data;

    public StatusResponse() {
        super();
    }

    public StatusResponse(Boolean success, String message) {
        this.setSuccess(success);
        this.setMessage(message);
    }

    public StatusResponse(Boolean success, String message, List<String> details) {
        this.setSuccess(success);
        this.setMessage(message);
        this.setDetails(details);
    }

    public StatusResponse(Boolean success, String message, T data) {
        this.setSuccess(success);
        this.setMessage(message);
        this.data = data;
    }
}
