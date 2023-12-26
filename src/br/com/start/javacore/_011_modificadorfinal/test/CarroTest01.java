package br.com.start.javacore._011_modificadorfinal.test;

import br.com.start.javacore._011_modificadorfinal.model.Carro;
import br.com.start.javacore._011_modificadorfinal.model.Comprador;
import br.com.start.javacore._011_modificadorfinal.model.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprado2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
