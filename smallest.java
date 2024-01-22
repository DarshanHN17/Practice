package TNSIF;
import java.util.Scanner;

public class smallest {
	public static void main(String[] args) {
		System.out.println("Enter the three numbers : ");
		Scanner obj = new Scanner(System.in);
		int N1 = obj.nextInt();
		int N2 = obj.nextInt();
		int N3 = obj.nextInt();
		int res= (N1<N2)?(N1<N3?N1:N3):(N2<N3?N2:N3);
		System.out.println("the smallest number is "+ res);
	}
}
