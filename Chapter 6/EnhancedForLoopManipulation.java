import java.util.Scanner;
public class EnhancedForLoopManipulation{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];
		int product = 1;
		
		for(int i = 0; i < 10; i++){
			System.out.print("Enter number: ");
			numbers[i] = scan.nextInt();
			
			product *= numbers[i];
		}
		System.out.printf("The product of all the numbers is %d", product);
	}
}