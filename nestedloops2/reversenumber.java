package nestedloops2;

import java.util.Scanner;

public class reversenumber {
public static void main(String[] args) {
	int rem,rev=0;
System.out.println("enter a number to be reversed");
Scanner num=new Scanner(System.in);
int number=num.nextInt();
while(number!=0) {
	rem=number%10;
	rev=rev*10+rem;
	number=number/10;
System.out.println("reverse number is"+rev);
}	
}
}
