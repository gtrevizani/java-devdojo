package br.com.start.maratonajava._02_javacore._007_associacao.model;

public class Professor {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor(String nome) {
        this.nome = nome;
    }
}
