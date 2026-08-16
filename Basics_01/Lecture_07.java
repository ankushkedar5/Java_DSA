package Basics_01;
import java.util.Scanner;

// Functions in Java
// Syntax :
//    returnType functionName(type arg1, type arg2,...) {
//        // Operations
//        // Block of Code
//
//        // Return Statement
//    }
public class Lecture_07 {

    public static void printMyName(String name) {
        System.out.println("My name is: " + name);
        return;
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    // Problem 1: 
    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    // Problem 2:
    public static long calculateFactorial(int number) {

        // int factorial = 1;
        // for(int i=number; i>=1; i--) {
        //     factorial = i * factorial;
        // }
        // return factorial;

        if(number < 0) {
            System.out.println("Can't Calculate the Factorial of Negative Number");
            return -1;
        }
        else if(number == 1 || number == 0) {
            return 1;
        }
        else {
            return number * calculateFactorial(number-1);
        }  
    }

    // Homework Problems: 
    //  1. Make a function to check if a number is prime or not.
    //  2. Make a function to check if a given number n is even or not.
    //  3. Make a function to print the table of a given number n.
    //  4. Read about Recursion.

    // Homework Problem 1:
    public static void checkPrimeNumber(int number) {
        if(number <= 1) {
            System.out.println(number + " is not a prime number");
        }
        else {
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(number); i++) {
                if(number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(number + " is a prime number");
            }
            else {
                System.out.println(number + " is not a prime number");
            }
        }
    }

    // Homework Problem 2:
    public static void checkOddOrEven(int number) {
        if(number % 2 ==0) {
            System.out.println(number + " is Even");
        }
        else {
            System.out.println(number + " is Odd");
        }
    }

    // Homework Problem 3:
    public static void calculateTable(int number) {
        for(int i=1; i<=10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }

    // Homework Problem 4:
    // * Recursion is a technique where a method calls itself to solve a smaller
    //   version of the same problem.
    // * Every recursive method needs a base case that stops the recursion.
    // * The recursive case calls the same method with a smaller or simpler input.
    // * Recursion works through the call stack: calls go deeper first, then return back upward.
    // * It is especially useful for problems that can naturally be divided into smaller,
    //   similar subproblems, such as factorial, trees, searching, sorting, and backtracking.


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String name = sc.nextLine();

        printMyName(name); // function calling without object because the method is static
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("The sum of " + a + " + " + b + " is: " + sum);

        // Problem 1: Make a function to multiply 2 numbers and return the product
        int product = calculateProduct(a, b);
        System.out.println("The Product of " + a + " * " + b + " is: " + product);

        // Problem 2: Find a factorial of a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        long factorial = calculateFactorial(number);
        if(number >= 0) {
            System.out.println("The Factorial of " + number + " is: " + factorial);
        }
        
        checkPrimeNumber(number);

        checkOddOrEven(number);

        calculateTable(number);
        
        sc.close();
    }
}
