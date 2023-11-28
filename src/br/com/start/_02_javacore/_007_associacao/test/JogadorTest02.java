package br.com.start._02_javacore._007_associacao.test;

import br.com.start._02_javacore._007_associacao.model.Jogador;
import br.com.start._02_javacore._007_associacao.model.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
