// SQUARE PATTERN PROGRAMS IN JAVA
import java.io.*; 

public class  java9{ 

    //print hollow rectangle 

    static void print_rectangle(int n, int m) 

    { 

        int i, j; 

        for (i = 1; i <= n; i++) 

        { 

            for (j = 1; j <= m; j++) 

            { 

                if (i == 1 || i == n ||  

                    j == 1 || j == m)             

                    System.out.print("*");             

                else

                    System.out.print(" ");             

            } 

            System.out.println(); 

        } 

    } 

    //Driver program

    public static void main(String args[]) 

    { 

        int rows = 6, columns = 20; 

        print_rectangle(rows, columns); 

    } 

}

// OUTPUT:
// PS E:\Felix-It\java> javac java9.java
// PS E:\Felix-It\java> java java9      
// ********************
// *                  *
// *                  *
// *                  *
// *                  *
// ********************
// PS E:\Felix-It\java> 