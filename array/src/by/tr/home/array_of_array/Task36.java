package by.tr.home.array_of_array;

import java.util.Random;

/*Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается
как среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат
сглаживания заданной матрицы*/

public class Task36 {

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

		print(mas);

		double[][] result = getArray(mas);

		System.out.println("\nSmoothing result\n");

		print(result);

	}

	private static void print(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}
	}

	private static void print(double[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2.2f] ", mas[i][j]);
			}
			System.out.println();
		}
	}

	private static double[][] getArray(int[][] mas) {
		double[][] array = new double[mas.length][mas[0].length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (i == 0 && j == 0) {
					array[i][j] = (mas[i][j + 1] + mas[i + 1][j + 1] + mas[i + 1][j]) / 3.0;

				} else if (i == 0 && j > 0 && j < array[i].length - 1) {
					array[i][j] = (mas[i][j + 1] + mas[i + 1][j + 1] + mas[i + 1][j] + mas[i + 1][j - 1]
							+ mas[i][j - 1]) / 5.0;

				} else if (i == 0 && j == array[i].length - 1) {
					array[i][j] = (mas[i + 1][j] + mas[i + 1][j - 1] + mas[i][j - 1]) / 3.0;

				} else if (i > 0 && i < array.length - 1 && j == 0) {
					array[i][j] = (mas[i - 1][j] + mas[i - 1][j + 1] + mas[i][j + 1] + mas[i + 1][j + 1]
							+ mas[i + 1][j]) / 5.0;

				} else if (i > 0 && i < array.length - 1 && j == array[i].length - 1) {
					array[i][j] = (mas[i - 1][j] + mas[i - 1][j - 1] + mas[i][j - 1] + mas[i + 1][j - 1]
							+ mas[i + 1][j]) / 5.0;

				} else if (i == array.length - 1 && j == 0) {
					array[i][j] = (mas[i - 1][j] + mas[i - 1][j + 1] + mas[i][j + 1]) / 3.0;

				} else if (i == array.length - 1 && j > 0 && j < array[i].length - 1) {
					array[i][j] = (mas[i][j - 1] + mas[i - 1][j - 1] + mas[i - 1][j] + mas[i - 1][j + 1]
							+ mas[i][j + 1]) / 5.0;

				} else if (i == array.length - 1 && j == array[i].length - 1) {
					array[i][j] = (mas[i][j - 1] + mas[i - 1][j - 1] + mas[i - 1][j]) / 3.0;

				} else if (i > 0 && i < array.length - 1 && j > 0 && j < array[i].length - 1) {
					array[i][j] = (mas[i - 1][j - 1] + mas[i - 1][j] + mas[i - 1][j + 1] + mas[i][j + 1]
							+ mas[i + 1][j + 1] + mas[i + 1][j] + mas[i + 1][j - 1] + mas[i][j - 1]) / 8.0;
				}
			}
		}
		return array;
	}

}
