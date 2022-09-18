package assignment; //week 1 day 2 assignment

public class FindIntersection {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers1[] = {3,2,11,4,6,7}; //a) Declare An array for {3,2,11,4,6,7}
		int numbers2[] = {1,2,8,4,9,7};  //b) Declare another array for {1,2,8,4,9,7}
		
		
		for(int i=0;i<numbers1.length;i++) {	 //c) Declare for loop iterator from 0 to array length
		
			{
				for(int j=0; j<numbers2.length;j++) {		//d) Declare a nested for another array from 0 to array length
				if(numbers1[i]==numbers2[j]) {
					System.out.println("The intersection number is:" + numbers1[i]); //f) Print the first array (shoud match item in both arrays)
				}
				}	
			}
			}
		}
	}
					