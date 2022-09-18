package week3.day1;

public class MyAssets {

	
	public static void main(String[] args) {
		
		GrandParent gp = new GrandParent();
		gp.adayarbunglaw();
		
		Father father = new Father();
		father.benz();
		father.boatclub();
		father.adayarbunglaw(); //inherited method by class GrandParent
		
		
	}
}
