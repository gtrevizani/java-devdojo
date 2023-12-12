package br.com.start._02_javacore._016_exception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }


        try {
            talvezLanceExcepion();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

    }

    private static void talvezLanceExcepion() throws SQLException, IOException {

    }
}
