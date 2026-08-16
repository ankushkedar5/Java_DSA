package Basics_01;

public class Lecture_06 {
    // Advance Pattern Problems in Java
    
    void butterflyPattern() {
    // 13. Print the Butterfly Pattern
        // *             * 
        // * *         * * 
        // * * *     * * * 
        // * * * * * * * * 
        // * * * * * * * * 
        // * * *     * * * 
        // * *         * * 
        // *             * 
        int rows = 4;
        // upper
        for(int i=1; i<=rows; i++) {
            // upper-left
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            // upper-spaces
            for(int j=1; j<= 2*(rows-i); j++) {
                System.out.print("  ");
            }
            
            // upper-right
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // lower
        for(int i=rows; i>=1; i--) {
            // lower-left
            for(int j=i; j>=1; j--) {
                System.out.print("* ");
            }
            
            // lower-spaces
            for(int j=2*(rows-i); j>=1; j--) {
                System.out.print("  ");
            }
            
            // lower-right
            for(int j=i; j>=1; j--) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    void solidRhombus() {
    // 14. Print the Solid Rhombus Pattern
        //         * * * * *
        //       * * * * *
        //     * * * * *
        //   * * * * *
        // * * * * *
        int rows = 5;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows-i; j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void hollowRhombus() {
    // 14. Print the Hollow Rhombus Pattern
        //         * * * * *
        //       *       *
        //     *       *
        //   *       *
        // * * * * *
        int rows = 5;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows-i; j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=rows; j++) {
                if(i==1 || i==5 || j==1 || j==5) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        
    }

    void numberPyramid() {
    // 15. Print a Number Pyramid Pattern
        //     1
        //    2 2 
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5 
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

    void palindromicPattern() {
    // 16. Print a Palindromic Number Pyramid Pattern
        //         1
        //       2 1 2 
        //     3 2 1 2 3 
        //   4 3 2 1 2 3 4 
        // 5 4 3 2 1 2 3 4 5 
        int rows = 5;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows-i; j++) {
                System.out.print("  ");
            }

            for(int j=i; j>=1; j--) {
                System.out.print(j + " ");
            }

            for(int j=2; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void diamondPattern() {
    // 17. Print the Solid Diamond Pattern
        //       *
        //     * * *
        //   * * * * *
        // * * * * * * * 
        // * * * * * * * 
        //   * * * * * 
        //     * * * 
        //       *
        int rows = 4;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows-i; j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            for(int j=2; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=rows; i>=1; i--) {
            for(int j=1; j<=rows-i; j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            for(int j=2; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Home Work Problems

    // 1. Print the Hollow Butterfly Pattern
    // *             * 
    // * *         * * 
    // *   *     *   * 
    // *     * *     * 
    // *     * *     * 
    // *   *     *   * 
    // * *         * * 
    // *             * 

    // 2. Print the Pascal's Triangle Pattern
    //     1
    //    1 1 
    //   1 2 1 
    //  1 3 3 1 
    // 1 4 6 4 1

    // 3. Print Inverted Half Pyramid Pattern
    // 1 1 1 1 1
    //  2 2 2 2
    //   3 3 3
    //    4 4
    //     5

    // 4. Print Half Pyramid Pattern
    //     1
    //    1 2
    //   1 2 3
    //  1 2 3 4 
    // 1 2 3 4 5

    // Problem 1:
    void hollowButterfly() {
    // 18. Print the Hollow Butterfly Pattern
        int rows = 5;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                if(i==1 || j==1 || j==i) {
                    System.out.print("* ");
                }
                else {
                System.out.print("  ");
                }
            }

            for(int j=1; j<=2*(rows-i); j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++) {
                if(i==1 || j==1 || j==i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i=rows; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                if(i==1 || j==1 || j==i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            for(int j=1; j<=2*(rows-i); j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++) {
                if(i==1 || j==1 || j==i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Problem 2:
    void pascalsTriangle() {
    // 19. Print the Pascal's Triangle Pattern
        int rows = 5;
        for(int i=0; i<rows; i++) {
            for(int j=1; j<=rows-i - 1; j++) {
                System.out.print(" ");
            }
            int val = 1;
            for(int j=0; j<=i; j++) {
                System.out.print(val + " ");
                val = val*(i-j)/(j+1); // so deficult part in this pattern
            }
            System.out.println();
        }
    }

    // Problem 3:
    void invertedHalfPyramid() {
    // 20. Print Inverted Half Pyramid Pattern
        int rows = 5;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=i-1; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=rows-i+1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Problem 4:
    void halfPyramid() {
    // 21. Print Half Pyramid Pattern
        int rows = 5;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=rows-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    


    public static void main(String args[]) {
        Lecture_06 advancePatterns = new Lecture_06();

        advancePatterns.butterflyPattern();

        System.out.println(); 

        advancePatterns.solidRhombus();

        System.out.println();

        advancePatterns.hollowRhombus();

        System.out.println();
 
        advancePatterns.numberPyramid();

        System.out.println();

        advancePatterns.palindromicPattern();

        System.out.println();

        advancePatterns.diamondPattern();

        System.out.println();

        advancePatterns.hollowButterfly();

        System.out.println();

        advancePatterns.pascalsTriangle();

        System.out.println();

        advancePatterns.invertedHalfPyramid();

        System.out.println();

        advancePatterns.halfPyramid();
        
    }
}