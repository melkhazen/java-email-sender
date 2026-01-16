package com.melkhazen.email_sender.controller;

import com.melkhazen.email_sender.dto.EmailRequest;
import com.melkhazen.email_sender.dto.EmailResponse;
import com.melkhazen.email_sender.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/emails")
public class EmailController {

    private static final Logger log = LoggerFactory.getLogger(EmailController.class);
    private final EmailService emailSenderService;

    public EmailController(EmailService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/send")
    public ResponseEntity<EmailResponse> sendEmail(@RequestBody EmailRequest request){
        log.info("Sending Email to: {}", request.getTo());

        try {
            emailSenderService.sendEmail(request.getTo(), request.getSubject(), request.getBody());
            return  ResponseEntity.ok(new EmailResponse(true, "Email sent successfully"));
        }catch (Exception e){
            log.error("Failed to send email", e);
            return  ResponseEntity.internalServerError().body(new EmailResponse(false, "Failed to send email" + e.getMessage()));
        }
    }
}