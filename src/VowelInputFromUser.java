import java.util.Scanner;

public class VowelInputFromUser {
public static void main(String[] args) {
	Scanner abc=new Scanner(System.in);
	System.out.println("enter an alphabet");
	char vow= abc.next().charAt(3); 
	if (vow =='a'|| vow == 'e'|| vow == 'i' || vow == 'o' || vow == 'u');
	System.out.println((vow =='a'|| vow == 'e'|| vow == 'i' || vow == 'o' || vow == 'u') ? vow + "is vowel": vow + "is consonent...");
}
}