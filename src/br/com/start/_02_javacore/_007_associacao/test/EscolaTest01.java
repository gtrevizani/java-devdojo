package br.com.start._02_javacore._007_associacao.test;

import br.com.start._02_javacore._007_associacao.model.Escola;
import br.com.start._02_javacore._007_associacao.model.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
