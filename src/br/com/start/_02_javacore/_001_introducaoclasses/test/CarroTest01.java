package br.com.start._02_javacore._001_introducaoclasses.test;

import br.com.start._02_javacore._001_introducaoclasses.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Uno";
        carro1.ano = 2015;
        carro1.modelo = "Fiat";

        Carro carro2 = new Carro();
        carro2.nome = "Gol";
        carro2.ano = 2014;
        carro2.modelo = "Volkswagen";

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

    }
}
