// LEFT TRIANGLE STAR PATTERN PROGRAMS IN JAVA
public class java3

{ 

    public static void printStars(int n) 

    { 

        int i, j;  

        for(i=0; i<n; i++) //an outer loop for number of rows(n) 

{ for(j=2*(n-i); j>=0; j--) // an inner loop for spaces 

            {           

                System.out.print(" "); // to print space

            } 

            for(j=0; j<=i; j++) // an inner loop for columns

            {       

                System.out.print("* "); // to print star

            }           

            System.out.println(); // end-line after every row

        } 

    } 

    public static void main(String args[]) 

    { 

        int n = 5; 

        printStars(n); 

    } 

}


// Output
// PS E:\Felix-It\java> javac java3.java
// PS E:\Felix-It\java> java java3      
//            * 
//          * *
//        * * *
//      * * * *
//    * * * * *