package godini;

public class Age {

	public static void main(String[] args) {
		int age = -5;
		if (age > 0) {
			if (age > 16) {
				System.out.println("Welcome");
			} else {
				System.out.println("Too young");
			}
		} else {
			System.out.println("Error");
		}
	}
}
