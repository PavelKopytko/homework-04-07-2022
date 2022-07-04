package by.tr.home.array_of_array;

import java.util.Random;

/*Найдите наибольший элемент матрицы и заменить все нечетные элементы на него*/

public class Task35 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(5) + 1;
		int m = rand.nextInt(7) + 1;

		int[][] mas = new int[n][m];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}

		int max = mas[0][0];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
			}
		}

		System.out.println("Max = " + max);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] % 2 != 0) {
					mas[i][j] = max;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}

	}

}
