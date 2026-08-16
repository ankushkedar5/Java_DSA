package Basics_01;

public class Lecture_05 {
    // Pattern Problems in java

    void solidRectangle() {
    // 1. Solid Rectangle Pattern
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * * 
        int rows = 4;
        int columns = 5;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }    
    }

    void hollowRectangle() {
    // 2. Hollow Rectangle Pattern
        // * * * * *
        // *       *
        // *       *
        // * * * * *
        int rows = 4;
        int columns = 5;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                if(i>0 && i<rows-1 && j>0 && j<columns-1) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }

    void halfPyramid() {
    // 3. Half Pyramid Pattern
        // *
        // * *
        // * * *
        // * * * *
        int rows = 4;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void invertedHalfPyramid() {
    // 4. Inverted Half Pyramid Pattern
        // * * * *
        // * * *
        // * *
        // *
        int rows = 4;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<rows-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void halfPyramidRotated180() {
    // 5. Half Pyramid Rotated By 180 Degree Pattern
        //       *
        //     * *
        //   * * *
        // * * * *
        int rows = 4;
        for(int i=rows; i>0; i--) {
            for(int j=0; j<rows; j++) {
                if(j<i-1) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    void halfPyramidWithNumbers() {
    // 6. Half Pyrsmid With Numbers Pattern
        // 1 
        // 1 2
        // 1 2 3 
        // 1 2 3 4
        int rows = 5;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void invertedHalfPyramidWithNumbers() {
    // 7. Inverted Half Pyramid With Numbers Pattern
        // 1 2 3 4 5
        // 1 2 3 4 
        // 1 2 3 
        // 1 2
        // 1
        int rows = 5;
        for(int i=rows; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void floydsTringle() {
    // 8. Floyd's Tringle Pattern
        // 1           
        // 2  3  
        // 4  5  6
        // 7  8  9  10
        // 11 12 13 14 15
        int rows = 5;
        int val = 1;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                if(val/10 != 0) {
                    System.out.print(val + " ");
                }
                else {
                    System.out.print(val + "  ");
                }
                val++;
            }
            System.out.println();
        }
    }

    void tringle_0_1() {
    // 9. 0-1 Triangle Pattern 
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        int rows = 5;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                if(i%2 == 0) {
                    if(j%2 == 0) {
                        System.out.print("1 ");
                    }
                    else {
                        System.out.print("0 ");
                    }
                }
                else {
                    if(j%2 == 0) {
                        System.out.print("0 ");
                    }
                    else {
                        System.out.print("1 ");
                    }
                }

                // simplified logic 
                // if((i+j) % 2 == 0) {
                //     System.out.print("1 ");
                // }
                // else {
                //    System.out.print("0 ");
                // }
            }
            System.out.println();
        }
    }

    // Home Work Problems

    // 1. Print a Solid Rhombus
    //         * * * * *
    //       * * * * *
    //     * * * * *       
    //   * * * * *
    // * * * * *

    // 2. Print a Number Pyramid
    //     1
    //    2 2 
    //   3 3 3
    //  4 4 4 4
    // 5 5 5 5 5 

    // 3. Print a Palindromic Number Pyramid
    //         1
    //       2 1 2 
    //     3 2 1 2 3 
    //   4 3 2 1 2 3 4 
    // 5 4 3 2 1 2 3 4 5 

    // Problem 1:
    void solidRhombus() {
    // 10. Print a solid Rhombus Pattern
        int rows = 5;
        int columns = 9;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=columns-i+1; j++) {
                if(j<=rows-i) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    // Problem 2: 
    void numberPyramid() {
    // 11. Print a Number Pyramid Pattern
        int rows = 5;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Problem 3:
    void palindromicNumberPyramid() {
    // 12. Print a Palindromic Number Pyramid Pattern
        int rows = 5;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows-i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for(int j=2; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }



     


    public static void main(String args[]) {
        Lecture_05 pattern = new Lecture_05();

        pattern.solidRectangle();

        System.out.println();

        pattern.hollowRectangle();

        System.out.println();

        pattern.halfPyramid();

        System.out.println();

        pattern.invertedHalfPyramid();

        System.out.println();

        pattern.halfPyramidRotated180();

        System.out.println();

        pattern.halfPyramidWithNumbers();

        System.out.println();

        pattern.invertedHalfPyramidWithNumbers();
        
        System.out.println();

        pattern.floydsTringle();

        System.out.println();

        pattern.tringle_0_1();

        System.out.println();

        pattern.solidRhombus();

        System.out.println();

        pattern.numberPyramid();

        System.out.println();

        pattern.palindromicNumberPyramid();


    }
}
