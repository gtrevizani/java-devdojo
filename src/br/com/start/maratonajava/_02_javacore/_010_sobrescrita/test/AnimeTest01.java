package br.com.start.maratonajava._02_javacore._010_sobrescrita.test;

import br.com.start.maratonajava._02_javacore._010_sobrescrita.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dr. Stone");
        System.out.println(anime.toString());
    }
}
