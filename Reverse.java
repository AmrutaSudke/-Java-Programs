public class Reverse {
   
        public static void main(String[] args) {
          
          int num = 1234567, reversed = 0;
      
          for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
          }
      
          System.out.println("Reversed Number: " + reversed);
        }
      }


//       OUTPUT:
//       PS E:\Felix-It\java> javac Reverse.java
// PS E:\Felix-It\java> java Reverse      
// Reversed Number: 7654321
