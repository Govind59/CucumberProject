package assignment; //Wee 2 Day 1

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Check number of occurrences of a char (eg 'e') in a String
		
		// declare and initialize a variable count to store the number of occurrences
					String str = "welcome to chennai";
					int count=0;
					// convert the string into char array
					char[] character1 = str.toCharArray(); //a) Convert the String to character array
					System.out.println(character1);						
					//get the length of the array
					int length=character1.length;					
						
					// traverse from 0 till the array length
					for(int i=0;i<length;i++) {
						// Check the char array has the particular char in it
						if(character1[i]=='e') {											

							count+=1; // if is has increment the count
						}}	
						
						System.out.println("The total count of e present in the text is : " + count); // print the count out of the loop				
						
					}						 
				}


