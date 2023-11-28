package br.com.start._02_javacore._002_introducaometodos.test;

import br.com.start._02_javacore._002_introducaometodos.model.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1400.30, 1800.28, 1000.50});

        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());
    }


}
