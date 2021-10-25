// PASCAL’S TRIANGLE PATTERN PROGRAMS IN JAVA


public class java6
{            

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            int number = 1;

            System.out.printf("%" + (n - i) * 2 + "s", "");

            for (int j = 0; j <= i; j++) {

                System.out.printf("%4d", number);

                number = number * (i - j) / (j + 1);

            }

            System.out.println();

        }

    }

}

// OUTPUT:
// PS E:\Felix-It\java> javac java6.java
// PS E:\Felix-It\java> java java6      
//              1
//            1   1
//          1   2   1
//        1   3   3   1
//      1   4   6   4   1