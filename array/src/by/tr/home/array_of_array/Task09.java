package by.tr.home.array_of_array;

import java.util.Random;

/*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали*/

public class Task09 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = 5;

		int[][] mas = new int[n][n];

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

		System.out.println("-----------------------");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.printf("[%2d] ", mas[i][j]);
				} else {
					System.out.print("[\s\s] ");
				}
			}
			System.out.println();
		}

		System.out.println("-----------------------");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == mas[i].length - 1 - j) {
					System.out.printf("[%2d] ", mas[i][j]);
				} else {
					System.out.print("[\s\s] ");
				}
			}
			System.out.println();
		}

	}

}
