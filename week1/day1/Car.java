package week1.day1;

//AccessSpecifier keyword ClassName
public class Car {
// DataType	variableName  = variavleValue;	
	String bodyColor = "Red";
	int numWheels = 4;

	public static void main(String[] args) {

		// ClassName objectName = new ClassName();
		Car myCar = new Car();

		/*
		 * myCar.driveCar(); myCar.applyBrake();
		 * 
		 * //Directly using in the code System.out.println(myCar.bodyColor);
		 * 
		 * //saving the data in local variable and use int noOfWheels = myCar.numWheels;
		 * System.out.println(noOfWheels);
		 * 
		 * 
		 * String carModel = "xcent"; char fuel = 'P';
		 * 
		 * myCar.carDetails(carModel, fuel);
		 */
		//directly using the value
		System.out.println(myCar.isPuncture());
		
		//save the retrun value in a local variable and use
		boolean carStatus = myCar.isPuncture();
		System.out.println(carStatus);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public boolean isPuncture() {
		
		return true;
	}
	

	// AccessSpecifier ReturnType methodName()
	public void driveCar() {

		System.out.println("drive car");

	}

	public void applyBrake() {
		System.out.println("applied brake");

	}
	
	public void carDetails(String modelName, char fuelType) {
		
		System.out.println(modelName);
		System.out.println(fuelType);
		
	
	}
	
	public void printCarStatus(boolean carState) {
		System.out.println(carState);
	}
	
	
	
	
	
	
	
	
	
	

}
