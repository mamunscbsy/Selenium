package learnInterface;

public class Car implements Vehicle {
	
	public void horn() {
		
		System.out.println("Horn is beeping");
	}

	public void cloor() {
		System.out.println("This is a red color car");
	}
	
	public void turnAC() {
		System.out.println("Turn the AC of the Car");
	}
	
	public void brake() {
		System.out.println("Press the car brake");
	}
	public void mirror() {
		System.out.println("Cars has two mirror");
	}
	
	
}
