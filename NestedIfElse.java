import java.util.Scanner;
public class NestedIfElse{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int score;
		String name;
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Enter your mark: ");
		score = Integer.valueOf(input.nextLine());
		
		if(score >= 90)
			System.out.println(name + " your grade is outstanding");
		
		else if(score >= 75)
			System.out.println(name + " your grade is excellent");
		
		else if(score >= 55)
			System.out.println(name + " your grade is good");
		
		else if(score >= 45)
			System.out.println(name + " your grade is average");
		
		else
			System.out.println(name + " your grade is very poor");
		
			
	}
}
		