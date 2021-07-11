package nestedloops2;

import java.util.Scanner;

public class areaofrectangle {
public static void main(String[] args) {
	System.out.println("enter length and breadth of a rectangle");
	Scanner scan=new Scanner(System.in);
	double l=scan.nextDouble(),b=scan.nextDouble();
	double area=l*b;
	System.out.println("the area of a rectangle is......:"+area);
}
}
