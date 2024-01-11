package br.com.start.javacore._023_collections.test;

import br.com.start.javacore._023_collections.model.Manga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Hellsing Ultimate");
        mangas.add("Berserk");
        mangas.add("Attack on titan");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        Collections.sort(dinheiros);

        for (String manga : mangas){
            System.out.println(manga);
        }

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

        new Manga(null, null, 0);

    }
}
