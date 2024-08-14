package br.es.gob.br.notificationapp.services;

import br.es.gob.br.notificationapp.request.EmailRequest;

public interface EmailService {
    void sendEmail(EmailRequest emailRequest);
}
