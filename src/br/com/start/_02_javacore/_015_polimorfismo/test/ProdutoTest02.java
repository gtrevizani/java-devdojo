package br.com.start._02_javacore._015_polimorfismo.test;

import br.com.start._02_javacore._015_polimorfismo.model.Computador;
import br.com.start._02_javacore._015_polimorfismo.model.Produto;
import br.com.start._02_javacore._015_polimorfismo.model.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("------");
        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
