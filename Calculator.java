import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("Enter 'add' for addition");
            System.out.println("Enter 'subtract' for subtraction");
            System.out.println("Enter 'multiply' for multiplication");
            System.out.println("Enter 'divide' for division");
            System.out.println("Enter 'quit' to end the program");

            System.out.print(": ");
            String user_input = scanner.nextLine();

            if (user_input.equals("quit")) {
                break;
            } else if (user_input.equals("add") || user_input.equals("subtract")
                    || user_input.equals("multiply") || user_input.equals("divide")) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                scanner.nextLine();

                if (user_input.equals("add")) {
                    System.out.println("Result: " + add(num1, num2));
                } else if (user_input.equals("subtract")) {
                    System.out.println("Result: " + subtract(num1, num2));
                } else if (user_input.equals("multiply")) {
                    System.out.println("Result: " + multiply(num1, num2));
                } else if (user_input.equals("divide")) {
                    System.out.println("Result: " + divide(num1, num2));
                }
            } else {
                System.out.println("Invalid input");
            }
        }
        scanner.close();
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return x / y;
    }
}
