import java.util.Scanner;
public class b {
public static void main(String[] args) {
	System.out.println("enter two numbers");
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=a*b;
	System.out.println("the mul values are:" +c);
	scan.close();
}
}
