package nestedloops2;

import java.util.Scanner;

public class areaofcircle {
public static void main(String[] args) {
	System.out.println("enter the value of radius");
	Scanner scan=new Scanner(System.in);
	double r=scan.nextDouble();
	double area=Math.PI*r*r;
	System.out.println("the area of a circle is"+area);
	double circumference =2*Math.PI*r;
	System.out.println("the circumference of a circle is"+circumference);
	scan.close();
}
}

