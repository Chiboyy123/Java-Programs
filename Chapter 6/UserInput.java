import java.util.Scanner;
public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		String name;
		
		
		
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		
		System.out.print("Enter third number: ");
		num3 = input.nextInt();
		
		System.out.print("enter name");
		name = input.nextLine();
		
		
		int sum = num1 + num2 + num3;
		
		System.out.printf("%sThe sum of the three numbers is %d ", name,sum);
		
	}
}