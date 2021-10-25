 public class StringToCharDemo {
    



   public static void main(String args[])
   {
      // Using charAt() method
      String str = "Hello";
      for(int i=0; i<str.length();i++){
        char ch = str.charAt(i);
        System.out.println("Character at "+i+" Position: "+ch);
      } 
   }
}

// OUTPUT:
// PS E:\Felix-It\java> javac StringToCharDemo.java
// PS E:\Felix-It\java> java StringToCharDemo      
// Character at 0 Position: H
// Character at 1 Position: e
// Character at 2 Position: l
// Character at 3 Position: l
// Character at 4 Position: o