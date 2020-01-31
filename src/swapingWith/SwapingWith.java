package swapingWith;

import java.util.Scanner;

public class SwapingWith {
	public static void main(String[] args) {
		int x,y,temp ;
		System.out.println("enter x and y ");
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		y= sc.nextInt();
		System.out.println("the number before swap x = "+x+"\n y = "   +y);
		temp =x;
		x= y;
		y= temp;
		System.out.println("number after swap is x=  "+x+"\n y = "  +y);
	}

}
