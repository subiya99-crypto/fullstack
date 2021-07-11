package nestedloops2;

import java.util.Scanner;

public class areao {
public static void main(String[] args) {
	System.out.println("enter b and h of a triangle");
	Scanner scan=new Scanner(System.in);
	int b=scan.nextInt(),h=scan.nextInt();
	int area=b*h;
	float x=area/2;
	System.out.println("the area of a triangle is" +x);
	scan.close();
}
}
	
	
	
	
	
