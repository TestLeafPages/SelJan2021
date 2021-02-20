package week6.day1;

public class EmployeInfo {

	String empName;
	int empId;
	public static String companyName;
	
	
	EmployeInfo(int empId, String empName, String companyName){
				
		this.empId  = empId;
		this.empName = empName;
		this.companyName = companyName;
		
	}
	
	public static void getEmpDetails() {
		System.out.println("static method");

	}

	public static void main(String[] args) {
		// ClassName objName = new ClassName();
		EmployeInfo emp1 = new EmployeInfo(100,"Hari","TestLeaf");
		
		EmployeInfo emp2 = new EmployeInfo(200,"Prasad","TestLeaf Software Solutions");
		
		System.out.println(emp1.empName+" "+emp1.empId+" "+companyName);
	
		System.out.println(emp2.empName+" "+emp2.empId+" "+companyName);
		
		getEmpDetails();

	}

}
