package by.tr.home.array_of_array;

import java.util.Random;

/*Сформировать случайную матрицу n x m, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца*/

public class Task34 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(10) + 1;
		int m = rand.nextInt(7) + 1;

		int[][] mas = new int[n][m];

		for (int j = 1; j < mas[0].length; j++) {
			int count = 0;

			for (int i = 0; i < mas.length; i++) {
				mas[i][j] = 1;
				count++;
				if (count == j) {
					break;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d] ", mas[i][j]);
			}
			System.out.println();
		}
	}

}
