class EmployeeCount
{
   private int numOfEmployees = 0;
   public void setNoOfEmployees (int count)
   {
       numOfEmployees = count;
   }
   public double getNoOfEmployees () 
   {
       return numOfEmployees;
   }
}
public class EncapsulationExample
{
   public static void main(String args[])
   {
      EmployeeCount obj = new EmployeeCount ();
      obj.setNoOfEmployees(5613);
      System.out.println("No Of Employees: "+(int)obj.getNoOfEmployees());
    }
}

// OUTPUT:
// PS E:\Felix-It\java> javac EncapsulationExample.java
// PS E:\Felix-It\java> java EncapsulationExample      
// No Of Employees: 5613
// PS E:\Felix-It\java> 