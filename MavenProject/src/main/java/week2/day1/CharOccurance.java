package week2.day1;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check number of occurrences of a char (eg 'e') in a String
		String str = "welcome to chennai";
		char[] character = str.toCharArray(); // convert the string into char array
		int count=0;
		int length=character.length; //get the length of the array
		System.out.println(character);
		
		for (int i=0;i<length;i++) { //traverse from 0 till the array length
			
			if(character[i]=='e') {  // Check the char array has the particular char in it
			//System.out.println(i);
			
			count+=1; // if is has increment the count
		}}	
		
		System.out.println("The total count of e present in the text is :" + count); // print the count out of the loop
		
			 
			

	}}
