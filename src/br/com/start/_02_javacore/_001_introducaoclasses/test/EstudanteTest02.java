package br.com.start._02_javacore._001_introducaoclasses.test;

import br.com.start._02_javacore._001_introducaoclasses.model.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante2 = new Estudante("Robert", 18, 'f');

        //estudante2.nome = "Luffy";
        //System.out.println(estudante2.nome);
        System.out.println(estudante2.getIdade());
        System.out.println(estudante2.getSexo());
        System.out.println(estudante2.getNome());
    }
}
