package asen.sorthingalgorithums;
/**
 * Implementation of the Bubble sort algorithm
 * @author asen
 *
 */
public class BubbleSort implements Sort {

	@SuppressWarnings("unused")
	public int[] sort(int... elements) throws NullPointerException {

		if (elements.length == 1) {
			return elements;
		}

		if (elements != null) {
			int temp;
			for (int i = 0; i < elements.length; i++) {

				boolean hasASwap = false;
				for (int j = 0; j < elements.length - 1 - i; j++) {

					if (elements[j] > elements[j + 1]) {
						temp = elements[j];
						elements[j] = elements[j + 1];
						elements[j + 1] = temp;
						hasASwap = true;
					}
				}

				// if is sorted - then we don't nead more iterations
				if (!hasASwap) {
					break;
				}
			}

		} else {
			throw new NullPointerException();
		}
		printArray(elements);
		return elements;
	}

}
