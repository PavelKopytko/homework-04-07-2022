package by.tr.home.array_of_array;

import java.util.Random;

/*Дана матрица. Вывести на экран первую и последнюю строки*/

public class Task04 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = 4;
		int m = 6;

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

		System.out.println();

		for (int i = 0; i < mas[0].length; i++) {
			System.out.printf("{%d} ", mas[0][i]);
		}

		System.out.println();

		for (int i = 0; i < mas[0].length; i++) {
			System.out.printf("{%d} ", mas[mas.length - 1][i]);
		}

	}

}
