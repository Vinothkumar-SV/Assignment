package javapgm;


	import java.util.Arrays;

	public class Anagram {

		public static void main(String[] args) {
			
			String text1 = "stops";
			
			String text2 = "potss"; 
			
		
			char [] ch = text1.toCharArray();
			
			char [] ch1 = text2.toCharArray();
			
			Arrays.sort(ch);
			
			System.out.println(ch);
			
			Arrays.sort(ch1);
			
			System.out.println(ch1);
			
			if (ch.equals(ch1)) {
				
				System.out.println("Both are again equal");
			}
			
			else
			{
				System.out.println("okok");
			}
		}

	}
