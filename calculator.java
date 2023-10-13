package javaProjects;

import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args) {
        
                 
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; ; i++){
        String num1 = "", num2= "";

        int number1 = 0, number2 = 0;

        

        while (num1 == "") {

            System.out.print("Enter first number: ");
  

            try {
                num1 = sc.nextLine();
                System.out.println("————————————————————");
                number1 = Integer.parseInt(num1);
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                System.out.println("————————————————————");
                num1 = "";
            }

        }

        while (num2 == "") {

            System.out.print("Enter Second number: ");

            try {
                num2 = sc.nextLine();
                System.out.println("————————————————————");
                number2 = Integer.parseInt(num2);
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                System.out.println("————————————————————");
                num2 = "";
            }

        }

        char opt;
        double result = 0;

        do {

            System.out.println("A. Addition\nB. Subtraction\nC. Multiplication\nD. Division");
            System.out.print("Choose Operation: ");
            opt = sc.nextLine().charAt(0);
            System.out.println("————————————————————");

    
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

        System.out.println("Result: " + result);
        System.out.println("————————————————————");
        System.out.println("Do you still want to continue? YES/NO");
        String continueCalc = sc.nextLine();
        System.out.println("————————————————————");
        if("NO".equalsIgnoreCase(continueCalc)){
            System.out.println("Thanks for using our Calculator!!");
            System.exit(0);
        }
        else if(!"YES".equalsIgnoreCase(continueCalc)){
            System.out.println("Thanks for using our Calculator!!");
            System.exit(0);
        }
        else if ("YES".equalsIgnoreCase(continueCalc)){
            
        }

     
    }
    }

}
