package br.com.start.javacore._015_polimorfismo.test;

import br.com.start.javacore._015_polimorfismo.model.Computador;
import br.com.start.javacore._015_polimorfismo.model.Televisao;
import br.com.start.javacore._015_polimorfismo.model.Tomate;
import br.com.start.javacore._015_polimorfismo.services.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Sicilian", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------");
        CalculadoraImposto.calcularImposto(tv);
    }


}
