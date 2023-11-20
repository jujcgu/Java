package basicConcepts.string;

public class StringConcatenation {

	public static void main(String[] args) {
		String firstName = "Juan";
		String lastName = "Castro";
		System.out.println(firstName+ " " +lastName);
		
		//concat() method
		firstName = "Juan ";
		System.out.println(firstName.concat(lastName));
	}

}
