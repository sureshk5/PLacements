package compareString;

import java.util.Scanner;

public class CompareString {
	public static void main(String[] args) {
		String s1,s2;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first string ");
	s1 =sc.nextLine();
	System.out.println("enter the second string ");
	s2 = sc.nextLine();
	if(s1.compareTo(s2)>0)
		System.out.println("first string is greater");
	else if(s1.compareTo(s2)<0)
		System.out.println("second string is greater");
	else
		System.out.println("both string are equal");
	
	}

}
