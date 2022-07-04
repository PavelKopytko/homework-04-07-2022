package by.tr.home.linear_array;

import java.util.Random;

/*Дана последовательность целых чисел a1,a2,...,an . Образовать новую последовательность, 
 * выбросив из исходной те члены, которые равны min(a1,a2,...,an)*/

public class Task17 {

	public static void main(String[] args) {

		Random rand = new Random();

		int r = rand.nextInt(20) + 1;

		int[] mas = new int[r];

		int min;

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(25);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d] ", mas[i]);
		}

		min = mas[0];

		for (int i = 1; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}

		int count = mas.length;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == min) {
				count--;
			}
		}

		System.out.println("\nmin = " + min);
		System.out.println("mas.length = " + mas.length);
		System.out.println("array.length = " + count);

		int[] array = new int[count];

		for (int i = 0, j = 0; i < mas.length; i++) {
			if (mas[i] != min) {
				array[j++] = mas[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%2d] ", array[i]);
		}

	}

}
