package by.tr.home.array_of_array;

import java.util.Random;
import java.util.Scanner;

/* В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы 
 * одного столбца поставить на соответствующие им позиции другого, а его элементы 
 * второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры*/

public class Task27 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

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
				mas[i][j] = rand.nextInt(100);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("\nEnter number of column for replace \n>");

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println(">");
		}

		int k = sc.nextInt();

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println(">");
		}

		int p = sc.nextInt();

		if (k < mas[0].length && k >= 0 && p >= 0 && p < mas[0].length) {

			for (int i = 0; i < mas.length; i++) {
				int temp = mas[i][k];
				mas[i][k] = mas[i][p];
				mas[i][p] = temp;
			}
		} else {
			System.out.println("Entered incorrect k and p");
			return;
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
