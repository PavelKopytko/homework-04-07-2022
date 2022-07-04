package by.tr.home.linear_array;

import java.util.Random;

/*Даны действительные числа a1,a2,...,an . Найти max(a1 + a2n,a2 + a2n−1,...,an + an+1)*/

public class Task16 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(20);

		double[] mas = new double[n];

		double max;

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

		max = mas[0] + mas[mas.length - 1];

//		System.out.println("\nmax = " + max);

		for (int i = 1; i < (mas.length) / 2; i++) {
			double maxI = mas[i] + mas[mas.length - 1 - i];
//			System.out.println("maxI = " + mas[i] + " " + mas[mas.length - 1 - i] + " " + maxI);
			if (maxI > max) {
				max = maxI;
			}
		}

		System.out.printf("\nMax = %2.2f ", max);

	}

}
