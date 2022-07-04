package by.tr.home.array_of_array;

import java.util.Random;

/*Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество 
 * двузначных чисел в ней*/

public class Task31 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = 10;

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d] ", mas[i][j]);
			}
			System.out.println();
		}

		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > 9 && mas[i][j] < 100) {
					count++;
				}
			}
		}
		System.out.println("Count = " + count);
	}

}
