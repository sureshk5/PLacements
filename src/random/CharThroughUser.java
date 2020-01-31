package random;

import java.util.Scanner;

public class CharThroughUser {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter String ");
	String str=sc.nextLine();
	System.out.println("Enter Char ");
	char c=sc.next().charAt(0);
	for(int i=0;i<str.length();i++) {
		if(c==str.charAt(i)) {
			continue;
		}
		System.out.print(str.charAt(i));
	}
	//System.out.println(c);
	}
}
