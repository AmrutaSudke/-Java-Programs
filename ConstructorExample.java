public class ConstructorExample {

    int age;
    String name;
     
    //Default constructor
    ConstructorExample(){
     this.name="Chaitanya";
     this.age=30;
    }
     
    //Parameterized constructor
    ConstructorExample(String n,int a){
     this.name=n;
     this.age=a;
    }
    public static void main(String args[]){
     ConstructorExample obj1 = new ConstructorExample();
     ConstructorExample obj2 = 
                new ConstructorExample("Steve", 56);
     System.out.println(obj1.name+" "+obj1.age);
     System.out.println(obj2.name+" "+obj2.age);
    }
 }

//  OUTPUT:
//  PS E:\Felix-It\java> javac ConstructorExample.java
// PS E:\Felix-It\java> java ConstructorExample      
// Chaitanya 30
// Steve 56
// PS E:\Felix-It\java> 