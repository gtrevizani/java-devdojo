package br.com.start.maratonajava._01_introducao;

public class Aula08EstruturasCondicionais04 {
    // I want to know how much I have to pay in the Netherlands 2020 based on my annual salary.
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        int taxaNetherland1 = 34712;
        int taxaNetherland2 = 68507;
        double valorImposto = 0;
    

        boolean isMaiorTaxa1 = salarioAnual <= taxaNetherland1;
        boolean isMaiorTaxa2 = salarioAnual >= taxaNetherland1 && salarioAnual <= taxaNetherland2;


        valorImposto = isMaiorTaxa1
                ? (valorImposto = salarioAnual * primeiraFaixa)
                : isMaiorTaxa2
                ? (valorImposto = salarioAnual * segundaFaixa) : (valorImposto = salarioAnual * terceiraFaixa);

        System.out.println(valorImposto);
    }
}
