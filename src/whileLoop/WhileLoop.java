package whileLoop;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("input an integer");
	while((n= sc.nextInt())!=0) {
		System.out.println("you entered  "+n);
		System.out.println("input an integer");
	}
	System.out.println("out of loop");
	
	
	
	}
	

}
