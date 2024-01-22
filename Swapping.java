package TNSIF;
import java.util.Scanner;
public class Swapping {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter A : ");
		int A =  obj.nextInt();
		System.out.print("Enter B : ");
		int B = obj.nextInt();
		A=A^B;
		B=A^B;
		A=A^B;
		System.out.println("Numbers after swapping \nA : "+A+" B : "+B);
	}
}
