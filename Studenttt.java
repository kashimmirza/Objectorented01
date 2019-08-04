
public class Studenttt {
	private  int id;
	private double cgpa;
	private Cours1[]enro=new Cours1[5];
	private int  count =0;
	public Studenttt(int id, double cgpa) {
		this.id=id;
		this.cgpa=cgpa;
		
	}
	public void  addcourse(Cours1 s) {
		  enro[count]=s;
		  count++;
		  
		
	}
	public Cours1[] getcourse() {
		return enro;
		
	}
	public int getcount() {
		return count;
	}

}
