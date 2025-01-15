import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the upper limit to be generated: ");
        int upperLimit = scan.nextInt();
		
		if(upperLimit == 0) {
			System.out.println("The number number mustr be greater than 0");
		}
		else{
			int randomNumber = random.nextInt(upperLimit) + 1;
			System.out.printf("The generated random number from 0 - %d is: %d%n",upperLimit, randomNumber);	
		}
	}
}
			