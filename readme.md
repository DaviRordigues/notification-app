# Notification App

Este é um projeto Spring Boot que implementa uma API para envio de e-mails. A aplicação utiliza o serviço de SMTP para enviar e-mails para destinatários especificados.

## Pré-requisitos

- **Java 21**: Certifique-se de ter o Java 21 instalado.
- **Gradle**: Certifique-se de ter o Gradle instalado.
- **Conta de E-mail**: Você precisará de uma conta de e-mail que permita o envio via SMTP (neste exemplo, foi utilizada uma conta do Gmail).

## Configuração do Projeto

Se você estiver usando o Gmail, gere uma senha de aplicativo para utilizar com essa aplicação. Esta senha deve ser inserida no campo password no application.yml

Atualize o e-mail e a senha no arquivo de implementação do serviço de e-mail (EmailServiceImpl.java ou outro nome conforme o caso). Certifique-se de que o e-mail e a senha usados para autenticação no serviço de envio estão corretos.


Va para o postman e faça um post 
{
"to": "destinatario@example.com",
"subject": "Teste de Email",
"text": "Este é um teste de envio de email via Postman."
}