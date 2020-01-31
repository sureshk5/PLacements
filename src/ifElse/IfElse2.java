package ifElse;

import java.util.Scanner;

public class IfElse2 {
public static void main(String[] args) {
	int marksObtained ,passingMarks;
	passingMarks= 40 ;
	Scanner sc= new Scanner(System.in);
	System.out.println("input marks scores by you");
	marksObtained= sc.nextInt();
	if(marksObtained >passingMarks)
	{
		System.out.println("you passed the exam ");
	}
	else
	{System.out.println("work hard next time");
}
}}
