// DOWNWARD TRIANGLE STAR PATTERN PROGRAM IN JAVA
import java.util.Scanner;

public class java5

{

    public static void main(String[] args)

    {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows: "); //to take input from user

    int rows = sc.nextInt();

    for (int i= rows-1; i>=0 ; i--)

    {

    for (int j=0; j<=i; j++)

    {

    System.out.print("*" + " ");

    }

    System.out.println();

    }

    sc.close();

    }

    }


//     OUTPUT:

//     PS E:\Felix-It\java> javac java5.java
// PS E:\Felix-It\java> java java5      
// Enter the number of rows: 
// 6
// * * * * * * 
// * * * * *
// * * * *
// * * *
// * *
// *