package week1.day1;

public class OfficeCar {
	
	public void soundHorn() {
		System.out.println("applied sound horn");

	}

	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.driveCar();
		myCar.applyBrake();
		
		OfficeCar oc = new OfficeCar();
		oc.soundHorn();

	}

}
