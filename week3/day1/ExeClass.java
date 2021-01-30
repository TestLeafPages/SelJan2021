package week3.day1;

public class ExeClass {

	public static void main(String[] args) {
			Vehicle v = new Vehicle();
			v.applyBrake();
			v.soundHorn();
			
			
			Car c = new Car();
			c.turnOnAC();
			c.applyBrake();
			c.soundHorn();
			
			
			BMW b = new BMW();
			b.sDriver();
			b.turnOnAC();
			b.applyBrake();
			b.soundHorn();
	}
}
