package br.com.start._02_javacore._015_polimorfismo.test;

import br.com.start._02_javacore._015_polimorfismo.model.Computador;
import br.com.start._02_javacore._015_polimorfismo.model.Produto;
import br.com.start._02_javacore._015_polimorfismo.model.Tomate;
import br.com.start._02_javacore._015_polimorfismo.services.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2024");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
