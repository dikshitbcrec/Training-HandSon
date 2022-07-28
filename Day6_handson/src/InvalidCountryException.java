
public class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		super();
		System.out.println("InvalidCountryException");
		System.out.println("User Outside India cannot be registered");
	}
}
