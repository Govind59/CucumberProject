package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vehicle = new Vehicle(); 
		Car car = new Car();
		Auto auto=new Auto();
		Audi audi=new Audi();
		vehicle.applyBrake();
		vehicle.soundHorn();
		audi.autoPark();
		audi.openDoor();
		audi.applyBrake();
		audi.soundHorn();
		car.openDoor();
		car.applyBrake();
		
		
		
	}

}
