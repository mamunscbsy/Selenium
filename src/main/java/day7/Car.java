package day7;

public class Car {
	
	public static void main(String[] args) {
		
	Car obj = new Car();
	obj.applyBrake();
	obj.soundHorn();
	
}


public void applyBrake() {
	System.out.println("Brake");
}

public void soundHorn() {
	System.out.println("Horn");
}
}