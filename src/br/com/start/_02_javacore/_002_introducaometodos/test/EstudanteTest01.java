package br.com.start._02_javacore._002_introducaometodos.test;

import br.com.start._02_javacore._002_introducaometodos.model.Estudante;
import br.com.start._02_javacore._002_introducaometodos.model.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante("Midoriya", 15, 'M');
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        impressora.imprime(estudante01);
    }
}
