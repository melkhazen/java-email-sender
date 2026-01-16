package com.melkhazen.email_sender.dto;

import lombok.Getter;

@Getter
public class EmailResponse {

    private boolean success;
    private String message;

    public EmailResponse(boolean success, String message)
    {
        this.success = success;
        this.message = message;
    }

}
