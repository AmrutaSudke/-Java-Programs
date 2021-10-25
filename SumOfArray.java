class SumOfArray{
    public static void main(String args[]){
       int[] array = {10, 20, 30, 40, 50, 10};
       int sum = 0;
       //Advanced for loop
       for( int num : array) {
           sum = sum+num;
       }
       System.out.println("Sum of array elements is:"+sum);
    }
 }

//  OUTPUT:
//  PS E:\Felix-It\java> javac SumOfArray.java
// PS E:\Felix-It\java> java SumOfArray      
// Sum of array elements is:160