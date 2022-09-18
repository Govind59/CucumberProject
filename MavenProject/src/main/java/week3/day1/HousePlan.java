package week3.day1;

//Abstraction - Interface

public interface HousePlan {
	int length=120;
	int breadth=200;
	int numberOfBedroom=3;
	
	/**
	 * This is a secondary bedroom in 12*12 with the attached toilet bathroom
	 * This should be facilitated with 2 lights and 2 fans
	 * There should be a provision for AC out
	 * There should be a default wardrobe 
	 */
	
	public abstract void buildBedroom() ; //having plans ,but no implementation
	public abstract void buildMasterBedroom();
		

}
