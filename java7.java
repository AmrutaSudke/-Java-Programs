// DIAMOND PATTERN PROGRAM IN JAVA

import java.util.Scanner;

public class java7 {


public static void main(String args[])

{

int n, i, j, space = 1;

System.out.print("Enter the number of rows: ");

Scanner s = new Scanner(System.in);

n = s.nextInt();

space = n - 1;

for (j = 1; j<= n; j++)

{

for (i = 1; i<= space; i++)

{

System.out.print(" ");

}

space--;

for (i = 1; i <= 2 * j - 1; i++)

{

System.out.print("*");

}

System.out.println("");

}

space = 1;

for (j = 1; j<= n - 1; j++)

{

for (i = 1; i<= space; i++)

{

System.out.print(" ");

}

space++;

for (i = 1; i<= 2 * (n - j) - 1; i++)

{

System.out.print("*");

}

System.out.println("");

}

}

}

// OUTPUT:
// PS E:\Felix-It\java> javac java7.java
// PS E:\Felix-It\java> java java7      
// Enter the number of rows: 5
//     *  
//    *** 
//   *****
//  ******* 
// *********
//  ******* 
//   *****  
//    ***   
//     *    
// PS E:\Felix-It\java> 

