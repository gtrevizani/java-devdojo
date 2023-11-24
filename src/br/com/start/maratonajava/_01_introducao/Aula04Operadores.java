package br.com.start.maratonajava._01_introducao;

public class Aula04Operadores {
	public static void main(String[] args) {
		// + - / *
		int numero81 = 10;
		int numero82 = 20;
		double resultado = numero81 / (double) numero82;

		System.out.println(resultado);

		// %
		int resto = 20 % 7;
		System.out.println(resto);

		// < > <= >= == !=
		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
		System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);

		// && (AND) || (OU) ! (NOT)
		int idade = 29;
		float salario = 3500F;
		boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
		boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

		System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
		System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMenorQueTrinta);

		// = += -= *= /= %=
		double bonus = 1800;
		bonus += 2000;
		System.out.println(bonus);

		// ++ --
		int contador = 0;
		contador += 1;
		contador++;
		contador--;
		++contador;
		--contador;
		int contador2 = 0;
		System.out.println(++contador2);
	}
}