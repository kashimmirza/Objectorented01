package Geometricobject1;
import java.util.*;
 abstract  class Problem1 {
	   protected String color="white";
	   protected boolean filled;
	   private java.util.Date datecreated;
	   protected  Problem1() {
		   datecreated=new java.util.Date();
		   
	   }
	   protected Problem1(String color,boolean filled) {
		    datecreated =new java.util.Date();
		    this.color=color;
		    this.filled=filled;
	   }
	   public String getcolor() {
		   return color;
		   
	   }
	   public void setcolor(String color) {
		   
		   this.color=color;
	   }
	   public boolean Isfilled() {
		   
		   return filled;
		   
	   }
	   public void setfilled(boolean filled) {
		   this.filled=filled;
		   
	   }
	   public java.util.Date getdatecreated(){
		   return datecreated;
		   
	   }
	   
	   public abstract double getarea() ;
	   public abstract double getperimeters();

	

}
 

class  Problem02 extends Problem1{
	   private double side1;
	   private double side2;
	   private double side3;
	    public Problem02(double side1,double side2,double side3,String color,boolean filled) {
	    	 super(color,filled);
		    	
	    	this.side1=side1;
	    	this.side2=side2;
	    	this.side3=side3;
	    	 
	    	
	    }
	    
	    
	    public double getside1() {
	    	return this.side1;
	    }
	    public void setside1(double side1) {
	    	
	    	 this.side1=side1;
	    }
	    public double getside2() {
	    	return this.side1;
	    }
	    public void setside2(double side2) {
	    	
	    	this.side2=side2;
	    }
	    public double getside3() {
	    	return this.side3;
	    }
       public void setside3(double side3) {
	    	
	    	this.side3=side3;
	    }
        public void setcolor(String color) {
        	this.color=color;
        }
        public String getcolor() {
        	return this.color;
        }
        public boolean isfilled() {
        	return this.filled;
        }
        public void setfilled(boolean filled) {
        	this.filled=filled;
        }
       
       public double getarea() {
    	   
    	   double k=(side1+side2+side3)/2;
    	   return Math.sqrt((k*(k-side1)*(k-side2)*(k-side3)));
       }
       public double getperimeters() {
    	   return (side1+side2+side3);
       }




	 

}
class Problem02test {
public static void main(String[]args) {
	   Scanner input=new Scanner(System.in);
	    System.out.println("enter the three sides:");
	    double side1=input.nextDouble();
	    double side2 = input.nextDouble();
	    double side3= input.nextDouble();
	    System.out.println("enter the color:");
	    
	    String color=input.next();
	    System.out.println("is the traingle tru or false");
	    boolean filled=input.nextBoolean();
	    Problem02 t1=new Problem02(side1,side2,side3,color,filled);
	   
	     
	     System.out.println(t1.getarea());
	     System.out.println(t1.getperimeters());
	     System.out.println(t1.getcolor());
	     System.out.println(t1.isfilled());
	     
		    
	     
		    
	     
		    
	    
	    
	  
	  
	  
	  
	  
	  
	  
	  
}
}
