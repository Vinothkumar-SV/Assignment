package javapgm;

	import java.util.Arrays;


	public class MissingElement {

		public static void main(String[] args) {
			
			int[] nums = {1,2,3,4,7,8,9,10};	
			System.out.println("The Missing Numbers are");
			Arrays.sort(nums);
			
			for (int i = 1; i <nums.length; i++) {
				
				
				if(i!= nums[i-1])	
					
					
					
		System.out.println(i);
			
			}
			
			}
					
		}

