package by.tr.home.linear_array;

/*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К*/

public class Task01 {

	public static void main(String[] args) {

		int k;

		k = 3;
		int sum = 0;

		int[] array = new int[] { 1, 2, 5, 6, 8, 9, 15, 22, 21, 24, 4, 3, 19, 7 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				System.out.print(array[i] + " ");
				sum += array[i];
			}
		}
		System.out.println("\nСумма элементов, кратных " + k + " = " + sum);

	}

}
