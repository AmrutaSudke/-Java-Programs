class DisplayOverloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
public class ExampleOverloading
{
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp('a');
       obj.disp('a',10);
   }
}


// OUTPUT:
// PS E:\Felix-It\java> javac ExampleOverloading.java
// PS E:\Felix-It\java> java ExampleOverloading      
// a
// a 10
// PS E:\Felix-It\java> 