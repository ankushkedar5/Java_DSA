package Basics_01;
import java.util.Scanner;

public class Lecture_04 {
    // loops in java

    public static void main(String args[]) {

        // for loop
        System.out.println("for loop");
        for(int counter = 0; counter <3 ; counter++) {
            System.out.println(counter + ". Hello world");
        }

        // Infinite loop we have to avoid it
        // for(int i = 0; ; i++) {
        //     System.out.println(i);
        // }

        // Numbers from 1 to 10
        for(int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }

        // while loop
        System.out.println("\n\nwhile loop");
        int j = 0; 
        while(j < 11) {
            System.out.println(j);
            j+=1;
        }

        // infinite while loop
        // while(true) {
        //     System.out.println("Infinite loop");
        // }

        // do while loop 
        System.out.println("\nDo while loop");
        // it can run at least once even if the condition is false
        int l = 1;
        do {
            System.out.println(l);
            l+=1;   
        } while(l < 11);

        System.out.println()  ;

        // false condition still runs at once that's the 
        // feature of do while loop
        int k = 0;
        do {
            System.out.println(k);
            k+=1;
        } while(k < 0);

        // Problem: print the sum of first 10 natural numbers
        System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of first " + n + " natural numbers is : " + sum);

        // Problem: print the table of a number input by the user
        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // Homework Problem: 
        // 1. Print all even numbers till n.
        // 2. run for( ; ; ) { System.out.println("Apna College"); }
        // loop on your system and analyze what happens. Try to 
        // think of the reason for the output produced.
        // 3.  Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
        // If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
        // If they enter 0 then stop.
        // If he/ she scores :
        // Marks >=90 -> print “This is Good”
        // 89 >= Marks >= 60 -> print “This is also Good”
        // 59 >= Marks >= 0 -> print “This is Good as well”
	    // Because marks don’t matter but our effort does.
        // (Hint : use do-while loop but think & understand why)

        // Problem 1.
        System.out.print("Enter the value of n1 : ");
        int n1 = sc.nextInt();
        for(int i = 2; i <= n1; i += 2) {
            System.out.print(i + " ");
        }

        // Problem 2.
        int v = 0;
        for( ; ; ) { // by default it is an infinite loop
                     // by default it will incremented
                     // by default it initialized to 0
            System.out.println(v +". Apna College");
            v++; if(v == 10) {
                break;
            }
        }

        // Problem 3.
        int choice;
        do {
            System.out.print("Enter the marks of the student (out of 100): ");
            int marks = sc.nextInt();
            if(marks >= 90) {
                System.out.println("This is Good");
            }
            else if(marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            }
            else if(marks >= 0 && marks <= 59) {
                System.out.println("This is Good as well");
                System.out.println("Because marks don’t matter but our effort does.");
            }
            else {
                System.out.println("Invalid");
            }
            System.out.print("Do you want to continue ? (Yes 1) or (No 0): ");
            choice = sc.nextInt();
        } while(choice == 1);



        // BONUS PROBLEM: Print if a number is prime or not (Input n2 from user)
        System.out.print("Enter a number to check if it is prime or not: ");
        int n2 = sc.nextInt();

        if(n2 <= 1) {
            System.out.println(n2 + " is Not a prime Number");
        }
        else {
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(n2); i++) {
                if(n2 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(n2 + " is a Prime Number");
            }
            else {
                System.out.println(n2 + " is Not a Prime Number");
            }
        }

        
         
    }
}