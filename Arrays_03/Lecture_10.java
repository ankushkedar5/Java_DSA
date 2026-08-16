package Arrays_03;
import java.util.Scanner;

// ARRAYS: List of Items of the same Type (ex. Marks)
// Defining an Array (First):
//     type[] arrayName = new type[size];
//     ex.-> 
//         int[] Marks = new int[5]; // Integer Type of Array Containing 5 Integer Numbers
// Defining an Array (Second):
//     type[] arrayName = {val1, val2, val3, val4};
//     ex.->
//         int[] nums = {1, 2, 3, 4, 5, 6}; // // Integer Type of Array Containing 6 Integer Numbers
// It follows indexing starts from 0 to size-1.

public class Lecture_10 {

    void problem(Scanner sc) {
        // Problem: Take an array as input from the user. Search for a given number x and 
        // print the index at which it occurs.

        System.out.println("Solution of Problem : ");
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.print("Enter Array elements separated by spaces: ");
        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter a number to find in the given array: ");
        int x = sc.nextInt();

        for(int i=0; i<size; i++) {
            if(array[i] == x) {
                System.out.println("Given number " + x + " is at index: " + i);
                return;
            }
        }
        System.out.println("Given number " + x + " is not present in array.");  
    }

    // Homework Problems:
    // 1. Take an array of names as input from the user and print them on the screen.
    // 2. Find the maximum & minimum number in an array of integers.
    //    [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]
    // 3. Take an array of numbers as input and check if it is an array sorted in ascending order.
    //    Eg : { 1, 2, 4, 7 } is sorted in ascending order.
    //    {3, 4, 6, 2} is not sorted in ascending order.

    void stringArray(Scanner sc) {
        // 1. Take an array of names as input from the user and print them on the screen.

        System.out.println("Solution of Homework Problem 01: ");
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        if(size <= 0) {
            System.out.println("This is an empty array");
            return;
        }

        System.out.print("Enter names separated by spaces: ");
        for(int i=0; i<size; i++) {
            names[i] = sc.next();
        }

        System.out.println("Names are: ");
        for(int i=0; i<size; i++) {
            System.out.println(names[i]);
        }
    }

    void minMaxNum(int numbers[], int size) {
        // 2. Find the maximum & minimum number in an array of integers.
        //    [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

        System.out.println("Solution of Homework Problem 02: ");
        if(size <= 0) {
            System.out.println("This is an empty array");
            return;
        }
        int min = numbers[0];
        int max = numbers[0];

        for(int i=1; i<size; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
            else if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("The Minimum Number is: " + min );
        System.out.println("The Maximum Number is: " + max);
    }

    void checkAscending(int numbers[], int size) {
        // 3. Take an array of numbers as input and check if it is an array sorted in ascending order.
        //    Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        //    {3, 4, 6, 2} is not sorted in ascending order.

        System.out.println("Solution of Homework Problem 03: ");
        if(size <= 0) {
            System.out.println("This is an empty array");
            return;
        }

        boolean isAscending = true;
        System.out.print("{");
        for(int i=0; i<size-1; i++) {
            if(numbers[i] > numbers[i+1]) {
                isAscending = false;
            }
            System.out.print(numbers[i]+", ");
            if(i+1 == size-1) {
                System.out.print(numbers[i+1]+"};");
            }
        }

        if(isAscending) {
            System.out.print(" is sorted in ascending order.");
        }
        else {
            System.out.println(" is not sorted in ascending order.");
        }
    }




    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Lecture_10 obj = new Lecture_10();

        // First Type of Array Defination
        // int[] marks = new int[3];
        int marks[] = new int[3]; // This is still valid
        marks[0] = 97; // math
        marks[1] = 92; // chem
        marks[2] = 95; // phy

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i=0; i<3; i++) {
            System.out.println(marks[i]);
        }

        // Second Type of Array Defination
        int nums[] = {1, 2, 3, 4, 5, 6}; // Integer Array of size 6

        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        // Array input from user / keyboard
        System.out.print("\nEnter Size of Array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.print("Enter Numbers separated by spaces: ");
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        // for(int i=0; i<size; i++) {
        //     System.out.println(numbers[i]);
        // }

        obj.problem(sc);
        obj.stringArray(sc);
        obj.minMaxNum(numbers, size);
        obj.checkAscending(numbers, size);
        sc.close();
    }
    // git commit -m "Add array fundamentals and problem solving"
}
