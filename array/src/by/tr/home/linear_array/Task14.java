package by.tr.home.linear_array;

import java.util.Random;

/*Дан одномерный массив A[N]. Найти: max(a2,a4,...,a2k) + min(a1,a3,...,a2k+1)*/

public class Task14 {

	public static void main(String[] args) {

		Random rand = new Random();

		int r = rand.nextInt(20);

		int[] mas = new int[r];

		int max;
		int min;

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(25);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d] ", mas[i]);
		}

		max = mas[1];
		min = mas[0];

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0 && mas[i] < min) {
				min = mas[i];
			} else if (i % 2 == 1 && mas[i] > max) {
				max = mas[i];
			}
		}

		System.out.println("\nmax = " + max);
		System.out.println("min = " + min);

	}

}
