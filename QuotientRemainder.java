import java.util.Scanner;

public class QuotientRemainder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 1st number : ");
		int num2 = sc.nextInt();
		int quotient = (num1/num2);
		int remainder = (num1%num2);
		System.out.println("Quotient is : " + quotient );
		System.out.println("Remainder is : " + remainder);
	}
}
