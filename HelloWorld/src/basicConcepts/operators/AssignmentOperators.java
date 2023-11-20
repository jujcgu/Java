package basicConcepts.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		int x = 10;

		System.out.println("x = x + 3: " + (x += 3));
		System.out.println("x = x - 3: " + (x -= 3));
		System.out.println("x = x * 3: " + (x *= 3));
		System.out.println("x = x / 3: " + (x /= 3));
		System.out.println("x = x % 3: " + (x %= 3));
		System.out.println("x = x & 3: " + (x &= 3));
		System.out.println("x = x | 3: " + (x |= 3));
		System.out.println("x = x ^ 3: " + (x ^= 3));
		System.out.println("x = x >> 3: " + (x >>= 3));
		System.out.println("x = x << 3: " + (x <<= 3));

	}

}
