package armstrong;

import java.util.Scanner;

public class Armstong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number,temp,total=0;
		int num= sc.nextInt();
		number = num;
		while(number!=0)
		{
			temp = number%10;
			total = total+temp*temp*temp;
			number= number/10;
			
		}
		if(total==num)
		{
			System.out.println(num + " is an armstrong number");
		}
		else {
			System.out.println(num +"is not an armstrong number");
		}
	}

}
