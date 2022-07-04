package by.tr.home.array_of_array;

import java.util.Random;

/*Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму 
 * матрицу и номера строк, в которых число 5 встречается три и более раз*/

public class Task30 {

	public static void main(String[] args) {

		Random rand = new Random();

		int[][] mas = new int[10][20];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(16);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d] ", mas[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < mas.length; i++) {
			int count = 0;
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.print("\nIn line " + i);
			}
		}

	}

}
