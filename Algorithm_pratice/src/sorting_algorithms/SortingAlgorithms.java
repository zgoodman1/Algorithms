/* 
 * abstract parent class for all sorting algorithms (bubble, selection, insertion, etc.)
 * as well as container for general methods to test the validity of input and a swapping
 * method to be used in the sorting methods 
 */

package sorting_algorithms;

public abstract class SortingAlgorithms {

	public abstract void sort(int[] arr);
	
	protected void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	protected void valid(int[] arr) {
		if (arr == null) {
			throw new IllegalArgumentException("integer array cannot be null");
		}
	}
}
