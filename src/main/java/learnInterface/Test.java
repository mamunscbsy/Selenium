package learnInterface;

public class Test {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.horn();
		c.cloor();
		c.turnAC();
		c.brake();
		c.mirror();
		
		BMW b = new BMW();
		b.heatedSeat();
	}

}
