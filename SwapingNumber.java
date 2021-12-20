import java.util.Scanner;

public class SwapingNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("Numbers before swaping");
		System.out.println(num1);
		System.out.println(num2);

		
		int swap1 = num2;
		int swap2 = num1;

		System.out.println("Numbers after swaping");
                System.out.println(swap1);
                System.out.println(swap2);

	}
}
