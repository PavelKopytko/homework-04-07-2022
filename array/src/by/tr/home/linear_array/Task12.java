package by.tr.home.linear_array;

import java.util.Random;

/*Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
простыми числами*/

public class Task12 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(20) + 10;

		double[] mas = new double[n];

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("{%4d} ", i);
		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble();
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2.2f] ", mas[i]);
		}

		System.out.println("\n\n\tArray with prime index");
		System.out.println("\t----------------------");

		if (mas.length > 2) {

			System.out.printf("[%2.2f] ", mas[2]);

			double sum = mas[2];

//			System.out.println();

			for (int i = 3; i < mas.length; i += 2) {
				int count = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count < 3) {
					sum += mas[i];
					System.out.printf("[%2.2f] ", mas[i]);
				}
			}
			System.out.printf("\n\nSum of numbers with prime index: %2.2f", sum);

		} else {
			System.out.println("Prime index is not found");
		}

	}

}
