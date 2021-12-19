package javapgm;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int[] arr = {12,12,13,11,15,14,18,16,17,19,18,17,20,22,25,20,30};
		
		
		System.out.println("The Duplicate elements are");
		
		
		for (int i = 0; i < arr.length; i++) {
			
			Arrays.sort(arr);
			
		for (int j = i+1; j < arr.length; j++) {
			
			if(arr[i] == arr[j]) {
			
				System.out.println(arr[j]);
		}	
		
						
	}

			
   }	
 }
}	
		

	
