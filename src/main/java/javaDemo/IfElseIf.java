package javaDemo;

public class IfElseIf {

	public static void main(String[] args) {
		
		String country = "USA";
		System.out.println(country);
		

		//3. else if
		
		int D = 6;
		
		/*if(D > 7) {
			System.out.println("Diabetic");
		
		}else if(D < 5){
			System.out.println("Non Diabetic");
		
		}else if(D> 8){
			System.out.println("Poor Control");
		}		
		else {
			System.out.println("Pre Diabetic");
		}*/
		
		if(D > 6) {
			System.out.println("Diabetic");
		}else if(D < 6) {
			System.out.println("Non Diabetic");
		}else if(D > 7) {
			System.out.println("Poor Control");
		}else {
			System.out.println("Pre Diabetic");
		}
		
			
		
		System.out.println("........................................");
		
		//int x=10;
	//String 	browser4 = "Chrome";	
		
		String browser1 = "Chrome";
		String browser2 = "FireFox";
		String browser3 = "IE";
		
		if(browser1.equals("gecko")) {
			System.out.println("Chrome");
		}else if(browser2.equals("FireFox")){
			System.out.println("FireFox");
		}else if(browser3.equals("IE")){
			System.out.println("IE");
		}

	}

	

	}
}


