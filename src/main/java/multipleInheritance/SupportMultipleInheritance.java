package multipleInheritance;

/*An interface contains variables and methods like a class but the methods in an interface are abstract by default unlike a class. 
Multiple inheritance by interface occurs if a class implements multiple interfaces or also if an interface itself extends multiple interfaces.*/

//A program that demonstrates multiple inheritance by interface in Java is given as follows:
interface AnimalEat {
	   void eat();
	}
	interface AnimalTravel {
	   void travel();
	}
	class Animal implements AnimalEat, AnimalTravel {
	   public void eat() {
	      System.out.println("Animal is eating");
	   }
	   public void travel() {
	      System.out.println("Animal is travelling");
	   }
	}
	
	/*Now let us understand the above program.
	The interface AnimalEat and AnimalTravel have one abstract method each i.e. eat() and travel(). 
	The class Animal implements the interfaces AnimalEat and AnimalTravel. 
	A code snippet which demonstrates*/

public class SupportMultipleInheritance {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		a.travel();

	}	

}
/*In the method main() in class SupportMultipleInheritance, an object "a" of class Animal is created. Then the methods eat() and travel() are called. 
 A code snippet which demonstrates*/ 
 