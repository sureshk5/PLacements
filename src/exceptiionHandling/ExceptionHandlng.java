package exceptiionHandling;

import java.util.Scanner;

public class ExceptionHandlng {

	
	public static void main(String[] args) {
		int a,b,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two number");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			result = a/b;
			System.out.println("result is " + result );
		}
		catch(ArithmeticException e){
			System.out.println("Exception caugth:Division by zero");
			
		}
		
		
	}
}
