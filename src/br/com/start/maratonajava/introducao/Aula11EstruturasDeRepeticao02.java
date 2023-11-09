package br.com.start.maratonajava.introducao;

public class Aula11EstruturasDeRepeticao02 {
    //Imprima todos os números pares de 0 até 1000000
    public static void main(String[] args) {
        for(int i=0; i<=1000000; i++){
            if(i % 2 == 0){
                System.out.println("Par: " + i);
            }else{
                System.out.println("Ímpar: " + i);
            }

        }
    }
}
