package br.com.start.maratonajava._02_javacore._009_heranca.test;

import br.com.start.maratonajava._02_javacore._009_heranca.model.Endereco;
import br.com.start.maratonajava._02_javacore._009_heranca.model.Funcionario;
import br.com.start.maratonajava._02_javacore._009_heranca.model.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua 3", "29163607");
        Endereco endereco2 = new Endereco("Rua 4", "29163689");
        Pessoa pessoa = new Pessoa("Inácio Lula da Silva", "17161532707", endereco1);
        Funcionario funcionario = new Funcionario("Bolsonaro", "17151627309", endereco2, 1500.00);

        pessoa.imprime();
        System.out.println("------------");
        funcionario.imprime();
    }
}
