import java.util.Scanner;
public class MethodOverLoading{
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			System.out.println("____Menu___");
			System.out.println("Enter 1 to calculate the perimeter of square:");
			System.out.println("Enter 2 to calculate the perimeter of rectangle:");
		
			int choice = scan.nextInt();
		
		switch(choice){
			case 1:
			System.out.print("Enter length of the square:");
			int length = scan.nextInt();
			
			MethodOverLoading.shape(length);
			break;
		}
			
			case 2:{
			System.out.print("Enter the length of the rectangle:");
			int length = scan.nextInt();
			
			System.out.print("Enter the breadth of the  rectangle:");
			int breadth = scan.nextInt();
			
			MethodOverLoading.shape(length, breadth);
			break;
			}
	
			
			default:{
			System.out.println("Invalid input");
			}
			
	public static void shape(int length){
		int perimeterOfSquare = 4 *length;
		System.out.println("The perimeter of the square is " + perimeterOfSquare);
	}
	public static void shape(int length, int breadth){
		int perimeterOfRect = length * breadth;
		System.out.println("The perimeter of the rectangle is " + perimeterOfRect);
