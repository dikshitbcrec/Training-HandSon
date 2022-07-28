
public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		System.out.println("InvalidAgeException");
		System.out.println("Age is not between the Range of 18 to 60");
	}

}
