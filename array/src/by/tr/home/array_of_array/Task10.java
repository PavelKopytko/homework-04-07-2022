package by.tr.home.array_of_array;

import java.util.Random;

/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы*/

public class Task10 {

	public static void main(String[] args) {
		Random rand = new Random();

		int n = 5;
		int m = 8;

		int k = 0;
		int p = 2;

		int[][] mas = new int[n][m];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(9);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{%d} - ", i);
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("---------------------------------------");

		if (k < mas.length && p < mas[0].length && k >= 0 && p >= 0) {
			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {

					if (i == k || p == j) {
						System.out.printf("[%2d] ", mas[i][j]);
					} else {
						System.out.print("[\s\s] ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("Enter correct k and p");
		}

	}

}
