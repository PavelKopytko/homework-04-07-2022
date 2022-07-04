package by.tr.home.linear_array;

import java.util.Random;

/*Определить количество элементов последовательности натуральных чисел, кратных числу М 
 * и заключенных в промежутке от L до N*/

public class Task13 {

	public static void main(String[] args) {

		Random rand = new Random();

		int r = rand.nextInt(20);

		int[] mas = new int[r];

		int m = 2;
		int l = 0;
		int n = 20;
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(25);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d] ", mas[i]);
		}

		System.out.println();

		System.out.println("Search elements");

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > l && mas[i] < n && mas[i] % m == 0) {
				count++;
				System.out.printf("[%2d] ", mas[i]);
			}
		}

		System.out.println("\nCount = " + count);

	}

}
