import java.util.Scanner;

public class Vowel_exercise {
public static void main(String[] args) {
	char a;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an alphabet");
	a=sc.next().charAt(0);
	
	if((a=='A') || (a=='a') || (a=='E') || (a=='e') || (a=='I') || (a=='i') || (a=='O') || (a=='o') || (a=='U') || (a=='u')) {
		System.out.println("Entered character is a vowel");
	}
	else
		System.out.println("It is not a vowel");
	
}
}
