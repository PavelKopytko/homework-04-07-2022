package by.tr.home.array_of_array;

import java.util.Random;

/*Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов
массива*/

public class Task08 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = 8;
		int m = 6;

		int count = 0;

		int[][] mas = new int[n][m];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(9);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{%d} - ", i);
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%d] ", mas[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) {
					count++;
				}
			}
		}
		System.out.printf("\nNumber 7 is occured %d times", count);

	}

}
