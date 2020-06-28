package learnEncapsulation;

public class CallEncap {
	
	public static void main(String[] args) {
		LearnEncapsulation obj = new LearnEncapsulation();
		System.out.println(obj.ph);
		
		obj.getdata();
		
		
		obj.setPin(2222);
		
		System.out.println(obj.getdata());
	}

}
