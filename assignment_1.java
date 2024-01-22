package TNSIF;
import java.util.Scanner;

public class assignment_1 {
	public static void main(String[] args) {
		Scanner obj  = new Scanner(System.in);
		System.out.println("Enter name");
		String name = obj.nextLine();
		System.out.println("Enter source");
		String source = obj.nextLine();
		System.out.println("Enter destination");
		String dest = obj.nextLine();
		System.out.println("Dear "+name+", welcome onboard with service from "+source+" to "+dest+". Thank you for choosing Sky Airlines. Enjoy your flight.");
	}
}
