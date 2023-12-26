package br.com.start.javacore._022_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "src/br/com/arquivo";
        String arquivoTxt = "../../arquivo.txt";
        Path path = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path.normalize());
    }
}
