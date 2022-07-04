package by.tr.home.array_of_array;

import java.util.Random;

/*Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов*/

public class Task33 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = 10;

		int[][] mas = new int[n][n];

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

		// Сортировка по возрастанию
		for (int j = 0; j < mas[0].length; j++) {

			boolean sorted = false;
			while (!sorted) {
				sorted = true;
				for (int i = 0; i < mas.length - 1; i++) {
					if (mas[i][j] > mas[i + 1][j]) {
						int temp = mas[i][j];
						mas[i][j] = mas[i + 1][j];
						mas[i + 1][j] = temp;
						sorted = false;
					}
				}
			}
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}

		// Сортировка по убыванию
		for (int j = 0; j < mas[0].length; j++) {

			boolean sorted = false;
			while (!sorted) {
				sorted = true;
				for (int i = 0; i < mas.length - 1; i++) {
					if (mas[i][j] < mas[i + 1][j]) {
						int temp = mas[i][j];
						mas[i][j] = mas[i + 1][j];
						mas[i + 1][j] = temp;
						sorted = false;
					}
				}
			}
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}

	}

}
