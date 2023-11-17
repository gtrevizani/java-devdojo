package br.com.start.maratonajava.javacore._005_blocosinicializacao.model;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime(String nome){
        this.nome = nome;
    }
    public Anime(){
        for (int episodio : this.episodios) {
            System.out.println(episodio + " ");
        }
        System.out.println();
    }
    public String getNome() {
        return nome;
    }
    public int[] getEpisodios() {
        return episodios;
    }
}
