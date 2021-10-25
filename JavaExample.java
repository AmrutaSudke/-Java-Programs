// Program to Sort an Array in Ascending Order
import java.util.Scanner;
public class JavaExample 
{
    public static void main(String[] args) 
    {
    	int count, temp;
    	
    	//User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        count = scan.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
    }
}

// OUTPUT:
// PS E:\Felix-It\java> javac JavaExample.java
// PS E:\Felix-It\java> java JavaExample      
// Enter number of elements you want in the array: 5
// Enter array elements:
// 45
// 2
// 78
// 5
// 99
// Array Elements in Ascending Order: 2, 5, 45, 78, 99