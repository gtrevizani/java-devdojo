package br.com.start.maratonajava.introducao;

public class Aula18ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 31;    dias[1][0] = 31;    dias[2][0] = 4;
        dias[0][1] = 40;    dias[1][1] = 1;     dias[2][1] = 5;
        dias[0][2] = 9;     dias[1][2] = 3333;  dias[2][2] = 111;

        //for
        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[i].length ; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-------------------------------");

        //foreach
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
