public class SwapNumbers {

    public static void main(String[] args) {

        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}

// OUYPUT:
// PS E:\Felix-It\java> javac SwapNumbers.java
// PS E:\Felix-It\java> java SwapNumbers      
// --Before swap--
// First number = 1.2
// Second number = 2.45
// --After swap--
// First number = 2.45
// Second number = 1.2
// PS E:\Felix-It\java> 