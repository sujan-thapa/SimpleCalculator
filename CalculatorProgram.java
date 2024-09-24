// Imagine you are developing a simple calculator program that takes user input for two numbers and performs 
// basic operations (addition, subtraction, multiplication, and division).
// Implement exception handling to deal with scenarios such as division by zero or invalid input (non-numeric).

// import java.util.*;

import java.util.Scanner;
// import java.util.IllegalFormatException;
// import java.util.NumberFormatException;

public class CalculatorProgram {
    public static void main(String[] args) {
        Calculation();
        // System.out.println("Hello, World!");

        // scanner object to take user input for two numbers and the operation
        // Scanner scanner = new Scanner(System.in);

        // boolean run = true;
        // try{
        //     while(run){
        //         try{
        //             System.out.println("Enter the first number: ");
        //             // string to double conversion
        //             double num1 = Double.parseDouble(scanner.nextLine());
        //             // user's input as a double
        //             // double num1 = scanner.nextDouble();  

        //             System.out.println("Enter the second number: ");
        //             double num2 = Double.parseDouble(scanner.nextLine());
        //             // double num2 = scanner.nextDouble();  


        //             System.out.println("Which operation do you want? Please choose the required operator (+, -, *, /): ");
        //             char operator = scanner.nextLine().charAt(0);

        //             double result = 0;
        //             switch(operator){
        //                 case '+':
        //                     result = addition(num1, num2);
        //                     break;
        //                 case '-':
        //                     result = subtraction(num1, num2);
        //                     break;
        //                 case '*':
        //                     result = multiplication(num1, num2);
        //                     break;
        //                 case '/':
        //                     if(num2 == 0){
        //                         throw new ArithmeticException("Division by zero not possible. Enter a non-zero number.");

        //                     }
        //                     result = division(num1, num2);
        //                     break;

        //                 // throw an exception if the operator is invalid
        //                 default:
        //                     // throw an exception if the operator is invalid
        //                     throw new IllegalArgumentException("Invalid operator. Please choose +, -, *, or /.");
        //             }
        //             System.out.println("Result: " + result);
            

        //         }
        //         catch(NumberFormatException e){
        //             System.out.println("Invalid input. Please enter a valid number.");
        //         }
        //         catch(ArithmeticException e){
        //             System.out.println(e.getMessage());
        //         }
        //         catch(IllegalArgumentException e){
        //             System.out.println(e.getMessage());
        //         }

        //         // this exception is in the case of using nextdouble() method
        //         // catch(InputMismatchException e){
        //         //     System.out.println("Invalid input. Please enter a valid number.");
        //         // }



        //         System.out.println("Do you want to continue? (yes/no)");
        //         String response = scanner.nextLine();
        //         if (response.equalsIgnoreCase("yes")) {
        //             // continue the loop
        //             run = true; 
        //             // Break out of the validation loop
        //             // break; 
        //         } else if (response.equalsIgnoreCase("no")) {
        //             // Exit the loop by setting run to false
        //             run = false; 
        //             break; 
        //             // Break out of the validation loop
        //         } else {
        //             // If input is invalid, notify the user
        //             System.out.println("Invalid response. Please enter 'yes' or 'no'.");
        //             run = true;
        //             // break;
        //         }
            
        //     }
        // } finally {
            
        //     scanner.close(); // Close the scanner here
        //     System.out.println("Thank you for using the calculator.");

                
        // }
            
        }

    

        

    // method to perform addition
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    // method to perform subtraction
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    // method to perform multiplication
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    // method to perform division
    public static double division(double num1, double num2) {

        // check if the second number is zero
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
    // public static double rgh()
    public static void Calculation() {
        Scanner scanner = new Scanner(System.in);
    
        boolean run = true;
        try {
            while (run) {
                try {
                    System.out.println("Enter the first number: ");
                    double num1 = Double.parseDouble(scanner.nextLine());
    
                    System.out.println("Enter the second number: ");
                    double num2 = Double.parseDouble(scanner.nextLine());
    
                    System.out.println("Which operation do you want? Please choose the required operator (+, -, *, /): ");
                    char operator = scanner.nextLine().charAt(0);
    
                    double result;
                    switch (operator) {
                        case '+':
                            result = addition(num1, num2);
                            break;
                        case '-':
                            result = subtraction(num1, num2);
                            break;
                        case '*':
                            result = multiplication(num1, num2);
                            break;
                        case '/':
                            result = division(num1, num2);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid operator. Please choose +, -, *, or /.");
                    }
                    System.out.println("Result: " + result);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
    
                // Ask if the user wants to continue
                String response;
                do {
                    System.out.println("Do you want to continue? (yes/no)");
                    response = scanner.nextLine();
                    // Check if the response is valid
                    if (response.equalsIgnoreCase("yes")) {
                        run = true; // Continue the loop
                        break; // Exit the do-while loop
                    } else if (response.equalsIgnoreCase("no")) {
                        run = false; // Exit the loop
                        break; // Exit the do-while loop
                    } else {
                        // Invalid input; prompt again
                        System.out.println("Invalid response. Please enter 'yes' or 'no'.");
                    }
                } while (true); // Loop until a valid response is given
            }
        } finally {
            scanner.close(); // Close the scanner here
            System.out.println("Thank you for using the calculator.");
        }
    }
    

}