
public class Testcourseandstudent {
	public static void main(String[]arg) {
		Studenttt t1=new Studenttt(1811949642,2.60) ;
		Studenttt t2=new Studenttt(1811949237,3.5);
			
	    Cours1 c1= new Cours1("cse115","programming",4);
	    Cours1 c2=new Cours1("cse215", "data",4);
	     t1.addcourse(c1);
	     
	     
	     System.out.println(t1.getcount());
	     
	     
	     }
		
	}


