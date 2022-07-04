package by.tr.home.array_of_array;

import java.util.Random;

/*Найти положительные элементы главной диагонали квадратной матрицы*/

public class Task29 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(10) + 1;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10) - 6;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("\nPositive elements of main diagonal");

		for (int i = 0; i < mas.length; i++) {
			if (mas[i][i] > 0) {
				System.out.printf("[%2d] ", mas[i][i]);
			}
		}

	}

}
