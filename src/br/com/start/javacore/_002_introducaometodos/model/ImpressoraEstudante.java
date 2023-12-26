package br.com.start.javacore._002_introducaometodos.model;

public class ImpressoraEstudante {

    public void imprime(Estudante estudante){
        System.out.print("Nome: " + estudante.nome + "\n");
        System.out.print("Idade: " + estudante.idade + "\n");
        System.out.print("Sexo: " + estudante.sexo + "\n");
    }
}
