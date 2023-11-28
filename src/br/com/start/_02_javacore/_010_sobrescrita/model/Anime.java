package br.com.start._02_javacore._010_sobrescrita.model;

public class Anime {
    private String nome;

    @Override
    public String toString() {
        return "Anime: " + this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
