package br.com.start._02_javacore._018_string;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        nome = nome.substring(0,3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("William Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
