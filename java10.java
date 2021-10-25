// PATTERN PROGRAMS IN JAVA
import java.util.Scanner;

public class java10

{            

    public static void main(String[] args) 

    {

        Scanner sc = new Scanner(System.in); // rows value from the user    

        System.out.println("Enter the number of rows: ");    

        int rows = sc.nextInt();         

        for (int i = 1; i <= rows; i++) 

        {

            for (int j = 1; j <= i; j++)

            {

                System.out.print(i+" ");

            }

            System.out.println();

        }         

        sc.close();

    }

}


// OUTPUT:

// PS E:\Felix-It\java> javac java10.java
// PS E:\Felix-It\java> java java10      
// Enter the number of rows: 
// 5
// 1 
// 2 2 
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// PS E:\Felix-It\java> 