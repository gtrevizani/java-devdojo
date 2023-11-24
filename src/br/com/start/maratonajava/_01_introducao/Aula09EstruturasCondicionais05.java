package br.com.start.maratonajava._01_introducao;

public class Aula09EstruturasCondicionais05 {
	// Imprima o dia da semana, considerando 1 como domingo
	public static void main(String[] args) {
		byte dia = 5;
		
		switch(dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terca");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sabado");
			default:
				System.out.println("Opção inválida");
		}

		char sexo = 'M';
		switch (sexo){
			case 'M':
				System.out.println("Homem");
				break;
			case 'F':
				System.out.println("Mulher");
				break;
			default:
				System.out.println("Undefined");
				break;
		}
	}

}
