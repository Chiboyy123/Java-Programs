import java.util.Scanner;

public class RandomNumbers{
	publiic static void main(String[] args){
		Random random = new Random();
		
		int randomNum = random.nextIntt();
		
		System.out.printf("random number is %d%n", randomNum);
	}
}