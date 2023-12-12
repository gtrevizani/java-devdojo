package br.com.start._02_javacore._016_exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException {

        criarNovoArquivo();

    }

    private static void criarNovoArquivo(){
        File file = new File("src/br/com/arquivo/texto.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
