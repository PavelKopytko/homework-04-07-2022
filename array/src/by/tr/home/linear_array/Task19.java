package by.tr.home.linear_array;

import java.util.Random;

/*В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них*/

public class Task19 {

	public static void main(String[] args) {

		Random rand = new Random();

		int r = rand.nextInt(20) + 1;

		int[] mas = new int[r];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(25);
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d] ", mas[i]);
		}

		System.out.println("\nCount of repeat every element of array");

		int[] repeatArray = new int[mas.length];

		for (int i = 0; i < mas.length; i++) {
			int count = 0;
			for (int j = 0; j < mas.length; j++) {
				if (mas[i] == mas[j]) {
					count++;
				}
			}
			repeatArray[i] = count;
		}

		for (int i = 0; i < repeatArray.length; i++) {
			System.out.printf("[%2d] ", repeatArray[i]);
		}

		int maxRepeat = repeatArray[0];
		int min = mas[0];

		for (int i = 1; i < repeatArray.length; i++) {
			
			if (repeatArray[i] > maxRepeat) {
				maxRepeat = repeatArray[i];
				min = mas[i];
			} else if (repeatArray[i] == maxRepeat && mas[i] < min) {
				min = mas[i];
			}
		}
		System.out.println();
		System.out.println("Most frequent element or minimum from them: " + min);

	}

}
