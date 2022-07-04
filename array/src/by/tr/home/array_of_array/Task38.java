package by.tr.home.array_of_array;

import java.util.Random;

/*Найдите сумму двух матриц*/

public class Task38 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(6) + 2;

		int[][] mas = new int[n][n];
		int[][] array = new int[n][n];
		int[][] result = new int[n][n];

		fill(mas);
		fill(array);

		print(mas);
		System.out.println();
		print(array);
		System.out.println();
		subtraction(mas, array, result);
		print(result);

	}

	public static void fill(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50);
			}
		}
	}

	private static void print(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}
	}

	private static void subtraction(int[][] mas, int[][] array, int[][] result) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				result[i][j] = mas[i][j] + array[i][j];
			}
		}
	}

}
