package asen.sorthingalgorithums;

public interface Sort {

	public int[] sort(int... elements) throws NullPointerException;

	public default void printArray(int... elements) {

		for (int i = 0; i < elements.length; i++) {
			System.out.print(" " + elements[i]);
		}
		System.out.println();
	}

}
