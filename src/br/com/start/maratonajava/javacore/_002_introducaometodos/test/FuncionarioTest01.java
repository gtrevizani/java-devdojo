package br.com.start.maratonajava.javacore._002_introducaometodos.test;

import br.com.start.maratonajava.javacore._002_introducaometodos.model.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Sanji";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1500.00, 1500, 1500};

        funcionario.imprime(funcionario);
        funcionario.imprimeMediaSalario();
    }


}
