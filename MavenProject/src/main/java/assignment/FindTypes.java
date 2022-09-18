package assignment;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation   $$ ";

				// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;

				// Build the logic to find the count of each
				//a) Convert the String to character array
				char[] character = test.toCharArray();
					
				//b) Traverse through each character (using loop)

					
					for(int i=0;i<character.length;i++) { 
						
						//c) Find if the given character is what type using (if)
						if(Character.isLetter(character[i])) {		//i)  Character.isLetter
						letter = letter+1;
						}
						else if(Character.isDigit(character[i])) {	//ii) Character.isDigit
					num = num+1;
					}
						else if (Character.isSpaceChar(character[i])) {	//iii)Character.isSpaceChar
				  space=space+1;
				  }
				  else {
					  specialChar+=1;		//iv) else -> consider as special character
				  }
					}							
							
				// Print the count here*/
					System.out.println("letter: " + letter);
					System.out.println("space: " + space);
					System.out.println("number: " + num);
					System.out.println("specialCharcter: " + specialChar);

				

	}

}
