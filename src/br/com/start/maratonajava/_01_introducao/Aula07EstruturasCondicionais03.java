package br.com.start.maratonajava._01_introducao;

public class Aula07EstruturasCondicionais03 {
    public static void main(String[] args){
        //Doar se salário >= 5000
        
        //String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        //String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        
        /*
        if(salario >= 5000){
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
        */

        //System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);

        double salario = 6000;

        // Clean code
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        boolean possoDoar = salario > 5000 ? true : false;
        System.out.println(resultado);
        System.out.println(possoDoar);
    }
}
