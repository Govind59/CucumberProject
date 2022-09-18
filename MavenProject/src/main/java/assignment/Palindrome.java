package assignment; //week 2 day 1

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str,reverse="";
		str=sc.nextLine();
		int length=str.length();
				
		System.out.println(length);
		for (int i=str.length()-1;i>=0;i--) {
						
			reverse=reverse+str.charAt(i);
			System.out.println(reverse);
		}
		
		if(str.equalsIgnoreCase(reverse)) {
		
		System.out.println("Given input is a Palindrome " + str);
		}
		else {
			System.out.println("Given input is not a Palindrome  :" + str);
		} 
	}

}
