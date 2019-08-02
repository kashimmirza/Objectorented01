import java.util.Scanner;
public class Subclass1{
   Parent[]p;

	Scanner var = new Scanner(System.in);
	
	Subclass1() {
		p = new Parent[5];
		for(int i=0;i<5;i++) {
			
			String s ;
			s = var.next();
			p[i] = new Parent(s);
		}
	}
	
	public void printf() {
		for(int i=0;i<5;i++) {
			p[i].print();
		}
	}
	
	
	
	public  void Printy() {
		 System.out.println("Subclass1");
	 }

}
