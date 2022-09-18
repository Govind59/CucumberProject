package assignment;

import java.util.Iterator;

public class ReverseEvenWords {
	public static void main(String[] args) {

	// To reverse the even words in the string
	String Role = "I am a software Tester";
	String[] split = Role.split(" ");
    int length = split.length;
    	// String rev = "";
			for(int i=0; i<length; i++) {
				if((i+1) % 2 == 0) {
			for(int j=split[i].length()-1; j>=0; j--) {
				char rev = split[i].charAt(j);
				
				System.out.print(rev);
			}
		}
				else {
			System.out.print(split[i]);
		}
	}

}

}

