public class CountNumber {
 

        public static void main(String[] args) {
      
          int count = 0, num = 345289;
      
          while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
          }
      
          System.out.println("Number of digits: " + count);
        }
      }
    

// OUTPUT:
// PS E:\Felix-It\java> javac CountNumber.java
// PS E:\Felix-It\java> java CountNumber      
// Number of digits: 6