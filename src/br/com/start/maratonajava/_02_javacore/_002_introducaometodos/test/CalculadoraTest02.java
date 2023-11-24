package br.com.start.maratonajava._02_javacore._002_introducaometodos.test;

import br.com.start.maratonajava._02_javacore._002_introducaometodos.model.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(5, 9);
        System.out.println(result);
    }
}
