package asen.sorthingalgorithums;

/**
 * Declare all implementations of the Sort interface, and call the one you want.
 * 
 * @author asen
 *
 */

public enum SortingType {

	bubbleSort(new BubbleSort()), countingSort(new CountingSort());

	private Sort method;

	SortingType(Sort method) {
		this.method = method;
	}

	public int[] sort(int... elements) {
		return method.sort(elements);
	}
}
