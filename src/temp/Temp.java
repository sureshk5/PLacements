package temp;

import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		System.out.println("enter the  temperature");
		Scanner sc = new Scanner(System.in);
		float temp= sc.nextInt();
		temp = ((temp-32)*5)/9;
		System.out.println("the temperature in celcius is "+temp);
	}




}
