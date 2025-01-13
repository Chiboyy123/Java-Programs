import java.util.Scanner;

public class Constant {
    public static final double PI = 3.141;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scan.nextDouble();

        double area = Constant.area(radius);
        System.out.printf("The area of the circle is: %.2f%n", area);
    }
    public static double area(double radius) {
        return PI * radius * radius;
    }
}