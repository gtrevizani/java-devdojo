package br.com.start.maratonajava.javacore._002_introducaometodos.model;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;
    public double media;

    public void imprime(Funcionario funcionario){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario:salarios) {
            System.out.println(salario + " ");
        }
    }
    public void imprimeMediaSalario(){
        double media = 0;
        for(double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial " + media);
    }
}
