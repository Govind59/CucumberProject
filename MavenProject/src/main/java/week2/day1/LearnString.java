package week2.day1;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String text1="TestLeaf"; //immutable
			String text2= new String("TestLeaf"); //object created to store in heap memory
						
			System.out.println(text1.equals(text2));
			
			String Uppercase = text2.toUpperCase();
			System.out.println(Uppercase);
			

			String Lowercase = text2.toLowerCase();
			System.out.println(Lowercase);
			
			//String comparison
			
			boolean equals=text1.equals(text2); //valid
			System.out.println(equals);
			
			System.out.println(equals);
			
			boolean equal2= Uppercase.equals(Lowercase);
					System.out.println(equal2);
					
			boolean case1 = Uppercase.equalsIgnoreCase(Lowercase);
			System.out.println(case1);
			
					
			
			
	}

}
