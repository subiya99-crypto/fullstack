import java.util.Scanner;

public class Largestnum {
public static void main(String[] args) {
	Scanner lar= new Scanner(System.in);
	System.out.println("enter 1st num");
	int a=lar.nextInt();
	System.out.println("enter 2nd num");
	int b=lar.nextInt();
	System.out.println("enter 3rd num");
	int c=lar.nextInt();
	if(a>b && a>c) 
		System.out.println(a+"largest is:" );
	else if(b>a && b>c) 
		System.out.println(b+ " is greater" );
	else
		System.out.println(c+ "is greater" );
		
}
}
