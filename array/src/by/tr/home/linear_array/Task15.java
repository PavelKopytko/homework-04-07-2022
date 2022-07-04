package by.tr.home.linear_array;

import java.util.Random;

/*Дана последовательность действительных чисел a1,a2,...,an . Указать те ее элементы, 
 * которые принадлежат отрезку [с, d]*/

public class Task15 {

	public static void main(String[] args) {

		Random rand = new Random();

		int r = rand.nextInt(20);

		int[] mas = new int[r];

		int c = 1;
		int d = 10;

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(25);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d] ", mas[i]);
		}

		System.out.println("\nElements from c to d");

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] >= c && mas[i] <= d) {
				System.out.printf("[%2d] ", mas[i]);
			}
		}

	}

}
