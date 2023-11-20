package br.com.start.maratonajava.javacore._007_associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
    }
}
