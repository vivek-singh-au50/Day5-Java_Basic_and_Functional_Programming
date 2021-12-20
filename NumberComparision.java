import java.util.Scanner;
public class NumberComparision{
  public static void main(String args[])
  {
    int x, y, z;
    System.out.println("Enter three integers");
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 1st number :");
    x = in.nextInt();
    System.out.println("Enter 2nd number :");
    y = in.nextInt();
    System.out.println("Enter 3rd number :");
    z = in.nextInt();

    if (x > y && x > z)
      System.out.println("First number is the largest.");
    else if (y > x && y > z)
      System.out.println("Second number is the largest.");
    else if (z > x && z > y)
      System.out.println("Third number is the largest.");
    else
      System.out.println("The numbers are not distinct.");
  }
}
