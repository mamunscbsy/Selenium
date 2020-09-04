package learnEncapsulation;

public class LearnEncapsulation {
	
	//Declare the pin as private
	private  int pin = 1234;
	
	public int atm = 213121242;
	
	
	public int getdata() {	//getter method
		return pin;
	}
	
	
	public void setPin(int pinNum) { //setter method
		this.pin = pinNum;
	}
	
	
	
	
}
