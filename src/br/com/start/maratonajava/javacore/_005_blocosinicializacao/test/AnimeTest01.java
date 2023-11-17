package br.com.start.maratonajava.javacore._005_blocosinicializacao.test;

import br.com.start.maratonajava.javacore._005_blocosinicializacao.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        System.out.println(anime.getEpisodios());
    }
}
