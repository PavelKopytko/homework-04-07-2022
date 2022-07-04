package by.tr.home.linear_array;

import java.util.Random;
import java.util.Scanner;

/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, 
 * большие данного Z, этим числом. Подсчитать количество замен*/

public class Task07 {

	public static void main(String[] args) {

		Random rand = new Random();

		int n = rand.nextInt(20) + 1;

		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(20);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.print("[" + mas[i] + "] ");
		}

		System.out.println("\nEnter Z \n>");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println(">");

		}
		int z = sc.nextInt();

		for (int m : mas) {
			if (m > z) {
				m = z;
			}
			System.out.print("{" + m + "} ");
		}

	}

}
