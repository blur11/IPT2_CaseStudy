package vscodeProjects;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num1 = "", num2= "";//initialize variable

        int number1 = 0, number2 = 0;

        while (num1 == "") {

            System.out.print("Enter first number: ");

            try {
                num1 = sc.nextLine(); // this takes the input from the user
                number1 = Integer.parseInt(num1);
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                num1 = "";
            }

        }

        while (num2 == "") {

            System.out.print("Enter Second number: ");

            try {
                num2 = sc.nextLine(); // this takes the input from the user
                number2 = Integer.parseInt(num2);
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                num2 = "";
            }

        }

        char opt;
        double result = 0;

        do {

            // this asks the user what operation should be used

            System.out.println("A. Addition\nB. Subtraction\nC. Multiplication\nD. Division");
            System.out.print("Choose Operation: ");
            opt = sc.nextLine().charAt(0);


            if (opt != 'A' && opt != 'a' &&
             opt != 'B' && opt != 'b' &&
              opt != 'C' && opt != 'c' &&
               opt != 'D' && opt != 'd') {

                System.out.println("Invalid choice. Please choose 'A', 'B', 'C', or 'D'.");

            }

        } while (opt != 'A' && opt != 'a' &&
         opt != 'B' && opt != 'b' &&
          opt != 'C' && opt != 'c' &&
           opt != 'D' && opt != 'd');

           switch(opt) {
            case 'A':
            case 'a':
                // Addition
                result = number1 + number2;
                break;

            case 'B':
            case 'b':
                // Subtraction
                result = number1 - number2;
                break;

            case 'C':
            case 'c':
                // Multiplication
                result = number1 * number2;
                break;

            case 'D':
            case 'd':
                // Division
                if (number2 != 0) {
                    result = (double) number1 / number2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
        }
        // this prints the answer

        System.out.println("Result: " + result);

        sc.close();

    }

}
