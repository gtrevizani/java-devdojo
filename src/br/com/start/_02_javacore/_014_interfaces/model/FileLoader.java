package br.com.start._02_javacore._014_interfaces.model;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }

}
