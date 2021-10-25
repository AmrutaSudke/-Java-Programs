import java.util.Scanner;

public class prime {
  

        public static void main(String[] args) {
      
           int num,i = 2;
          boolean flag = false;

          System.out.print("Enter the number : ");

Scanner s = new Scanner(System.in);

num = s.nextInt();
          while (i <= num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
              flag = true;
              break;
            }
      
            ++i;
          }
      
          if (!flag)
            System.out.println(num + " is a prime number.");
          else
            System.out.println(num + " is not a prime number.");
        }
      }

// OUTPUT:
// PS E:\Felix-It\java> javac prime.java
// PS E:\Felix-It\java> java prime      
// 33 is not a prime number.


// PS E:\Felix-It\java> javac prime.java
// PS E:\Felix-It\java> java prime      
// Enter the number : 13
// 13 is a prime number.