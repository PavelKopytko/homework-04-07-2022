package by.tr.home.array_of_array;

import java.util.Random;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов*/

public class Task32 {

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
		for (int i = 0; i < mas.length; i++) {

			boolean sorted = false;
			while (!sorted) {
				sorted = true;
				for (int j = 0; j < mas[i].length - 1; j++) {
					if (mas[i][j] > mas[i][j + 1]) {
						int temp = mas[i][j];
						mas[i][j] = mas[i][j + 1];
						mas[i][j + 1] = temp;
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
		for (int i = 0; i < mas.length; i++) {

			boolean sorted = false;
			while (!sorted) {
				sorted = true;
				for (int j = 0; j < mas[i].length - 1; j++) {
					if (mas[i][j] < mas[i][j + 1]) {
						int temp = mas[i][j];
						mas[i][j] = mas[i][j + 1];
						mas[i][j + 1] = temp;
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
