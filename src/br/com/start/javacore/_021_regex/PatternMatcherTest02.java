package br.com.start.javacore._021_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Retorna todos os digitos
        // \D = Retorna tudo que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindos os em branco
        // \w = a-Z ou A-Z, todos os digitos e _
        // \W = Tudo o que não for incluso no \w

        String regex = "\\W";
//        String texto = "abaaba";
        String texto2 = "@#hhj12v_%$ gfg21 kh2";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+ " " +matcher.group()+"\n");
        }
    }
}
