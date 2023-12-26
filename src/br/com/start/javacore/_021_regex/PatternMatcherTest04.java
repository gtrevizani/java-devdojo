package br.com.start.javacore._021_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Retorna todos os digitos
        // \D = Retorna tudo que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindos os em branco
        // \w = a-Z ou A-Z, todos os digitos e _
        // \W = Tudo o que não for incluso no \w
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de n até m
        // ()
        // | o(v|c)o ovo | oco
        // $
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+ " " +matcher.group()+"\n");
        }
        int numeroHex = 0xDFA;
        System.out.println(numeroHex);
    }
}
