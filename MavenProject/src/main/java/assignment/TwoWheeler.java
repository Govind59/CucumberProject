package assignment;

public class TwoWheeler {   //Create a class for TwoWheeler and declare below global variables with appropriate values
	
	public void twowheel() {
		
		int noOfWheels=2;
		short noOfMirrors=2;
		long chassisNumber=45561160103l;
		boolean isPunctured=false;
		String bikeName="Pulsar";
		double runningKM=3324.3;
		System.out.println(noOfWheels);
		System.out.println( + chassisNumber + "\r\n" + bikeName + "\r\n" + runningKM + "\r\n" +isPunctured );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object for TwoWheeler and call all the variables inside main method and print the values.
		TwoWheeler wheels = new TwoWheeler();
		wheels.twowheel(); 			
		
	}
	}




