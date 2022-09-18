package assignment;

public class ReverseWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
				String test = "feeling good";

				// Build the logic to find the count of each
				//a) Convert the String to character array
					test.toCharArray();
				//b) Traverse through each character (using loop in reverse direction)
					for(int i=0;i<=10;i++) {
						
					}
				//c) Print the character (without newline -> like below
					   System.out.print(test);
							
				
				
				//a) Find the length of the string
				//int length=test.length();
				//b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
					for (int i=test.length()-1;i>=0;i--) {
					System.out.println();
					char word1=test.charAt(i);
									
					System.out.print(word1);			
				}
					
					
				//c) Find the character of the String using its index
				
	}	
				

}
