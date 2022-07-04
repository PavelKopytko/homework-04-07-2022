package by.tr.home.linear_array;

/*Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей*/

public class Task04 {

	public static void main(String[] args) {

		int[] mas = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 14, 16 };

		boolean upward = true;

		for (int i = 1; i < mas.length; i++) {
			if (mas[i] < mas[i - 1]) {
				upward = false;
			}
		}

		if (upward) {
			System.out.println("Последовательность возрастающая");
		} else if (!upward) {
			System.out.println("Последовательность не возрастающая");
		}

	}

}
