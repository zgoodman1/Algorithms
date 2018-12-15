package sorting_algorithms;


/* 
 * Given an array of integers, bubble sort orders the integers in order of least
 * to greatest. This is done by stepping through the array and comparing adjacent
 * elements and swapping them if the first is greater than the second. This is 
 * performed on every element of the array as many times as needed until it is 
 * determined that no swaps were made on a particular iteration, thus the array is
 * sorted.
 */

public class BubbleSort extends SortingAlgorithms {

	public void sort(int[] arr) {
		int i, j;
		int n = arr.length;
		boolean swap;
		
		for(i = 0; i < n - 1; i++) 
		{
			swap = false;
			for(j = 0; j < n - i - 1; j++) 
			{			
				if (arr[j] > arr[j+1]) 
				{				
					swap(arr, j, j+1);
					swap = true;
				}
			}
			
			if (swap == false) 
			{
				break;
			}
		}
	}
}
