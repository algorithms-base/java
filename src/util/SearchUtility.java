package util;

import java.util.Scanner;

/**
 * @author Mayank Jain
 *
 */
public class SearchUtility {

	public static Integer[] getArrayInput() {
		Scanner scanner = new Scanner(System.in);
		Integer[] array = null;
		System.out.println("Enter size of array: ");
		try {
			int size = scanner.nextInt();
			array = new Integer[size];
			System.out.println("Enter " + size + " elements of array: ");
			for (int i = 0; i < size; i++) {
				array[i] = scanner.nextInt();
			}
		} catch (Exception exception) {
			System.out.println("Invalid Input captured. Please rerun program with valid values");
			scanner.close();
		}
		return array;
	}

	public static Integer getNumberInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		Integer number = null;
		try {
			number = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("You have entered wrong number. Please rerun program and pass valid number.");
			scanner.close();
		}
		return number;
	}

}
