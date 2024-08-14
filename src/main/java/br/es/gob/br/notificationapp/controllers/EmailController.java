package br.es.gob.br.notificationapp.controllers;

import br.es.gob.br.notificationapp.request.EmailRequest;
import br.es.gob.br.notificationapp.services.EmailService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/emails")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public void sendEmail(@RequestBody EmailRequest emailRequest) {
        emailService.sendEmail(emailRequest);
    }
}
