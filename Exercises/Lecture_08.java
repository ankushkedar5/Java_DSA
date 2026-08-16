package Exercises;
import java.util.Scanner;


public class Lecture_08 {
    Scanner sc = new Scanner(System.in);

    // 1. Enter 3 numbers from the user & make a function to print their average.
    void average() {
        System.out.print("Enter three numbers separated by space: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int average = (num1 + num2 + num3) / 3;

        System.out.println("The Average Of "+num1+", "+num2+" & "+num3+" is: "+average);
    }

    // 2. Write a function to print the sum of all odd numbers from 1 to n.
    void oddSum() {
        System.out.print("\nEnter a Number to Find The Sum: ");
        int num = sc.nextInt();

        if(num < 0) {
            System.out.println("Invalid Number: Please Enter Positive Number");
            return;
        }
        else{
            int sum = 0;
            for(int i=1; i<=num; i+=2) {
                sum += i;
            }
            System.out.println("The sum of all odd numbers till "+num+" is: "+sum);
        } 
    }

    // 3. Write a function which takes in 2 numbers and returns the greater of those two.
    void checkGreater() {
        System.out.print("\nEnter two numbers separated by space: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println("First number "+num1+" is Greater than Second number "+num2);
        }
        else if(num1 < num2) {
            System.out.println("Second number "+num2+" is Greater than First number "+num1);
        }
        else {
            System.out.println("Both numbers are equal which is: "+num1);
        }
    }

    // 4. Write a function that takes in the radius as input and returns the circumference of a circle.
    void circumference() {
        System.out.print("\nEnter Radius of Circle to calculate Circumference: ");
        int radius = sc.nextInt();

        double circumference = 2 * 3.14 * radius;
        System.out.println("The circumference of circle who's raidius "+radius+" is: "+circumference);
    }

    // 5. Write a function that takes in age as input and returns if that person is eligible to vote
    //    or not. A person of age > 18 is eligible to vote.
    void checkEligiblity() {
        System.out.print("\nEnter Your Age to check Eligiblity: ");
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("Eligible for vote");
        }
        else {
            System.out.println("Not Eligible for vote");
        }
    }

    // 6. Write an infinite loop using do while condition.
    void infiniteLoop() {
        int count = 1;
        do {
            System.out.println(count+". This is an Infinite Loop");
            count+=1;
        } while(count > 0);
    }

    // 7. Write a program to enter the numbers till the user wants and at the end it should 
    //    display the count of positive, negative and zeros entered.
    void countNums() {
        System.out.print("\nEnter how many numbers you want to add: ");
        int limit = sc.nextInt();

        int nums[] = new int[limit];
        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        System.out.print("Enter "+limit+" Numbers seperated by space: ");
        for(int i=0; i<limit; i++) {
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<limit; i++) {
            if(nums[i] < 0) {
                negatives++;
            }
            else if(nums[i] > 0) {
                positives++;
            }
            else {
                zeros++;
            }
        }
        System.out.println("You Entered "+negatives+" Negative Numbers, "+positives+" Positive Numbers and "+zeros+" Zeros");
    }

    // 8. Two numbers are entered by the user, x and n. Write a function to find the value of
    //    one number raised to the power of another i.e. xn.
    void calculatePower() {
        System.out.print("\nEnter Number: ");
        int num = sc.nextInt();
        System.out.print("Enter Power: ");
        int power = sc.nextInt();

        int result = 1;

        for(int i=1; i<=power; i++) {
            result *= num;
        }
        System.out.println("The value of "+num+" to the power "+power+" is: "+result);
    }

    // 9. Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
    void calculateGreatestDivisor() {
        System.out.print("\nEnter two Numbers seperated by space: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 <= 0 || num2 <= 0) {
            System.out.println("Please Enter Positive/Greater than zero Numbers");
            return;
        }
        else {
            if(num1 == num2) {
                System.out.println("The Greatest Common Divisor of "+num1+" and "+num2+" is: "+num1);
                return;
            }
            // First Approach: Brute-Force Divisor Logic for Greatest Common Divisor
            // else {
            //     int small = num1 < num2 ? num1 : num2;
            //     int large = num1 < num2 ? num2 : num1;

            //     int count = 0;
            //     for(int i=1; i<=small; i++) {
            //         if(small % i == 0) {
            //             count++;
            //         }
            //     }

            //     int divisors[] = new int[count];

            //     int j = 0;
            //     for(int i=1; i<=small; i++) {
            //         if(small % i == 0) {
            //             divisors[j] = i;
            //             j++;
            //         }
            //     }

            //     for(int i=count-1; i>=0; i--) {
            //         if(large % divisors[i] == 0) {
            //             System.out.println("The Greatest Common Divisor of "+num1+" and "+num2+" is: "+divisors[i]);
            //             return; 
            //         }
            //     }
            // }

            // Improved: Simplified & Efficient Logic for Greatest Common Divisor
            else {
                int small = num1 < num2 ? num1 : num2;
                for(int i=small; i>=1; i--) {
                    if(num1 % i == 0 && num2 % i == 0) {
                        System.out.println("The Greatest Common Divisor of "+num1+" and "+num2+" is: "+i);
                        return;
                    }
                }
            }
        }
        // What I learned:
        // * Find GCD by checking common divisors
        // * Start from the smaller number and move downward
        // * The first number that divides both numbers is the GCD
        // * Simplified my first approach by removing unnecessary arrays and loops
    }

    // 10. Write a program to print Fibonacci series of n terms where n is input by user :
    //     0 1 1 2 3 5 8 13 21 ..... 
    //     In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it. (BONUS)
    void fibonacciSeries() {
        System.out.print("\nEnter a number to calculate Fibonacchi Series: ");
        int num = sc.nextInt();

        int last = 0;
        int current = 1;

        if(num <= 0) {
            System.out.println("Please Enter Number Greater than Zero");
            return;
        }
        else if(num == 1) {
            System.out.print("The Fibonacci Series for "+num+" is: ");
            System.out.print(last);
            return;
        }
        else if(num == 2) {
            System.out.print("The Fibonacci Series for "+num+" is: ");
            System.out.print(last + ", " + current);
            return;
        }

        System.out.print("The Fibonacci Series for "+num+" is: ");
        System.out.print(last + ", " + current + ", ");

        for(int i=2; i<num; i++) {
            int temp = current;
            current += last;
            if(i == num-1) {
                System.out.print(current);
                return;
            }
            System.out.print(current + ", ");
            last = temp;
        }
    }

    public static void main(String args[]) {
        Lecture_08 obj = new Lecture_08();

        obj.average();
        obj.oddSum();
        obj.checkGreater();
        obj.circumference();
        obj.checkEligiblity();
    //  obj.infiniteLoop();
        obj.countNums();
        obj.calculatePower();
        obj.calculateGreatestDivisor();
        obj.fibonacciSeries();
    }  
}
