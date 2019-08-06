package Tt;

public class Club {
	private int clubid;
	 private String clubname;
	 private int yearestablished;
	 private Activity[]t;
	static int count=0;
	int i;
	Club(int clubid,String clubname, int yearestablished){
		
		this.clubid=clubid;
		this.clubname=clubname;
		this.yearestablished=yearestablished;
		t=new Activity[100];
		i=0;
		count++;

	}
	public String tostring() {
		return this.clubname;
	}
	public void addactivity(Activity a) {
		t[i]=a;
		i++;
	}
	public void display() {
		System.out.println(t[i].tostring());
	}

}
 class Activity{
	private  String activityid;
	  private String activityname;
	 private  String activitysponsor;
	 Activity(String activityid, String activityname, String activitysponsor){
		 this.activityid=activityid;
		 
		 
		 
		 
		 
		 
		 
		 
		 this.activityid=activityid;
		 this.activitysponsor=activitysponsor;
	 }
	 public String tostring() {
		 return this.activityid+" "+ this.activityname+" "+this.activitysponsor;
	 }
	
}
 class Main{
	 
	 public static void main(String[]args) {
		 
		 Activity t1=new Activity("123","sk","cococola");
		 Activity t2=new Activity("124","Moon","bkash");
		 Club k1=new Club(123, "cse",2006);
		 Club k2=new Club(124,"EEE",2007);
		 k1.addactivity(t1);
		 k2.addactivity(t2);
		 k1.display();
	 }
 }
