package asen.application;

import java.util.Random;

import asen.sorthingalgorithums.SortingType;


/**
 * Test of the algorithum's
 * @author asen
 *
 */

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();

		SortingType typeOfSort = SortingType.bubbleSort;

		int[] array = new int[rand.nextInt(100)];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(200000);
		}
		typeOfSort.sort(array);

	}

}
