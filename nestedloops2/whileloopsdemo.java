package nestedloops2;

import java.util.Scanner;

public class whileloopsdemo {
public static void main(String[] args) {
	System.out.println("enter a num");
	Scanner num=new Scanner(System.in);
	int numberrrr=num.nextInt(),sum=0;
	while(numberrrr<=10) {
		sum=sum+numberrrr;
		numberrrr++;
	}
	System.out.format(" Sum of the Numbers From the While Loop is: %d ",sum);
	num.close();
}

}

