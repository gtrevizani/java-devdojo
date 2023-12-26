package br.com.start.javacore._006_modificadorestatico.model;

public class Anime {
    private String nome;
    private static int[] episodios;
    static {
        System.out.println("Dentro do bloco de inicialização 1 ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização 2 ");
    }
    static {
        System.out.println("Dentro do bloco de inicialização 3 ");
    }
    public Anime(String nome){
        this.nome = nome;
    }
    public Anime(){
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
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
