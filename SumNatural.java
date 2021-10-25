public class SumNatural {

    public static void main(String[] args) {

        int num = 100, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}

// OUTPUT:
// PS E:\Felix-It\java> javac SumNatural.java
// PS E:\Felix-It\java> java SumNatural      
// Sum = 5050