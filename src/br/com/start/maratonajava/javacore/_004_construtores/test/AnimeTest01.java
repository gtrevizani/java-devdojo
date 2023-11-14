package br.com.start.maratonajava.javacore._004_construtores.test;

import br.com.start.maratonajava.javacore._004_construtores.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haykiuu", "TV", 12, "Ação");
        //anime.init("Akudama Drive", "TV", 12, "Ação");
        Anime anime2 = new Anime();

        anime.imprime();
        anime2.imprime();
    }
}
