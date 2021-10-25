
import java.util .*;
 
import java.text.*;
 
class JavaProgram5
 
{
 
public static void main(String arg[]) throws ParseException
 
{
 
DateFormat dateFormat=new
 
SimpleDateFormat("dd/MM/yyyy");
 
Date date=dateFormat.parse("5/10/2009");
 
System.out.println(date);
 
}
 
}


// OUTPUT:
// PS E:\Felix-It\java> javac JavaProgram5.java
// PS E:\Felix-It\java> java JavaProgram5      
// Mon Oct 05 00:00:00 PDT 2009
// PS E:\Felix-It\java> 