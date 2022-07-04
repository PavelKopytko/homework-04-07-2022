package by.tr.home.linear_array;

import java.util.Random;

/*Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа*/

public class Task06 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(20) + 1;

		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print("[" + mas[i] + "] ");
		}

		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 1; i < mas.length; i++) {
				int temp;
				if (mas[i] < mas[i - 1]) {
					temp = mas[i - 1];
					mas[i - 1] = mas[i];
					mas[i] = temp;
					sorted = false;
				}
			}
		}

		System.out.println("\n\nSorted array");

		for (int m : mas) {
			System.out.print("{" + m + "} ");
		}

		System.out.println("\nLength of axis: " + (mas[mas.length - 1] - mas[0]));

	}

}
