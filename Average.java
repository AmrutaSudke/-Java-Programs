public class Average {

    public static void main(String[] args) {
        double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0.0;

        for (double num: numArray) {
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}


// OUTPUT:
// PS E:\Felix-It\java> javac Average.java
// PS E:\Felix-It\java> java Average      
// The average is: 27.69