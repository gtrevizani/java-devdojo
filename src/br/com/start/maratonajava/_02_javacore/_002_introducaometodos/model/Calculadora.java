package br.com.start.maratonajava._02_javacore._002_introducaometodos.model;

public class Calculadora {

    public void somaDoisNumeros(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public void subtraiDoisNumeros(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
       return num1 / num2;
    }

    public double divideDoisNumeros2(double num1, double num2){
        if (num2 != 0){
            return num1 / num2;
        }
        return 0;
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
