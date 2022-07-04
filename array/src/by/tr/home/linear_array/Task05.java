package by.tr.home.linear_array;

import java.util.Random;

/*Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел 
 * этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте*/

public class Task05 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(20) + 1;

		int[] mas = new int[n];

		int countEven = 0;

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print("[" + mas[i] + "] ");
		}

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				countEven++;
			}
		}

		int[] even = new int[countEven];

		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0 && mas[i] != 0) {
				even[j++] = mas[i];
			}
		}

		if (countEven > 0) {
			System.out.println("\n\nArray of even elements");

			for (int m : even) {
				System.out.print("{" + m + "} ");
			}
		} else {
			System.out.println("\nEven elements is not found");
		}

	}

}
