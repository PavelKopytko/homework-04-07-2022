package by.tr.home.linear_array;

/*В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов*/

public class Task02 {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 0, 3, 5, 6, 9, 0, 5, 4, 0, 8, 0, 6, 5, 0, 0, 5, 0, 5, 0, 4, 0, 555, 98, 5 };

		int countZero = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "] ");
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				countZero++;
			}
		}

		int[] zeroPositionsArray = new int[countZero];

		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				zeroPositionsArray[j] = i;
				j++;
			}
		}
		System.out.println();
		System.out.println("Массив с номерами индексов нулевых элементов");

		for (int i = 0; i < zeroPositionsArray.length; i++) {
			System.out.print("{" + zeroPositionsArray[i] + "} ");
		}

	}

}
