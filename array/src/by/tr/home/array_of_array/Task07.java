package by.tr.home.array_of_array;

import java.util.Random;

/*Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов*/

public class Task07 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = 5;
		int m = 5;

		int[][] mas = new int[n][m];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(9) - 4;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{%d} - ", i);
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[ %2d] ", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (Math.abs(mas[i][j]) % 2 == 1 && mas[i][j] < 0) {

					sum += mas[i][j];
					System.out.printf("[%2d] ", mas[i][j]);

				}
			}
		}
		System.out.printf("\nSum of modules negative elements: %2d", -sum);
	}

}
