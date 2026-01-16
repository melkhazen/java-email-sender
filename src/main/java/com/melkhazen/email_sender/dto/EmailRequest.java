package com.melkhazen.email_sender.dto;

import lombok.Getter;

@Getter
public class EmailRequest {

    private String to;
    private String subject;
    private String body;

    public EmailRequest(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }
}
