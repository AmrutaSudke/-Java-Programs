import java.util.Scanner;

class AreaOfEquilateralTriangle 
{
   public static void main(String args[]) 
    {   
       
          Scanner s= new Scanner(System.in);
          System.out.println("Enter the side of the Triangle:");
          double a= s.nextDouble();
          double  area=(Math.sqrt(3)/4)*(a*a);
          System.out.println("Area of Triangle is: " + area);      
     }
}

// OUTPUT:
// PS E:\Felix-It\java> javac AreaOfEquilateralTriangle.java
// PS E:\Felix-It\java> java AreaOfEquilateralTriangle      
// Enter the side of the Triangle:
// 34
// Area of Triangle is: 500.5626833874055