package br.com.start.javacore._015_polimorfismo.services;

import br.com.start.javacore._015_polimorfismo.repository.Repository;

public class RepositoryArchive implements Repository {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
