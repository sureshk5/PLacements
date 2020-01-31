package evenOdd;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int x;
		System.out.println("enetr the number to check for even or odd");
		Scanner sc= new Scanner(System.in);
		x= sc.nextInt();
		if(x%2==0) {
			System.out.println("you entered even number");
		}
		else {
			System.out.println("you entered odd bnumber");
		}
	}

}
