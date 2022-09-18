import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public void arrlist() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList(); 
		al.add(10);
		al.add(true);
		al.add(392665877l);
		al.add('h');
		System.out.println(al);
		
		ArrayList al2= new ArrayList();
		al2.addAll(al);
		
		System.out.println("Before add chennai : " +al2);
		al2.add("Chennai");
		al2.contains("Chennai");
			
		
		System.out.println(al2);
		
		

		
	}

}
