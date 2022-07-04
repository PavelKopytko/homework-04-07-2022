package by.tr.home.array_of_array;

import java.util.Random;

/*Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]*/

public class Task02 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = 2;
		int m = 3;

		int[][] mas = new int[n][m];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(9);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%d] ", mas[i][j]);
			}
			System.out.println();
		}
	}

}
