package factorial;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	System.out.println("enter the number whose factorial is to done ");
Scanner sc = new Scanner(System.in);

int x ,c,fact=1;
x= sc.nextInt();
if(x<0)
{
	System.out.println("please enter non negative number");
}
else
{
	for(c =x; c>=1;c--)
	fact =fact*c;
	System.out.println("the factorial of enetered number is "+fact);
}


}
}
