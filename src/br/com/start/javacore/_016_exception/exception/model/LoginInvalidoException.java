package br.com.start.javacore._016_exception.exception.model;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login inválido");
    }


    public LoginInvalidoException(String message) {
        super(message);
    }
}
