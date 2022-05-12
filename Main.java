/********************************************
BINARY SEARCH 
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10] Target: 7
For a binary search to work it needs to be sorted. 
Once sorted binary search will start in the midde of the dataset to see if that is the target
It will also check if the target value is smaller or bigger than the target value 
If the target is bigger it will discard the smaller half. 
This process will continue until the target is found 

Not good for small datasets 

Time Complexity O(log n) - The larger the dataset the more effective 
*/

import java.util.*;

class Main {
  public static void main(String[] args) {

		int array[] = new int[10000000];
		int target = 69;

		for(int i = 0; i < array.length; i++){
			array[i] = i;
		}

		//Below is code for using build in binary search function 
		/*
		int index = Arrays.binarySearch(array, target);

		if(index == -1){
			System.out.println("Target not found");
		} else {
			System.out.println("Target Found at index: " + index);
		}
		*/

		//Below is code for creating your own binary search function 
		int index = binarySearch(array, target);

		if(index == -1){
			System.out.println("Target not found");
		} else {
			System.out.println("Target found at index: " + index);
		}
	}	

	private static int binarySearch(int[] array, int target){

		//Variables for beginning and end of array 
		int low = 0;  
		int high = array.length -1; 

		 while(low <= high) { 
			 int middle = low + (high - low) / 2;
			 int value = array[middle];
			 System.out.println("Current middle value is: " + value);

			 if(value < target) low = middle + 1; 
			 else if (value > target) high = middle - 1;
			 else return middle; //Target is found 
		 }
		
		return -1; // -1 Means the target is not found 
	}
	
}