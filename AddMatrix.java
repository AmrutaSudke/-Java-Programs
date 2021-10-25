import java.util.Scanner;

class AddMatrix
{
public static void main(String args[])
{
int row, col,i,j;
Scanner in = new Scanner(System.in);
 
System.out.println("Enter the number of rows");
row = in.nextInt();
 
System.out.println("Enter the number columns");
col = in.nextInt();
 
int mat1[][] = new int[row][col];
int mat2[][] = new int[row][col];
int res[][] = new int[row][col];
 
System.out.println("Enter the elements of matrix1");
 
for ( i= 0 ; i < row ; i++ )
{ 
 
for ( j= 0 ; j < col ;j++ )
mat1[i][j] = in.nextInt();
 
System.out.println();
}
System.out.println("Enter the elements of matrix2");
 
for ( i= 0 ; i < row ; i++ )
{
 
for ( j= 0 ; j < col ;j++ )
mat2[i][j] = in.nextInt();
 
System.out.println();
}
 
for ( i= 0 ; i < row ; i++ )
for ( j= 0 ; j < col ;j++ )
res[i][j] = mat1[i][j] + mat2[i][j] ; 
 
System.out.println("Sum of matrices:-");
 
for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < col ;j++ )
System.out.print(res[i][j]+"\t");
 
System.out.println();
}
 
}
}

// OUTPUT:
// PS E:\Felix-It\java> javac AddMatrix.java
// PS E:\Felix-It\java> java AddMatrix      
// Enter the number of rows
// 2
// Enter the number columns
// 2
// Enter the elements of matrix1
// 1 2

// 1 2

// Enter the elements of matrix2
// 2 3

// 3 5

// Sum of matrices:-
// 3       5
// 4       7
// PS E:\Felix-It\java> 