import java.util.Scanner;

 class Calculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int i = scanner.nextInt();
        System.out.print("Enter second number: ");
        int j = scanner.nextInt();

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Square root of first number");
        System.out.println("7. Power of a number");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition: " + add(i, j));
                break;
            case 2:
                System.out.println("Subtraction: " + subtract(i, j));
                break;
            case 3:
                System.out.println("Multiplication: " + multiply(i, j));
                break;
            case 4:
                System.out.println("Division: " + divide(i, j));
                break;
            case 5:
                System.out.println("Modulus: " + module(i, j));
                break;
            case 6:
                System.out.println("Square root of " + i + ": " + sqrt(i));
                break;
            case 7:
                System.out.println(i + " to the power " + j + ": " + power(i, j));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }

    public static double add(long a, long b) {
        return a + b;
    }

    public static double subtract(int a, int b) {
        return a - b;
    }

    public static double multiply(long a, long b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return a / (double) b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }

    public static double module(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Cannot perform modulus operation when divisor is zero.");
            return 1;
        }
    }

    public static double sqrt(int a) {
        return Math.sqrt(a);
    }

    public static double power(int base, int expo) {
        return Math.pow(base, expo);
    }
}

