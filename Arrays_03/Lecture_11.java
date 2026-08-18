package Arrays_03;
import java.util.Scanner; 

// 2D_Arrays:
// Declaration od 2D_Array:
//     type[][] arrayName = new type[rows][columns];
//     ex.->
//         int[][] nums = new int[3][5];

public class Lecture_11 {

    public static int[][] array2D(Scanner sc) {
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

        System.out.println("Your Array: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        //spiralMatrix(nums);
        transposeMatrix(nums);
        return nums;
    }

    // Problem: 
    //     Take a matrix as input from the user. Search for a given number x
    //     and print the indices at which it occurs.
    static void problem(Scanner sc) {
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

    // Problem 1:
    public static void spiralMatrix(int[][] nums) {
        if(nums == null || nums.length == 0) {
            System.out.println("The given Array is empty");
            return;
        }

        int top = 0; 
        int bottom = nums.length - 1;
        int left = 0; 
        int right = nums[0].length - 1;

        System.out.print("\nThe Sprial Elements of given Matrix is: ");
        while(top <= bottom && left <= right) {

            for(int i=left; i<=right; i++) {
                System.out.print(nums[top][i] + " ");
            }
            top++;

            for(int j=top; j<=bottom; j++) {
                System.out.print(nums[j][right] + " ");
            }
            right--;

            if(top <= bottom) {
                for(int k=right; k>=left; k--) {
                    System.out.print(nums[bottom][k] + " ");
                }
                bottom--;
            }

            if(left <= right) {
                for(int l=bottom; l>=top; l--) {
                    System.out.print(nums[l][left] + " ");
                }
                left++;
            }
        }   
    }

    // Problem 2:
    public static void transposeMatrix(int nums[][]) {
        if(nums == null || nums.length == 0) {
            System.out.println("The given Array is empty");
            return;
        }

        System.out.println("The Transpose of given Array is: ");
        for(int i=0; i<nums[0].length; i++) {
            for(int j=0; j<nums.length; j++) {
                System.out.print(nums[j][i] + " ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array2D(sc);
        // obj.problem(sc);
        array2D(sc);
        problem(sc);
        // spiralMatrix(null);
        // transposeMatrix(null);
        sc.close();
    }
    
}
    