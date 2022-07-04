package by.tr.home.linear_array;

import java.util.Random;

/*Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - 
 * положительное или отрицательное*/

public class Task03 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(20) + 1;

		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100) - 35;
			System.out.print("[" + mas[i] + "] ");
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print("[" + mas[i] + "] ");
		}

		int i = 0;
		while (i < mas.length) {
			if (mas[i] > 0) {
				System.out.println("\npositive at first");
				break;
			} else if (mas[i] < 0) {
				System.out.println("\nnegative at first");
				break;
			}
			i++;
		}

	}

}
