import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}


// OUTPUT:
// PS E:\Felix-It\java> javac EvenOdd.java
// PS E:\Felix-It\java> java EvenOdd      
// Enter a number: 88
// 88 is even
// PS E:\Felix-It\java> 