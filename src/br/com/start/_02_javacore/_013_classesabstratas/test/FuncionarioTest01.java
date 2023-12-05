package br.com.start._02_javacore._013_classesabstratas.test;

import br.com.start._02_javacore._013_classesabstratas.model.Desenvolvedor;
import br.com.start._02_javacore._013_classesabstratas.model.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000, "RH");
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Joe", 12000, "Back-end");
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }


}
