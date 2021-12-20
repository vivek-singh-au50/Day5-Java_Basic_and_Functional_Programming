import java.util.Scanner;

public class Distance {

	/**
	 Function to calculate the distance
	 */
	static void calculate(int x, int y) {
		System.out.println("distance is " + Math.pow((x * x + y * y), 0.5));
	}

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter value for x");
			int x = s.nextInt();
			System.out.println("enter value for y ");
			int y = s.nextInt();
			calculate(x, y);
			s.close();
		} catch (Exception e) {
			System.out.println("enter integer only");
		}
	}
}
