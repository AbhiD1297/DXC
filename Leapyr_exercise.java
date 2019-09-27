import java.util.Scanner;

public class Leapyr_exercise {
public static void main(String[] args) {
	int year;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an year");
	year=sc.nextInt();
	if(year%100 == 0) {
		if(year%40 == 0) {
			System.out.println("Entered year is a leap year");
		}
		else {
			System.out.println("its not a leap year");
		}
	}
	else {
		if(year%4 == 0) {
			System.out.println("Entered year is leap year");
		}
		else {
			System.out.println("its not a leap year");
		}
	}
}
}
