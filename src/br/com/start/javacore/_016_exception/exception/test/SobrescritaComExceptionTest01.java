package br.com.start.javacore._016_exception.exception.test;

import br.com.start.javacore._016_exception.exception.model.Funcionario;
import br.com.start.javacore._016_exception.exception.model.LoginInvalidoException;
import br.com.start.javacore._016_exception.exception.model.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
