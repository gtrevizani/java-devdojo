package br.com.start.maratonajava.javacore._001_introducaoclasses.test;

import br.com.start.maratonajava.javacore._001_introducaoclasses.model.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("carla", 15, 'f');


        System.out.println(estudante.getNome());
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getSexo());
    }

}
