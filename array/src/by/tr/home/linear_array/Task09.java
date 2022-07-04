package by.tr.home.linear_array;

import java.util.Random;

/* Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы*/

public class Task09 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(20) + 1;

		double[] mas = new double[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble() - 0.5;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2.2f] ", mas[i]);
		}

		int minIndex = 0;
		int maxIndex = 0;

		for (int i = 1; i < mas.length; i++) {
			if (mas[i] < mas[minIndex]) {
				minIndex = i;
			}
			if (mas[i] > mas[maxIndex]) {
				maxIndex = i;
			}
		}

		System.out.printf("\nmin element %2.2f: ", mas[minIndex]);
		System.out.printf("\nmax element %2.2f: \n", mas[maxIndex]);

		double temp;
		temp = mas[minIndex];
		mas[minIndex] = mas[maxIndex];
		mas[maxIndex] = temp;

		for (double m : mas) {
			System.out.printf("{%2.2f} ", m);
		}

	}

}
