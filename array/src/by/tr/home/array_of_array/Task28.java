package by.tr.home.array_of_array;

import java.util.Random;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
содержит максимальную сумму*/

public class Task28 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n;
		int m;

		n = 6;
		m = 8;

		int[][] mas = new int[n][m];

		for (int i = 0; i < mas[0].length; i++) {
			System.out.printf("{%2d} ", i);
		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}

		int maxSum = 0;
		int maxSumIndex = 0;

		for (int i = 0; i < mas.length; i++) {
			maxSum += mas[i][0];
		}

		for (int j = 0; j < mas[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < mas.length; i++) {
				sum += mas[i][j];
			}
			System.out.printf(" %d  ", sum);
			if (sum > maxSum) {
				maxSum = sum;
				maxSumIndex = j;
			}
		}

		System.out.printf("\nMax sum in column number %d", maxSumIndex);

	}

}
