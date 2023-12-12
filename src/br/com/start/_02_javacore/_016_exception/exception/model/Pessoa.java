package br.com.start._02_javacore._016_exception.exception.model;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, IOException {
        System.out.println("Salvando pessoa");
    }
}
