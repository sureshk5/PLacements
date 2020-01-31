package starConsole;

import java.util.Scanner;

public class StarConsole {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the rows");
	int 	row = sc.nextInt();
		int numberOfStars;
		for(row = 1;row<=10;row++)
			for(numberOfStars=1;numberOfStars<=row;numberOfStars++) {
				System.out.println("*");
			}System.out.println();
	}

}
