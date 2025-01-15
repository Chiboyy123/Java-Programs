import java.util.Random;

public class RandomNumbers{
	public static void main(String[] args){
	
		//Create a variable to hold the random number
		Random random = new Random();
		
		int randomNum = random.nextInt();
		
		//print the random number
		System.out.printf("random number is %d%n", randomNum);
		
		//Generating a random number wwithin a range
		int randomNumInRange = random.nextInt(20) + 1;
		System.out.printf("Random number in range is: %d%n", randomNumInRange);
		
		//Generaing a float point value or number
		double randomFloat = random.nextDouble();
		System.out.printf("Random number in float range is: %.2f%n", randomFloat);
		
		//Generating a float point value within a rangedouble
		double min = 10.0;
		double max = 20.0;
		
		double randomFloatInRange = min + (max - min) * random.nextDouble();
		System.out.printf("Random number in float range is: %.2f%n", randomFloatInRange);
		
		//Generate random boolean
		boolean booleanValue = random.nextBoolean();
		System.out.printf("Random number in float range is: %b%n", booleanValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}