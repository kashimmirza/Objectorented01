package Geometricob;

public class problem08 extends Exception 
{ 
	
    public problem08()
    { 
      super(); 
    } 
    public problem08 ( String message) 
    {  
      super(message); 
    } 
} 
  class Circle1 
{ 
    private int radius;  
    Circle1(int r) throws problem08
    { 
      setRadius(r); 
    } 
    public void setRadius(int r) throws problem08
    { 
       if(r>=0) 
         radius = r; 
       else 
         throw new  problem08/*InvalidRadiusException*/("Radius Cannot be Negative"); 
     } 
    public void area() 
    { 
     System.out.println("Area of circle is = "+(Math.PI*radius*radius)); 
    } 
} 
  class CustomException 
{ 
    public static void main(String[] args) 
    { 
       try 
       { 
           Circle1 cl = new Circle1(3); 
           cl.area(); 
           Circle1 c2 = new Circle1(-5); 
           c2.area(); 
           Circle1 c3 = new Circle1(2); 
           c3.area(); 
       } 
       catch(problem08 e) 
      { 
           System.out.println(e.getMessage()); 
      } 
   } 
} 


