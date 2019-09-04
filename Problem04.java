package Geometricob;
class Circle{
	 private double rad;
	 public Circle(double rad) {
		 
		  this.rad=rad;
	 }
	 public  double getrad() {
		  return this.rad;
	 }
	 public void setrad(double rad) {
		 this.rad=rad;
	 }
	 public double getarea() {
		 return 2*Math.PI*this.rad*this.rad;
	 }
	 public double getperimeters() {
		 return 2*Math.PI*this.rad;
	 }
	 
}


 class Comparablecircle extends Circle implements Comparable<Comparablecircle> {
	  public  Comparablecircle(double rad) {
		    super(rad);
		  
	  }
		   
	   
	 public int compareTo(Comparablecircle o) { 
		  if (getarea() > o.getarea()) 
			  return 1; 
		  else if (getarea() < o.getarea()) 
			  return -1; 
		  else 
       return 0; 
		  
	 
	 } 

}
 class Main{
	 public static void main(String []args) {
		 Comparablecircle t1=new Comparablecircle(5.5);
		 Comparablecircle t2= new Comparablecircle(6.5);
		 System.out.println(t1.compareTo(t2));
		 
		 
	 }
	 
 }
