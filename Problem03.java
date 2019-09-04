package Geometricobject1;
import java.util.*;
public abstract  class Problem1  implements comparable <Problem1>{
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
	   public static Problem1 max( Problem1 o1,Problem1 o2) {
		   if (((Comparable)o1).compareTo(o2) > 0 )
		         return o1;
		    else
		         return o2;
			    
	   }
	  

	public int compareTo(Problem1 o) {
	        if (this.getarea() > o.getarea())
	            return 1;
	        else if (this.getarea() < o.getarea())
	            return -1;
	        else 
	            return 0;
	    }
	class Circle extends Problem1 {
		 private double radius;
		 public Circle() {

	     }
		 public Circle(double radius) {
		
		this.radius=radius;
	       }
		 public Circle (String color,boolean filled,double radius){
			  this.radius=radius;
			  setcolor(color);
			  setfilled(filled);
		 }
		 public double getradius() {
			 return radius;
		 }
		 public void setradius(double radious) {
			 this.radius=radius;
		 }
		 public double getarea() {
			 
			 return 2*Math.PI*radius*radius;
		 }
		 public double getperimeters() {
			 return 2*radius*Math.PI;
		 }
		 
			 
			 
		 }
	class Rectangle extends Problem1{
		 private double Height;
		 private double width;
		 public Rectangle() {
			 
		 }
		 public Rectangle(double Height, double width,String color, boolean filled) {
			  this.Height=Height;
			  this.width=width;
			  setcolor(color);
			  setfilled(filled);
			 
		 }
		
		 
		
		 
	   public double getHeight() {
			 
			 return this.Height;
		 }
	   public void setHeight() {
		this.Height=Height;
	   }
	public double getwidth() {
		 return this.width;
	  }
	   public void setwidth() {
		 
		 this.width=width;
	    }
	   public double getarea() {
		   
		   return this.Height*this.width;
	   }
	   public double getperimeters() {
		   return 2*(this.Height+this.width);
	   }
		
		
		
		
		
	}

	


 





	 


class Problem02test {
public static void main(String[]args) {
	 Problem1 circle1 = new Circle( "Red", true,5.5);
	    Problem1 circle2 = new Circle( "Blue", false,5.5);
	    Problem1 maxCircle = new Circle();
	    Problem1 rect1 = new Rectangle(5.5,6.5,"Blue",true);
	    Problem1 rect2 = new Rectangle(2.5, 2.7, "Blue", false);
	    Problem1 maxrec=new Rectangle();
	    
	    
	    
	    //Rect = new Rectangle(4.5,3.5,"black",true);

	    maxCircle = Problem1.max(circle1, circle2);
	    maxrec = Problem1.max(rect1, rect2);
	    System.out.println(maxrec);
}
}
	  

	

	
	   
		    
	     
		    
	     
		    
	    
	    
	  
	  
	  
	  
	  
	  
	  
	  


