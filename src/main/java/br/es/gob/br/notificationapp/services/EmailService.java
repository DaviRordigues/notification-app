package br.es.gob.br.notificationapp.services;

public interface EmailService {
    void sendEmail(String to, String subject, String text);
}
