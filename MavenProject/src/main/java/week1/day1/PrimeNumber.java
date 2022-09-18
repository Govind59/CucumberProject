package week1.day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number = new Scanner(System.in);
		int num = number.nextInt();
	    boolean flag = false;
	    //while (i <= num / 2) 
	    for(int i=2;i<=num/2;i++){
	      // condition for nonprime number
	    	
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }

	     // ++i;
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	 
}
		
		
	

