import java.util.Scanner;
public class SentinelLoop{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter numbers to sum (enter -1 to stop: ):");
		
		int sum = 0;
		int number;
		
		while(true) {
			System.out.println("Enter number: ");
			number = scan.nextInt();
			
			if(number == -1) {
				break;
			}
			
			sum += number;
		}
		
		System.out.println("The total sum is: " + sum);
		
		
	}
}