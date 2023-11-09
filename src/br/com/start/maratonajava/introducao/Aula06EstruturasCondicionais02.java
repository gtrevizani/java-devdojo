package br.com.start.maratonajava.introducao;

public class Aula06EstruturasCondicionais02 {

        // idade < 15 = (categoria infantil)
        // idade >= 15 && idade < 18 (categoria juvenil)
        // idade >=18 (categoria adulto)
    public static void main(String[] args){
        /* 

        if(idade < 15){
            categoria = "Categoria infantil.";
        } else if(idade >=15 && idade <18){
            categoria = "Categoria juvenil.";
        }else{
            categoria = "Categoria adulto.";
        }
        System.out.println(categoria);
        */

        int idade = 19;
        String categoria;

        categoria = idade < 15 ? "Categoria infantil." : idade >= 15 && idade <18 ? "Categoria juvenil." : "Categoria adulto.";
        System.out.println(categoria);
    }
}
