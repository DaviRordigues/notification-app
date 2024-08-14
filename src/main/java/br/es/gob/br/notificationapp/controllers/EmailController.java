package br.es.gob.br.notificationapp.controllers;

import br.es.gob.br.notificationapp.request.EmailRequest;
import br.es.gob.br.notificationapp.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public void sendEmail(@RequestBody EmailRequest emailRequest) {
        emailService.sendEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getText());
    }
}
