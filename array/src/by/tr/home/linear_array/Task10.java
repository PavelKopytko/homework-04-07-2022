package by.tr.home.linear_array;

import java.util.Random;

/*Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i*/

public class Task10 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(20) + 1;

		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{i=%2d} ", i);
		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d] ", mas[i]);
		}

		System.out.println("\n\nSorted array");

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print("[" + mas[i] + "] ");
			}
		}
	}

}
