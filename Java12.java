import java.util.ArrayList;
import java.util.List;

class Java12 {
  public static void main(String[] args) {

    // create first list
    List<Integer> prime = new ArrayList<>();
    prime.add(2);
    prime.add(3);
    prime.add(5);
    System.out.println("First List: " + prime);

    // create second list
    List<Integer> even = new ArrayList<>();
    even.add(4);
    even.add(6);
    System.out.println("Second List: " + even);

    // create merged list
    List<Integer> numbers = new ArrayList<>();
    numbers.addAll(prime);
    numbers.addAll(even);

    System.out.println("Merged List: " + numbers);

  }
}


// OUTPUT:
// PS E:\Felix-It\java> javac Java12.java
// PS E:\Felix-It\java> java Java12
// First List: [2, 3, 5]
// Second List: [4, 6]
// Merged List: [2, 3, 5, 4, 6]
// PS E:\Felix-It\java> 