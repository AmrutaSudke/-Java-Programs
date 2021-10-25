import java.util.Scanner;
public class JavaExample1 {
    static boolean checkPerfectSquare(double x)  
    { 

	// finding the square root of given number 
	double sq = Math.sqrt(x); 

	/* Math.floor() returns closest integer value, for
	 * example Math.floor of 984.1 is 984, so if the value
	 * of sq is non integer than the below expression would
	 * be non-zero.
	 */
	return ((sq - Math.floor(sq)) == 0); 
    } 
 
    public static void main(String[] args)  
    { 
	System.out.print("Enter any number:");
	Scanner scanner = new Scanner(System.in);
	double num = scanner.nextDouble(); 
	scanner.close();

	if (checkPerfectSquare(num)) 
		System.out.print(num+ " is a perfect square number"); 
	else
		System.out.print(num+ " is not a perfect square number"); 
    }  
}
// OUTPUT:
// PS E:\Felix-It\java> javac JavaExample1.java
// PS E:\Felix-It\java> java JavaExample1      
// Enter any number:36
// 36.0 is a perfect square number