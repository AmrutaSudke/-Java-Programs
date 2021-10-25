// Java Program to check if 2 variables
// among the 3 variables are true

import java.util.Scanner;

class java11 {
  public static void main(String[] args) {
    
    // create 3 boolean variables
    boolean first;
    boolean second;
    boolean third;
    boolean result;

    // get boolean input from the user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first boolean value: ");
    first = input.nextBoolean();

    System.out.print("Enter second boolean value: ");
    second = input.nextBoolean();

    System.out.print("Enter third boolean value: ");
    third = input.nextBoolean();

    // check if two are true
    if(first) {

      // if first is true
      // and one of the second and third is true
      // result will be true
      result = second || third;
    }
    else {

      // if first is false
      // both the second and third should be true
      // so result will be true
      result = second && third;
    }

    if(result) {
      System.out.println("Two boolean variables are true.");
    }
    else {
      System.out.println("Two boolean variables are not true.");
    }

    input.close();
  }

}

// OUTPUT:
// PS E:\Felix-It\java> javac java11.java
// PS E:\Felix-It\java> java java11      
// Enter first boolean value: true
// Enter second boolean value: false
// Enter third boolean value: false
// Two boolean variables are not true.
// PS E:\Felix-It\java> 