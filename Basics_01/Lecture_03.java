package Basics_01;
import java.util.Scanner;

// conditional statements
// if, else, else if
// if else if else
// switch case
// break

public class Lecture_03 {

    public static void main(String args[]) {

        Scanner Sc = new Scanner(System.in);

        // check if the user is adult or not
        System.out.print("Enter your age: ");
        int age = Sc.nextInt(); 

        if(age >= 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }

        // odd or even
        System.out.print("Enter a number: ");
        int number = Sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        // Problem: take 2 numbers from user and compare 
        // them with each other and print the conclusion
        System.out.print("Enter first number: ");
        int num1 = Sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = Sc.nextInt();

        if(num1 == num2) {
            System.out.println("Both numbers are equal");
        }
        else if(num1 > num2) {
            System.out.println("num1 is greater than num2");
        }
        else {
            System.out.println("num2 is greater than num1");
        }

        // Problem: take input as integer (1, 2, 3) 1 -> hello, 2 -> namaste,
        // 3 -> bonjour

        System.out.print("Enter a number (1, 2, 3): ");
        int button = Sc.nextInt();

        // Using if else ladder
        if(button == 1) {
            System.out.println("Hello");
        }
        else if(button == 2) {
            System.out.println("Namaste");
        }
        else if(button == 3) {
            System.out.println("Bonjour");
        }
        else {
            System.out.println("Invalid input");
        }

        // Using switch case
        switch(button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid input");
        }
        
        // HomeWork Problem: 
        // Make a Calculator. Take 2 numbers (a & b) from the user and 
        // an operation as follows : 
        // 	1 : + (Addition) a + b
        // 2 : - (Subtraction) a - b
        // 3 : * (Multiplication) a * b
        // 4 : / (Division) a / b
        // 5 : % (Modulo or remainder) a % b
        // Calculate the result according to the operation given and
        //  display it to the user.

        // Ask the user to enter the number of the month & print the
        //  name of the month. For eg - For ‘1’ print ‘January’, ‘2’ 
        // print ‘February’ & so on.

        System.out.println("__________Calculator__________");

        System.out.print("Enter the first number: ");
        int x = Sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = Sc.nextInt();

        System.out.print("Enter the operator: ");
        char operator = Sc.next().charAt(0);

        switch(operator) {
            case '+':
                int sum = x + y;
                System.out.println("The Addition is: " + sum);
                break;
            case '-':
                int diff = x - y;
                System.out.println("The Subtraction is: " + diff);
                break;
            case '*':
                int product = x * y;
                System.out.println("The Multiplication is: " + product);
                break;
            case '/':
                if(y != 0) {
                    int division = x / y;
                    System.out.println("The Division is: " + division);
                }
                else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            case '%':
                if(y != 0) {
                    int modulo = x % y;
                    System.out.println("The Modulo is: " + modulo);
                }
                else {
                    System.out.println("Modulo by zero is not allowed");
                }
                break;
            default:
        }

        System.out.println("__________Month Finder__________");

        System.out.print("Enter the number of the month: ");
        int month = Sc.nextInt();

        switch(month) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Invalid month number");
        }
     Sc.close();
    }

}
