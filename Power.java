public class Power {
    
        public static void main(String[] args) {
      
          int base = 3, exponent = 4;
      
          long result = 1;
      
          while (exponent != 0) {
            result *= base;
            --exponent;
          }
      
          System.out.println("Answer = " + result);
        }
      }

// OUTPUT:
// PS E:\Felix-It\java> javac Power.java  
// PS E:\Felix-It\java> java Power      
// Answer = 81