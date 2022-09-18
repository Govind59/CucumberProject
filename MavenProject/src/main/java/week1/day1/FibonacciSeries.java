package week1.day1;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
				
		System.out.println("Enter the First Number" + "\r\n\n"+ firstNum);
		System.out.println("The Fibonacci series of the given input is " + "\r\n");
		
		for (int i=1;i<=range;i++)
			
		{
			
		int sum= firstNum+secNum;
		
		firstNum=secNum;		
		secNum=sum;
		
		System.out.println(sum);
								
		}
		
		
		
		
}
	
	

}
