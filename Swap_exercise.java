import java.util.Scanner;

public class Swap_exercise {
public static void main(String[] args) {
	int num1,num2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number");
	num1=sc.nextInt();
	System.out.println("Enter second number");
	num2=sc.nextInt();
	num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1 - num2;
	System.out.println("After swapping numbers are: ");
	System.out.println(num1);
	System.out.println(num2);
}
}
