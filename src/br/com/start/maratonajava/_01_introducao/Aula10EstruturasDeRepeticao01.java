package br.com.start.maratonajava._01_introducao;

public class Aula10EstruturasDeRepeticao01 {

    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10){
            System.out.println(++count);
        }

        count = 0;
        do{
            System.out.println("dentro do do-while" + ++count);
        } while (count < 10);

        for(count=0; count<10; count++){
            System.out.println("For " + count);
        }

    }
}
