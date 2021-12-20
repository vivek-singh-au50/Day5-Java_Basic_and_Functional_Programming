import java.util.Scanner;


public class LeapYearCheck {
		
	public static boolean isLeapYear(int y){
		
		if(y%4==0){
			if(y%400==0){
				return true;
			}else if(y%100==0){
				return false;
			}else{
				return true;
			}
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter leap year");
		int year = sc.nextInt();
		if(year>999&&year<10000){
			if(isLeapYear(year)==true){
				System.out.println("This is a leap Year");
			}else if(isLeapYear(year)==false){
				System.out.println("This is not a leap year");
			}
		}else{
			System.out.println("UNVALID YEAR, Please enter in YYYY (4 digit) format only.");
		sc.close();
		}
	}

}
