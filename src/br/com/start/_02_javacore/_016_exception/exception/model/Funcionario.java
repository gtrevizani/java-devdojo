package br.com.start._02_javacore._016_exception.exception.model;


import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("salvando funcionário");
    }
}
