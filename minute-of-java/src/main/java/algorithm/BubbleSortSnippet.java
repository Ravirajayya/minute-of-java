package algorithm;

/**
 * BubbleSortSnippet.
 */
public class BubbleSortSnippet {

	public static void main(String[] args) {

		int[] arrayOfInput = { 1, 3, 5, 2, 4 };
		bubbleSort(arrayOfInput);

	}

	/**
	 * Sort an array with bubbleSort algorithm.
	 *
	 * @param arrayOfInput array to sort
	 */
	private static void bubbleSort(int[] arrayOfInput) {
		int length = arrayOfInput.length - 1;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i; j++) {
				if (arrayOfInput[j] > arrayOfInput[j + 1]) {
					int tmp = arrayOfInput[j];
					arrayOfInput[j] = arrayOfInput[j + 1];
					arrayOfInput[j + 1] = tmp;
				}
			}
		}
	}

}
