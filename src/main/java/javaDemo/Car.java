package javaDemo;

public class Car {

	public static void main(String[] args) {
		
		//Syntax of object creation
		//Classname obj = new Classname();
		
		Car obj = new Car();
		
		obj.carDriving();
		obj.carHorn();
		obj.carBreak();
		obj.carAc();
		obj.carDriving();
		obj.carHorn();
		//parameter
		obj.adds(20, 30);
		obj.adds("Mamun123","Rob123");
		
		
		
		//carDriving();
		

	}
	//A method has 4 things
			//public- access modifier 
			//void- return type
			//carDriving()- method name
			//{ System.out.println("I am driving");} - body
	
	public void carDriving() {
		System.out.println("I am driving");
	}

	void carHorn() {
		System.out.println("My car horn is very loud");
	}
	private void carBreak() {

		System.out.println("My car has good break");
	}
	protected void carAc() {
		System.out.println("My car Ac works fine");
	}
	
	//Parameterized method, A, B are parameters /Or methods Overloading
	public int adds(int A, int B) {  //20 +30 = 50
		System.out.println(A+B);
		return A+B;
		
	}
	public String adds(String userName, String password) { //String- userName = Mamun, password ="Rob123"
		System.out.println(userName +  " " + password);
		return userName+ password;
	}	
		
	}

