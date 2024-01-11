package br.com.start.javacore._023_collections.test;

import br.com.start.javacore._023_collections.model.Consumidor;
import br.com.start.javacore._023_collections.model.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class  MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevD Acade");

        Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L,"Berserk", 9.5);
        Manga manga3 = new Manga(4L,"Attack on titan", 3.2);
        Manga manga4 = new Manga(3L,"Pokemon", 11.20);
        Manga manga5 = new Manga(2L,"Dragon Ball Z", 2.99);

        List<Manga> mangaConsumidor1List = Arrays.asList(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = Arrays.asList(manga3, manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println("--" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("-----------" + manga.getNome());
            }

        }
    }
}
