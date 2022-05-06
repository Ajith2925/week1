package week1.day2;

public class employeeDetail {
	public void employeeName(String empName, int empId) {
		System.out.println("Employee Name: " +empName +" Employee Id: " +empId);
	}
	public void employeeAddress(String empAddress) {
		System.out.println("Employee Address: " +empAddress);
	}
	public void employeeSalary(double empSalary) {
		System.out.println("Employee Salary: " +empSalary);
	}
	public void employeeMobileNumber(long empMobileNumber) {
		System.out.println("Employee Mobile Number: " +empMobileNumber);
	}
	public static void main(String[] args) {
		employeeDetail empDetails=new employeeDetail();
		empDetails.employeeName("Ajiee", 1999);
		empDetails.employeeAddress("No 9, first street , Ennore, Chennai-600057");
		empDetails.employeeMobileNumber(8682818786L);
		empDetails.employeeSalary(29877);
	}
}
