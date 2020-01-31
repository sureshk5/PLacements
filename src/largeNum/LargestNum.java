package largeNum;

import java.util.Scanner;

public class LargestNum {
	public static void main(String[] args) {
		int x,y,z;
		System.out.println("enter the three number");
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		y= sc.nextInt();
		z= sc.nextInt();
		if(x>y && x>z)
			System.out.println(x +" number is largest");
		else if(y>x && y>z)
			System.out.println(y +" is largest number");
		else if(z>x && z>y)
			System.out.println(z +" is largest number");
	}

}
