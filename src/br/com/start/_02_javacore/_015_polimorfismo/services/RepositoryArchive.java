package br.com.start._02_javacore._015_polimorfismo.services;

import br.com.start._02_javacore._015_polimorfismo.repository.Repository;

public class RepositoryArchive implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
