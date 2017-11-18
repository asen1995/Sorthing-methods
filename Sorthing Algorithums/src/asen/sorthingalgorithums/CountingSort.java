package asen.sorthingalgorithums;

/**
 * The implementation of the countingsort algorithm
 * @author asen
 *
 */

public class CountingSort implements Sort {

	@SuppressWarnings("unused")
	@Override
	public int[] sort(int... elements) throws NullPointerException {

		if (elements.length == 1) {
			printArray(elements);
			return elements;
		} else if (elements != null) {

			int maxNum = elements[0];
			// find max element
			for (int i = 0; i < elements.length; i++) {
				if (maxNum < elements[i]) {
					maxNum = elements[i];
				}
			}

			int numbersCount[] = new int[maxNum + 1];

			int result[] = new int[elements.length];

			for (int i = 0; i < elements.length; i++) {
				int num = elements[i];
				numbersCount[num]++;
			}

			for (int i = 1; i < numbersCount.length; i++) {

				numbersCount[i] += numbersCount[i - 1];
			}

			for (int i = 0; i < elements.length; i++) {
				int num = elements[i];
				numbersCount[num]--;
				int pos = numbersCount[num];
				result[pos] = num;
			}
			printArray(result);

			return result;

		} else {
			throw new NullPointerException();
		}

	}

}
