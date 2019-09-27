import java.util.Scanner;

public class Inputfromuser {
	
		Scanner sc = new Scanner(System.in);
		int age;
		String name;
		public void display() {
			System.out.println("Enter your Name:");
			name=sc.next();
			System.out.println("Enter your Age: ");
			age=sc.nextInt();
			System.out.println("Your Name: "+ name);
			System.out.println("Your Age: "+age);
		}
		public static void main(String[] args) {
			Inputfromuser obj = new Inputfromuser();
			obj.display();
		}
	
}
