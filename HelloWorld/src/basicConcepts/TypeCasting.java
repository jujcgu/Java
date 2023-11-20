package basicConcepts;

public class TypeCasting {

	public static void main(String[] args) {
		//Widening Casting
		int myInt = 9;
		double myDouble = myInt;
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		//Narrowing Casting
		double age = 22.9;
		short myAge = (short) age;
		
		System.out.println(age);
		System.out.println(myAge);
	}

}
