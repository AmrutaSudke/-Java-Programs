class ComputeElectricityBill 
{ 
        public static void main(String args[]) 
        {   
	int units=280;
 
	double billpay=0;
 
        	if(units<100)
	 {
	      billpay=units*1.20;
	  }
	else if(units<300)
	 {
	   billpay=100*1.20+(units-100)*2;
	 }
	else if(units>300)
	{
	    billpay=100*1.20+200*2+(units-300)*3;
	}
       
	System.out.println("Bill to pay : " + billpay); 
      } 
}

// OUTPUT:
// PS E:\Felix-It\java> javac ComputeElectricityBill.java
// PS E:\Felix-It\java> java ComputeElectricityBill      
// Bill to pay : 480.0
// PS E:\Felix-It\java> 