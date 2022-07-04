package by.tr.home.array_of_array;

import java.util.Random;

/*Найдите произведение двух матриц*/

public class Task39 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(6) + 2;
		int m = rand.nextInt(6) + 2;
		int k = rand.nextInt(4) + 1;

		int[][] mas = new int[n][m];
		int[][] array = new int[m][k];

		int[][] result;

		fill(mas);
		fill(array);

		print(mas);
		System.out.println();
		print(array);

		result = multiplication(mas, array);

		System.out.println("\nMultiplicarion of matrix\n");

		print(result);

	}

	public static void fill(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(5);
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

	private static int[][] multiplication(int[][] mas, int[][] array) {

		int[][] result = new int[mas.length][array[0].length];

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				for (int k = 0; k < array.length; k++) {
//					System.out.print(mas[i][k] + "*" + array[k][j] + " + ");
					result[i][j] += mas[i][k] * array[k][j];
				}
//				System.out.println();
			}
		}
		return result;
	}

}
