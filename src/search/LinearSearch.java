package search;

import util.SearchUtility;
import util.Utility;

/**
 * @author Mayank Jain
 *
 */
public class LinearSearch {

	Integer arraySize = null;
	Integer array[] = null;
	Integer searchElement = null;

	public LinearSearch() {
		arraySize = Utility.getRandomNumber(0, 100);
		array = Utility.getRandomArray(arraySize);
		this.searchElement = array[Utility.getRandomNumber(0, array.length - 1)];
	}

	public LinearSearch(Boolean useMockData) {
		if (useMockData) {
			arraySize = Utility.getRandomNumber(0, 100);
			array = Utility.getRandomArray(arraySize);
			this.searchElement = array[Utility.getRandomNumber(0, array.length - 1)];
		}
	}

	private void showResult(int index) {
		System.out.println("\n##-- Linear Search --##");
		System.out.println("Size of array: \t\t" + array.length);
		System.out.println("Search Element: \t" + searchElement);
		if (index == -1) {
			System.out.println("Element not found in list");
		} else {
			System.out.println("Element found at index: " + index);
		}
		System.out.println("##-- Linear Search Completed --## \n");
	}

	/**
	 * This method searches element picked randomly in between 0 to 1000.
	 * 
	 * @return Returns the index of searched element if element will be in array
	 *         else it will return -1
	 */
	public int search() {
		return search(searchElement);
	}

	/**
	 * This method searches element passed in argument.
	 * 
	 * @param searchElement
	 *            Element to search
	 * @return Returns the index of searched element if element will be in array
	 *         else it will return -1
	 */
	public int search(Integer searchElement) {
		if (array == null) {
			array = SearchUtility.getArrayInput();
		}
		if (searchElement == null) {
			searchElement = SearchUtility.getNumberInput();
		}
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchElement) {
				index = i;
				break;
			}
		}
		showResult(index);
		return index;
	}

}
