package week6.day1;

public class Employee {

	String empName;
	int empId;
	String companyName;
	//boolean isActive;

	Employee() {
		this(100,"Prasad","TestLeaf");
		System.out.println("default constructor");
	}
	
	Employee(int empId, String empName, String companyName){
		
		System.out.println("Parameterized constructor");	
		this.empId  = empId;
		this.empName = empName;
		this.companyName = companyName;
		
	}

	public static void main(String[] args) {
		// ClassName objName = new ClassName();
		Employee emp1 = new Employee();

		System.out.println(emp1.empName);
		System.out.println(emp1.empId);
		System.out.println(emp1.companyName);
		//System.out.println(emp1.isActive);

	}

}
