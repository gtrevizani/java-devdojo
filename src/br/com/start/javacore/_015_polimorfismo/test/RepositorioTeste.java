package br.com.start.javacore._015_polimorfismo.test;

import br.com.start.javacore._015_polimorfismo.repository.Repository;
import br.com.start.javacore._015_polimorfismo.services.RepositoryMemory;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repository repository = new RepositoryMemory();
        repository.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
