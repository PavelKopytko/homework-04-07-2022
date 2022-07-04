package by.tr.home.linear_array;

import java.util.Random;

/*Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток 
 * от деления на М равен L (0 < L < М-1)*/

public class Task11 {

	public static void main(String[] args) {

		int m = 6;

		Random rand = new Random();

		int n = rand.nextInt(20) + 1;

		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d] ", mas[i]);
		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % m > 0 && mas[i] % m < (m - 1)) {
				System.out.printf("{%2d} ", mas[i]);
			}
		}

	}

}
