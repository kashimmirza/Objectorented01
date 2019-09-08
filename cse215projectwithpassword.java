package cse215project;
import java.util.*;
import java.io.Console;



public abstract  class Employee  {
 final String firstname;
 final String lastname;
  String socialsecuritynumber;
	public Employee(String firstname,String lastname ,String socialsecurity) {
	  this.firstname=firstname;
	  this.lastname=lastname;
	  this.socialsecuritynumber=socialsecurity;
	}
	


	public String getfirstname() {
		return firstname;
	}

	public String getlastname() {
		return lastname;
	}
	public String getsocialsecuritynumber() {
		return socialsecuritynumber;
	}

	/*public String tostring() {
		return String.format("%s %s%nsocialsecurity number: %s", getfirstname(),getlastname(),getsocialsecuritynumber());
	}*/
	public abstract double earnings();
   
/* class IllegalArgumentException extends Exception 
{ 
	
    public  IllegalArgumentException()
    { 
      super(); 
    } 
    public  IllegalArgumentException( String message) 
    {  
      super(message); 
    } 
}*/ 
}
class SalariedEmployee extends Employee{
	private double weeklysalary;
	public SalariedEmployee(String firstname,String lastname,String socialsecuritynumber,double weeklysalary) {
		     super(firstname, lastname,socialsecuritynumber);
		      
		    	//   throw IllegalArgumentException("weekly salary must be >=0.0");
		    	     //this.weeklysalary=weeklysalary;
		      
		     this.weeklysalary=weeklysalary;
		
	}
	public void setweeklysalary(double weeklysalary) {
		
		
	    	   //throw IllegalArgumentException("weekly salary must be >=0.0");
	    	     this.weeklysalary=weeklysalary;
	      
	}
		public double getweeklysalary() {
			 return weeklysalary;
		}
		public double earnings() {
			return getweeklysalary();
		}
		/*public String tostring() {
			return super.tostring()+" "+"weekly salary"+" "+getweeklysalary();
		}*/
	public void  printshow() {
		  System.out.println("the employees in this class are : Salaried employees");
		System.out.println("firstname:"+" "+this.firstname+" \n"+"lastname:"+" "+this.lastname+"\n"+"socialsecuritynumber:"+" "+this.socialsecuritynumber+"\n "+"weeklysalary:"+" "+this.weeklysalary+"\n");
		
	}
		
	}
	     
	
	

	class HourlyEmployee extends Employee{
		   private double wage;
		   private double hours;
		   
	
	public HourlyEmployee(String firstname, String lastname, String socialsecuritynumber,double wage, double hours) {
		    super(firstname, lastname, socialsecuritynumber);
		      //throw new IllegalArgumentException("hourly wage must be >=0.0");
		      // throw new IllegalArgumentException;
		         this.wage =wage;
		         this.hours=hours;
	}
	public void setwage(double wage) {
		
			this.wage=wage;
		
			              //throw new IllegalArgumentException("hourly wage must be >=0.0");
		
	}
	public double getwage() {
		return this.wage;
	}
	public void setHOurs(double hours) {
		if((hours<0.0)||(hours>168))//throw new IllegalArgumentException;
        
        this.hours=hours;
		
	}
	public double gethours() {
		return this.hours;
	}
	public double earnings() {
		if(gethours()<=40.0)
			return getwage()*gethours();
		else
			return 40*getwage()+(gethours()-40)*getwage()*1.5;
	}
	public void printshow() {
		System.out.println("firstname:"+" "+this.firstname+" \n"+"lastname:"+" "+this.lastname+" \n"+"socialsecuritnumber:"+this.socialsecuritynumber+"\n"+"wage:"+" "+this.wage+" \n"+"hours:"+this.hours+"\n");
	}
	
		
	}
	class CommissionEmployee extends Employee{
		
		 private double grosssales;
		 private double commissionRate;
		 public CommissionEmployee(String firstname,String lastname,String socialsecuritynumber,double grosssales,double commissionRate) {
			      super(firstname, lastname,socialsecuritynumber);
			      
			    	 // throw new IllegalArgumentException("grosssales must be>0.0");
			      //throw new IllegalArgumentException;
			      this.grosssales=grosssales;
			      this.commissionRate=commissionRate;
		 }
		 public void setgrosssales(double grosssales) {
			 //if(grosssales<0.0)//throw new IllegalArgumentException;
		      this.grosssales=grosssales;
		 }
		 public double getgrosssales() {
			 return this.grosssales;
		 }
		 public void setcommissionRate(double commissionRate) {
			 //if(commissionRate<0.0||commissionRate>=1.0)
		    	  //throw new IllegalArgumentException("commission rate must be within 0 and 1");
			  this.commissionRate=commissionRate;
			 
		 }
		 public double getcommissionRate() {
			 return commissionRate;
			 
		 }
		 public double earnings() {
			 return getgrosssales()*getcommissionRate();
		 }
		 public void printshow() {
			 System.out.println("The employee in this class are: CommissionEmployee");
			 System.out.println("firstname:"+" "+this.firstname+"\n"+"lastname:"+this.lastname+"\n"+"socialsecuritynumber:"+this.socialsecuritynumber+"\n"+" grossales:"+" "+this.grosssales+"\n "+"commissionrate:"+" "+getcommissionRate()+"\n");
			 
		 }
		 
			 
			  
		 
		/* public String tostring() {
				return super.tostring()+"commission employee"+" "+getcommissionRate() +" " +getgrosssales();
			}*/

		 
		 
		 
	}
	 class BasepluscommissionEmployee extends CommissionEmployee{
		     private double baseSalary;
		     public BasepluscommissionEmployee(String firstname, String lastname, String socialsecuritynumber,double grosssales,double commissionRate, double baseSalary) {
		    	 super(firstname, lastname,socialsecuritynumber,grosssales,commissionRate);
		    	
		    		//throw IllegalArgumentException("Base salary must be >=0.0");
		    	      this.baseSalary=baseSalary;
		     }
		     public void setbaseSalary(double baseSalary) {
		    	 //throw IllegalArgumentException("Base salary must be >=0.0");
		    		 
		    	   this.baseSalary=baseSalary;
		     }
		     public double getbasesalary() {
		    	 return this.baseSalary;
		     }
		     public double earnings() {
		    	 return getbasesalary()+super.earnings();
		     }
		     /*public String tostring() {
		    	 return super.tostring()+" "+"base salary"+getbasesalary();
		     }*/
		     public void printshow() {
		    	 System.out.println("employees in this claas are: BasepluscommissionEmployee");
				 System.out.println("firstname:"+" "+this.firstname+"\n"+"lastname:"+this.lastname+"\n"+"socialsecuritynumber:"+this.socialsecuritynumber+"\n"+" grossales:"+" "+getgrosssales()+"\n "+"commissionrate:"+" "+getcommissionRate()+"\n"+"basesalary:"+getbasesalary()+"\n");
				 
			 }
			 
	}
	class payrolsystemtest{
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter Your password");
		    String s1 = sc.nextLine();
		        //int n = Userpassword.display(s1);
		       while(true){
		    	  // System.out.println("please enter valid password");
		    	   Userpassword.display(s1);
		    	  
		       
		       if(Userpassword.display(s1)==1) {
		    	   
		         
		        
		
		
			 
			 System.out.println("please enter the number  of class you want to enter");
			 Scanner input=new Scanner(System.in);
			 int var=input.nextInt();
			 
			  //int var=classname.compareTo("SalariedEmployee");
			  
				 //SalariedEmployee salariedemployee=new SalariedEmployee(firstname,lastname,Socialsecuritynumber,weeklysalary);
				 //salariedemployee.printshow();
				Employee[]employees=new Employee[4];
			
			  
			  
				 
					
			   
			  
			  
			
			
			
		
		
			//SalariedEmployee salariedemployee=new SalariedEmployee(firstname,lastname,Socialsecuritynumber,weeklysalary);
			//salariedemployee.printshow();
			//Employee[]employees=new Employee[4];
			//employees[0]=salariedemployee;

			SalariedEmployee salariedemployee=new SalariedEmployee("abule","babul","111-11-111",67.90);
			
			HourlyEmployee hourlyemployee=new HourlyEmployee("karen","price","222-11-22",16.752,40);
			CommissionEmployee commissionemployee=new CommissionEmployee("sue","mirza","333-33-333",10.00,.06);
			BasepluscommissionEmployee t1=new BasepluscommissionEmployee("bob","Lewis","444-44-444",5000,.04,300);
			System.out.println("employees proccessed indivually");
			//salariedemploye
			
			 //System.out.println(t1.tostring());
			//System.out.printf("%n%s%n: $%,.2f%", salariedemployee,"earnee",salariedemployee.earnings());
			//System.out.println(hourlyemployee.tostring()+" "+hourlyemployee.
		
			//System.out.printf("%s%n%s: $%,.2f%n%n",hourlyemployee,"earned",hourlyemployee.earnings());
			//System.out.printf("%s%n%s: $%,.2f",commissionemployee,"earned",commissionemployee.earnings());
			//System.out.printf("%s%n%s: $%,.2f%n%n",t1,"earned",t1.earnings());
			// Employee[]employees=new Employee[4];
			employees[0]=salariedemployee;
			 employees[1]=hourlyemployee;
			 employees[2]=commissionemployee;
			 employees[3]=t1;
			 for(int i=0;i<4;i++) {
				 if(var==0) {
					 salariedemployee.printshow();
					 System.out.println("this people earnen: ");
					 System.out.println(salariedemployee.earnings());
					 break;
					 
				 }
				 else if(var==1) {
					 hourlyemployee.printshow();
					 System.out.println("this people earnen: ");
					 System.out.println(hourlyemployee.earnings());
					 break;
				 }
				 else if(var==2) {
					 commissionemployee.printshow();
					 System.out.println("this people earnen: ");
					 System.out.println(commissionemployee.earnings());
					 break;
				 }
				 else if(var==3) {
					 t1.printshow();
					 System.out.println("this people earnen: ");
					 System.out.println(t1.earnings());
					 break;
						 
				 }
			 }
			 System.out.println("************************");
			 System.out.println("employees earned one by one in all type of all classes:\n");
			 for(Employee currentemployee:employees) {
				// System.out.println(currentemployee);
				 if( currentemployee instanceof BasepluscommissionEmployee) {
					  BasepluscommissionEmployee employee=(BasepluscommissionEmployee)currentemployee;
					  employee.setbaseSalary(1.10*employee.getbasesalary());
					  System.out.println("new base salary with 10%% increase is:"+"+"+employee.getbasesalary());
					  
				 }
				 System.out.println(currentemployee.getClass().getName()+"earned $:"+currentemployee.earnings());
				 
			 }
			 for(int j=0;j<employees.length;j++) {
				 System.out.println("Employee is:"+" "+j+" "+employees[j].getClass().getName());
			 }
			 break;
		}
		/*else{
	         System.out.println("invalie password:");
	          break;
	         
	        }*/
			
			
			
		
			
		}
	}
	}
	
