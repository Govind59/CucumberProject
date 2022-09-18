package week1.day2;

public class Car {
	
	public void PrintCarName()
	
	{
		System.out.println("Maruti 800");
	}
	
	private  String getColorCar()
	
	{
		return "White/Grey";
	}
	
	boolean isPunctured ()
	{
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj =new Car();
		obj.PrintCarName();
		//System.out.println(obj.getColorCar()); //use alternate below
		String color= obj.getColorCar();;
		System.out.println(color);
		

	}

}
