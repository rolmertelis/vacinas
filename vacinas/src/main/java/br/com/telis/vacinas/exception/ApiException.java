package br.com.telis.vacinas.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {
    private final String mensagem;

    private final HttpStatus httpStatus;
    private final ZonedDateTime zonedDateTime;

    public ApiException(String mensagem,  HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
        this.mensagem = mensagem;
        this.httpStatus = httpStatus;
        this.zonedDateTime = zonedDateTime;
    }

    public String getMensagem() {
        return mensagem;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }
}
