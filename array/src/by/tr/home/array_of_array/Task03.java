package by.tr.home.array_of_array;

import java.util.Random;

/*Дана матрица. Вывести на экран первый и последний столбцы*/

public class Task03 {

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

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("\n[%d] ", mas[i][0]);
		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("\n[%d] ", mas[i][mas[i].length - 1]);
		}

	}

}
