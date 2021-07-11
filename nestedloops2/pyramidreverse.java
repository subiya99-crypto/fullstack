package nestedloops2;

public class pyramidreverse {
public static void main(String[] args) {
	for(int i=1;i<=6;i++) {
		for(int j=6;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}

/*int term=6;
for(int i=1;i<=term;i++)
{
for(int j=term;j>=i;j--)
{
System.out.print("* ");
}
System.out.println();//new line*/