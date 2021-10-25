
class Teacher {
    String designation = "Teacher";
    String college = "Beginnersbook";
    void does(){
     System.out.println("Teaching");
    }
 }
 public class MathTeacher extends Teacher{
    String mainSubject = "Maths";
    public static void main(String args[]){
       MathTeacher obj = new MathTeacher();
       System.out.println(obj.college);
       System.out.println(obj.designation);
       System.out.println(obj.mainSubject);
       obj.does();
    }
 }

//  OUTPUT:
//  PS E:\Felix-It\java> javac MathTeacher.java
// PS E:\Felix-It\java> java MathTeacher      
// Beginnersbook
// Teacher
// Maths
// Teaching
// PS E:\Felix-It\java> 