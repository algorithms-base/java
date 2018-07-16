package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Mayank Jain
 *
 */
public class Utility {

	public static Integer[] getRandomArray(int size) {
		Integer[] array = new Integer[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			array[i] = random.nextInt(1000);
		}
		return array;
	}

	public static int getRandomNumber(int min, int max) {
		Random random = new Random();
		return min + random.nextInt(max);
	}

	public static Integer[] sort(Integer[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}

		return (Integer[]) list.toArray();
	}

}
