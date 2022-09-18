package assignment;

public class EmployeeDetails {
	
	public void printEmployeeName (String empName, int empId) {
		System.out.print("Employee Name" + "Employee ID"); /// print the empSalary
		}
	
	public String getEmployeeAddress(String empAddress) {
		System.out.println(empAddress);
		return empAddress;
		
	}
	public double printEmployeeSalary(double empSalary) { 
		System.out.println("empSalary"); // print the empSalary
		return empSalary;
		
	}
	public void printEmployeeMobileNumber(long mobNum) { 
		
		System.out.println("mobNum"); // print the phoneNumber
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails empd = new EmployeeDetails();
		empd.printEmployeeName("Govind" , 29);
		empd.getEmployeeAddress("Chennai");
		empd.printEmployeeSalary(40000);
		empd.printEmployeeMobileNumber(8973780709l);
		
		
	}

}
