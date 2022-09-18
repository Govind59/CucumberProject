package week1.day1;

import java.util.Scanner;

public class LearnControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner text = new Scanner(System.in);
			
		String s = text.next();
		
		System.out.println(text);
		
//		for (initialization; condition; increment/decrement)
			
		for (int i=1 ; i<=5; i++) {
		
			System.out.println("The printed text is: " + s );
		}
		

	}

}
