package base.runner;

import search.LinearSearch;

public class AlgoController {

	public static void main(String[] args) {
		new LinearSearch().search();
		// new LinearSearch(false).search();
		// new LinearSearch().search(50);
		new LinearSearch(true).search(50);

	}
}
