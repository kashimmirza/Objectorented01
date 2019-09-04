package Geometricob;


interface Colorable{
	public abstract void howtocolor();
}
abstract  class Problem1 implements Colorable {
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
	   public abstract double getarea();
	   public abstract double getperimeters();
	   public abstract  void howtocolor();
}
	   
	   
	   
	   public class Problem05  extends Problem1 implements Colorable{
	   	     private double length;
	   	      public Problem05(String color,boolean filled,double length ) {
	   	    	  super(color,filled);
	   	    	  this.length=length;
	   	      }
	   	     /* public Problem05(double rad) {
	   	    	  this.rad=rad;
	   	      }*/
	   	      public void howtocolor() {
	   	    	  System.out.println("colors all four sides");
	   	      }
	   	      public double getperimeters() {
	   	    	   return 2*(this.length+this.length);
	   	      }
	   	      public double getarea() {
	   	    	  return this.length*this.length;
	   	      }
	   	      
	   }
	       
	   
	   class test{
	        public static  void main(String[]args) {
	       	   Problem1[] t1= {new Problem05("red",true,3.5),new Problem05("blue",true,3.5),new Problem05("while",true,3.5),new Problem05("red",false,3.5),new Problem05("red",false,3.5)};
	       	    for(int i=0;i<t1.length;i++) {
	       	    	System.out.println(t1[i].getarea());
	       	    	
	       	     if(t1[i] instanceof Colorable ) {
	       	    	 t1[i].howtocolor();
	       	     }
	       	    }
	       	    
	       	    
	       	   
	       	 
	       	 
	       	 
	        }
	       	
	       	
	       }



	  


