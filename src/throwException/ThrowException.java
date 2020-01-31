package throwException;

public class ThrowException {
	static void validate(int age) {
		if(age<18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("Welcome to vote in technolamror");
		}
	public static void main(String[] args) {
		validate(30);
		System.out.println("rest of the code");
	}

}
