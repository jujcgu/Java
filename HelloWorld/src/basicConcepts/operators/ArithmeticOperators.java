package basicConcepts.operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		//Addition
		System.out.println("Addition: " + (x + y));
		
		//Subtraction
		System.out.println("Subtraction: " + (x - y));
		
		//Multiplication
		System.out.println("Multiplication: "+(x*y));
		
		//Division
		System.out.println("Division: "+(x/y));
				
		//Modulus
		System.out.println("Modulus: "+(x%y));
		
		//Increment
		System.out.println("Increment x: "+(++x));
		
		//Decrement
		System.out.println("Decrement y: "+(--y));
	}

}
