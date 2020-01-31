package addNum;

import java.math.BigInteger;
import java.util.Scanner;

public class AddNum {
	public static void main(String[] args) {
		String number1, number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number ");
		number1= sc.nextLine();
		System.out.println("enter the second number");
		number2 = sc.nextLine();
		BigInteger first = new BigInteger(number1);
		BigInteger second= new BigInteger(number2);
		BigInteger sum = first.add(second);
		System.out.println("result of addition = "+sum);
		
	}

}
