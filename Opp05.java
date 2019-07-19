
public class Opp05 {
	 private double radius;
  private int s;
  private static int ob=0;
  public Opp05() {
	  ob++;
	  
	  
  }
 public Opp05(double radius,int s) {
	 
	 this.radius=radius;
	 this.s=s;
	 ob++;
	 
 }
 public static int  getob() {
	 
	 return ob++;
 }
 public void setvalue(double  rad) {
	   radius= rad>=0?rad:0;
	   
	 
	 
 }
 public void setvalue1(int k) {
	   s=k;
 }
 public int getvalue1() {
	 ob++;
	 
	 return s;
 }
 public double  getarea() {
	 return Math.PI*radius*radius;
	 
	 
	 
	 
	 
 }
 public static void main(String[]arg) {
	 Opp05 t=new Opp05(5.5, 3);
	  System.out.println(t.radius);
	  t.setvalue(10);
	  //t.sevlue(10);
	
	  System.out.println(t.getarea());
	  t.setvalue1(100);
	  System.out.println(Opp05.getob());
		
	  System.out.println(t.getvalue1());
	 
 }

}
