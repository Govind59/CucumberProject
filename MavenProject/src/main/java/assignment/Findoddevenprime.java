package assignment;

import java.util.Scanner;

public class Findoddevenprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  boolean even = false;
	        boolean prime = true;
	        int myNumber = 5;
	 
	        if(myNumber % 2 == 0){
	            even = true;
	            prime = false;
	        }
	        else {
	            for(int i=3; i*i<=myNumber; i+=2) {
	                if(myNumber % i == 0) {
	                    prime = false;
	                }
	            }
	        }
	 
	        if(even){
	            System.out.println("The given number is Even.");
	        }
	        else {
	            if(prime){
	                System.out.println("The given number is Prime.");
	            }
	            else {
	                System.out.println("The given number is Odd.");
	            }
	

	}
	}
}
