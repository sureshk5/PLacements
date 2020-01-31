package swapWithout;

import java.util.Scanner;

public class SwapWithout {
	public static void main(String[] args) {
		int x,y ;
		System.out.println("enter the numbers ");
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		y =sc.nextInt();
		System.out.println("numbers before swap is x= "+x+"\n y ="+y);
		x= x+y;
		y= x-y;
		x= x-y;
		System.out.println("numbers after swap is x= "+x+"\n y= "+y);

	
	}

}
