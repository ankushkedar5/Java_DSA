package Basics_01;
import java.util.Scanner;

public class Lecture_01_02 {
    public static void main(String args[]) {

       // System.out.print("hello world");
        System.out.print("hello world \nWith Ankush Kedar\n");

        // print the pattern
        // *
        // **
        // ***
        // ****
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

    // variables
    //     int a = 10;
    //     int b = 20;     

    //     int age = 25; 
    //     int sum = a + b;

    // System.out.println("The value of a is: " + a);
    // System.out.println("The value of b is: " + b);
    // System.out.println("The value of age is: " + age);  
    // System.out.println("The sum of a and b is: " + sum);

    // quiz
    // claculate a * b            a = 10, b = 5
    //           ------
    //            a-b 
    // options:
    // int ans = a * b / a - b;
    // int ans = (a * b) / (a - b);

    // take a input from user using Scanner class
    /*Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = sc.next();
    System.out.println("The name is: " + name);
    sc.close();*/

    //problem: take 2 variables 'a' and 'b' and print their sum
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter the value of a: ");
    int a = Sc.nextInt();
    System.out.print("Enter the value of b: ");
    int b = Sc.nextInt();

    int sum = a + b;
    System.out.println("The sum of a and b is: " + sum);

    Sc.close();

    }
}