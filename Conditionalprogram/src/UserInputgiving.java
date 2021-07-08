import java.util.*;
public class UserInputgiving {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Please enter a value..:");
			
			int i=scan.nextInt();
			
			System.out.println("The value you entered is....:"+i);
			
			System.out.println((i%2==0)?"Even number...":"Odd Number....");
			
			if(i>40 && i<60) {
				System.out.println("second class......");
			}
			else if(i>60 && i<80) {
				System.out.println("distinction.....");
			}
			else {
				System.out.println("topper.........");
			}
		}
	}

