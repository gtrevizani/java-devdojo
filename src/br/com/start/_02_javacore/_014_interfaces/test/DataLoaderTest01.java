package br.com.start._02_javacore._014_interfaces.test;

import br.com.start._02_javacore._014_interfaces.model.DataLoader;
import br.com.start._02_javacore._014_interfaces.model.DatabaseLoader;
import br.com.start._02_javacore._014_interfaces.model.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
