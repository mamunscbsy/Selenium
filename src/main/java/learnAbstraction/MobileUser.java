package learnAbstraction;

//its a fully abstract class, it has no abstract method
public abstract class MobileUser {

	void call() { // this is a non abstract method
		System.out.println("Call method");
	}

	//after adding Call() method,it is not a fully abstract method, it has abstract & non Abstract method

	abstract void sendMessage(); // this is a fully abstract method

}
