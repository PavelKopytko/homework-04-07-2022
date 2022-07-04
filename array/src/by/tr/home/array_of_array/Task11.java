package by.tr.home.array_of_array;

import java.util.Random;

/*Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
строка слева направо, третья строка справа налево и так далее*/

public class Task11 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = 5;
		int m = 8;

		int[][] mas = new int[n][m];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(9);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("---------------------------------------");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 == 0) {
					System.out.printf("{%2d} ", mas[i][mas[i].length - 1 - j]);
				} else {
					System.out.printf("[%2d] ", mas[i][j]);
				}
			}
			System.out.println();
		}

	}

}
