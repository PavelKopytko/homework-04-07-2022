package by.tr.home.array_of_array;

import java.util.Random;

/*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего*/

public class Task06 {

	public static void main(String[] args) {
		Random rand = new Random();

		int n = 8;
		int m = 6;

		double[][] mas = new double[n][m];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextDouble(9);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{%d} - ", i);
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2.2f] ", mas[i][j]);
			}
			System.out.println();
		}

//		System.out.println("-----------------------");

		for (int i = 1; i < mas[i].length; i += 2) {
			for (int j = 0; j < mas.length; j++) {
				if (mas[0][i] > mas[mas.length - 1][i]) {
					System.out.printf("\n[%2.2f] ", mas[j][i]);
				}
			}
			System.out.println();
		}

	}

}
