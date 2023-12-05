package br.com.start._02_javacore._013_classesabstratas.model;

public class Desenvolvedor extends Funcionario{
    protected String stack;

    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", stack='" + stack + '\'' +
                '}';
    }


}
