package br.com.start.maratonajava.javacore._002_introducaometodos.model;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null){
            return;
        }
        for (double salario:this.salarios) {
            System.out.println(salario + " ");
        }

        imprimeMediaSalario();
    }
    public void imprimeMediaSalario(){
        if (salarios == null){
            return;
        }
        double media = 0;
        for(double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    private void setMedia(double media) {
        this.media = media;
    }
}