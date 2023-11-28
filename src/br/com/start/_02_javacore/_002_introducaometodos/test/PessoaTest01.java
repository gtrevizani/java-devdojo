package br.com.start._02_javacore._002_introducaometodos.test;

import br.com.start._02_javacore._002_introducaometodos.model.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // pessoa.nome = "Jiraya";
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
