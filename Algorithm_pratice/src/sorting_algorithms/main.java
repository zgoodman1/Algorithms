package sorting_algorithms;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		int[] arr = {4, 16, 12, 82, 9, 94, 13, 3, 6, 58};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		int i, j, temp;
		int n = arr.length;
		boolean swap;
		
		for(i = 0; i < n - 1; i++) 
		{
			swap = false;
			for(j = 0; j < n - i - 1; j++) 
			{			
				if (arr[j] > arr[j+1]) 
				{				
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
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
