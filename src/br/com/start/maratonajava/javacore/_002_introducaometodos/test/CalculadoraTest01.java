package br.com.start.maratonajava.javacore._002_introducaometodos.test;

import br.com.start.maratonajava.javacore._002_introducaometodos.model.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros(5, 9);
        calculadora.subtraiDoisNumeros(5, 9);
        calculadora.multiplicaDoisNumeros(5, 9);
        calculadora.divideDoisNumeros(5, 9);

    }
}
