package br.com.start.maratonajava._02_javacore._002_introducaometodos.test;

import br.com.start.maratonajava._02_javacore._002_introducaometodos.model.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6);
    }
}
