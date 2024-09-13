package LectureQuestions;
public class Patterns {
    public static void main(String [] args){
       // pattern1(4);
        //pattern2(5);
        //pattern3(8);
        //square(5, 5);
        //numbers(5);
        //halfPyramidWithFormula(4);

        //rhombus(5);
       // numPattern(5);
       //numRhombus(5);
       bhulbhuliya(4);

        //steps:
        // find the no. of rows
        // find the relation btw row & column in each column
        // print that amount of *


    }
    // *
    // * *
    // * * *
    // * * * *
    // static void pattern1(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }


    // * * * *
    // * * *
    // * * 
    // * 
    static void pattern2(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }




//p3
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * * * *
// * * * * * * *
// * * * * * * * *
// * * * * * * * *
// * * * * * * *
// * * * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
    static void pattern3(int n){
        // for(int i=1;i<=n;i++){
        //     for(int j=i;j>=1;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //or we can just chnage inner loop condition as j<=n-i+1 if i  starts from 1 else j<=n-i
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       

    }

    static void square(int n, int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void numbers(int n){
        for( int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void halfPyramidWithFormula(int n){
        for(int i=1;i<2*n;i++){
            int totalColsInRow=i>n ? 2*n -i:i;
            for(int j=1;j<=totalColsInRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //rhombus using formula

    static void rhombus(int n){
         for(int row=1;row<=2*n;row++){
            //no.of columns
            int totalColsInRow=row>n ? 2*n -row:row;
            //spaces
            int spaces = n-totalColsInRow;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=totalColsInRow;j++){
                System.out.print("* ");
            }
            System.out.println();
         }

    }

    //in case of number patterns always start outer loop from 1
    static void numPattern(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces
            for(int spaces=0;spaces<n-i;spaces++){
                System.out.print("  ");
            }
            //left side inner loop
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            //right side inner loop
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    static void numRhombus(int n){
        //outer loop
        for(int i=1;i<=2*n;i++){
            //col
            int col=i>n ? 2*n -i:i;
            //spaces
            for(int spaces=0;spaces<n-col;spaces++){
                System.out.print("  ");
            }
            //left side inner loop
            for(int j=col;j>=1;j--){
                System.out.print(j+" ");
            }
            //right side inner loop
            for(int j=2;j<=col;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void bhulbhuliya(int n){
        int originalN=n;
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int atEveryIndex=originalN- Math.min(Math.min(i, j), Math.min(n-i, n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
        
    }
    
}
