package br.com.start.javacore._007_associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite M ou F para o seu sexo: ");
        char sexo = scanner.next().charAt(0);

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);
    }
}
