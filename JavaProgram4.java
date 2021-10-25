public class JavaProgram4 {
    //fields (or instance variable)
    String webName;
    int webAge;
 
    // constructor
    JavaProgram4(String name, int age){
       this.webName = name;
       this.webAge = age;
    }
    public static void main(String args[]){
       //Creating objects
       JavaProgram4 obj1 = new JavaProgram4("beginnersbook", 5);
       JavaProgram4 obj2 = new JavaProgram4("google", 18);
 
      //Accessing object data through reference
      System.out.println(obj1.webName+" "+obj1.webAge);
      System.out.println(obj2.webName+" "+obj2.webAge);
    }
 }


//  OUTPUT:
//  PS E:\Felix-It\java> javac JavaProgram4.java
// PS E:\Felix-It\java> java JavaProgram4      
// beginnersbook 5
// google 18
// PS E:\Felix-It\java> 