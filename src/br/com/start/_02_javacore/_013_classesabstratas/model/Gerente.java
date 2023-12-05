package br.com.start._02_javacore._013_classesabstratas.model;

public class Gerente extends Funcionario{
    protected String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", departamento='" + setor + '\'' +
                '}';
    }
}
