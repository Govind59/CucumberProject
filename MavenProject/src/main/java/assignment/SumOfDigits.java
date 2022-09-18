package assignment;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number = new Scanner(System.in);
		long num = number.nextLong();
		long sum=0, digit;
		
		
		
		while(num>0) {
		
		
			digit=num%10;
			
			sum = digit+ sum;
			
			 num=num/10;
		}			;
			System.out.print(sum);
				
	
		
	}
}

	
