package assignment; //week 1 Day 2

public class Car {

	
	public void applyBreak() {
		System.out.println("Brake applied");
		}
	public void applyGear() {
		System.out.println("Gear applied");
	}
	public void chOnAc() {
		System.out.println("Choke applied");
	}
	public void applyAcclerate() {
		System.out.println("Accelerated");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car carInfo = new Car();
		carInfo.applyBreak();
		carInfo.applyGear();
		carInfo.chOnAc();
		carInfo.applyAcclerate();
			}
}
