package by.tr.home.linear_array;

import java.util.Random;

/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов*/

public class Task08 {

	public static void main(String[] args) {

		Random rand = new Random();

		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;

		int n = rand.nextInt(20) + 1;

		double[] mas = new double[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble() - 0.5;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2.2f] ", mas[i]);
		}

		for (double m : mas) {
			if (m > 0) {
				countPositive++;
			} else if (m < 0) {
				countNegative++;
			} else {
				countZero++;
			}
		}

		System.out.println();
		System.out.println("Count of positive: " + countPositive);
		System.out.println("Count of negative: " + countNegative);
		System.out.println("Count of zero: " + countZero);

	}

}
