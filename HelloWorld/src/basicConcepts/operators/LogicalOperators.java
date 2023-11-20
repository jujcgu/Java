package basicConcepts.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int x = 5;
		System.out.println(x < 5 &&  x < 10); //false
		System.out.println(x < 5 || x < 4); //false
		System.out.println(!(x < 5 && x < 10)); //reverse the result, true

	}

}
