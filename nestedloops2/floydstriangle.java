package nestedloops2;

import java.util.Scanner;

public class floydstriangle {
public static void main(String[] args) {
	Scanner floww=new Scanner(System.in);
	System.out.println("enter no of  rows");
	int a=floww.nextInt(),c,b;//a is the row number to which v r comparing............
	for(c=1;c<=a;c++){
		for(b=1;b<=c;b++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}

