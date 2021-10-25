import java.util.Scanner;

public class JavaExample2 {
    public static void main(String args[])
    {
    	/* This program assumes that the student has 6 subjects,
    	 * thats why I have created the array of size 6. You can
    	 * change this as per the requirement.
    	 */
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}

// OUTPUT:
// PS E:\Felix-It\java> javac JavaExample2.java
// PS E:\Felix-It\java> java JavaExample2      
// Enter Marks of Subject1:78
// Enter Marks of Subject2:45
// Enter Marks of Subject3:98
// Enter Marks of Subject4:88
// Enter Marks of Subject5:89
// Enter Marks of Subject6:66
// The student Grade is: B