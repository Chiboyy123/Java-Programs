import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
		
        System.out.println("Enter 10 numbers:");
        int sumSecondToSixth = 0;
        int sumSeventhToNinth = 0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            if (i >= 1 && i <= 5) {
                sumSecondToSixth += numbers[i];
            } else if (i >= 6 && i <= 8) {
                sumSeventhToNinth += numbers[i];
            }
        }

        int result = sumSecondToSixth - sumSeventhToNinth;

        System.out.println("Sum of 2nd to 6th elements: " + sumSecondToSixth);
        System.out.println("Sum of 7th to 9th elements: " + sumSeventhToNinth);
        System.out.println("Final result: " + result);
    }
}