package Arrays_03;
import java.util.Scanner; 

// 2D_Arrays:
// Declaration od 2D_Array:
//     type[][] arrayName = new type[rows][columns];
//     ex.->
//         int[][] nums = new int[3][5];

public class Lecture_11 {

    void array2D(Scanner sc) {
        System.out.print("Enter number of rows and columns respectively: ");
        int rows = sc.nextInt();
        int columns =sc.nextInt();

        int[][] nums = new int[rows][columns];

        System.out.print("Enter Array Elements: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Problem: 
    //     Take a matrix as input from the user. Search for a given number x
    //     and print the indices at which it occurs.
    void problem(Scanner sc) {
        System.out.print("Enter number of rows and columns respectively: ");
        int rows = sc.nextInt();
        int columns =sc.nextInt();

        int[][] nums = new int[rows][columns];

        System.out.print("Enter Array Elements: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number that you have to find the location: ");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                if(nums[i][j] == x) {
                    System.out.println("Given number " + x + " is at indices: (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Given number " + x + " is not present in array.");
            return;
    }

    // Homework Problems
    // 1. Print the spiral order matrix as output for a given matrix of numbers.
    //    [Difficult for Beginners]
    // 2. For a given matrix of N x M, print its transpose.




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lecture_11 obj = new Lecture_11();

        // obj.array2D(sc);
        obj.problem(sc);
        sc.close();
    }
    
}
 