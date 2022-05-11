//Binary search is not effective for small data sets 
//Run time complexity is O(log n). Meaning to say the larger the dataset a binary search becomes more and more effective compared to other algorithms 
//In order for binary search to work the data set needs to be sorted 
//The search process will begin in the middle and keep on halving the dataset till the value is found 

import java.util.*;

class Main {
  public static void main(String[] args) {

		int array[] = new int[1000000];
		int target = 6537; 

		for(int i = 0; i < array.length; i++){
			array[i] = i;
		}

		//Using build in binary search function 
		//int index = Arrays.binarySearch(array, target);

		//Building binary search function 
		int index = binarySearch(array, target);

		if(index == -1){
			System.out.println("Not Found");
		} else 
			System.out.println("Found at " + index);
  }

	private static int binarySearch(int[]array, int target){
		int low = 0; 
		int high = array.length - 1; 

		while(low <= high){
			int middle = low + (high - low) / 2;
			int value = array[middle];

			System.out.println("Middle: " + middle);

			if(value < target) low = middle + 1; 
			else if(value > target) high = middle - 1; 
			else return middle; //target found 
			
		}
		
		return -1; //target not found 
	}

	
}