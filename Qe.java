import java.util.Scanner;

class Qe{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = input.nextDouble();


        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real and distinct roots:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root (repeated):");
            System.out.println("Root: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Two complex roots:");
            System.out.println("Root 1: " + realPart + " +i " + imaginaryPart);
            System.out.println("Root 2: " + realPart + " -i " + imaginaryPart);
        }
    }
}

