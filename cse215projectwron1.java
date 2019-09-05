package cse215project;

public abstract  class Employee  {
 final String firstname;
 final String lastname;
 String socialsecuritynumber;
	public Employee(String firstname,String lastname ,String socialsecurity) {
	  this.firstname=firstname;
	  this.lastname=lastname;
	  this.socialsecuritynumber=socialsecuritynumber;
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

	public String tostring() {
		return String.format("%s %s%nsocialsecurity number: %s", getfirstname(),getlastname(),getsocialsecuritynumber());
	}
	public abstract double earnings();
}
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
class SalariedEmployee extends Employee{
	private double weeklysalary;
	public SalariedEmployee(String firstname,String lastname,String socialsecuritynumber,double weeklysalary) {
		     super(firstname, lastname,socialsecuritynumber);
		      if(weeklysalary<0.0) {
		    	//   throw IllegalArgumentException("weekly salary must be >=0.0");
		    	     this.weeklysalary=weeklysalary;
		      }
		     this.weeklysalary=weeklysalary;
		
	}
	public void setweeklysalary(double weeklysalary) {
		
		if(weeklysalary<=0.0) {
	    	   //throw IllegalArgumentException("weekly salary must be >=0.0");
	    	     this.weeklysalary=weeklysalary;
	      }
	}
		public double getweeklysalary() {
			 return weeklysalary;
		}
		public double earnings() {
			return getweeklysalary();
		}
		public String tostring() {
			return super.tostring()+" "+"weekly salary"+" "+getweeklysalary();
		}
	     
	
	
}
	class HourlyEmployee extends Employee{
		   private double wage;
		   private double hours;
		   
	
	public HourlyEmployee(String firstname, String lastname, String socialsecuritynumber,double wage, double hours) {
		    super(firstname, lastname, socialsecuritynumber);
		      if(wage<0.0)//throw new IllegalArgumentException("hourly wage must be >=0.0");
		     if((hours<0.0)||(hours>168))  // throw new IllegalArgumentException;
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
	public String toString() {
		return String.format("hourly employee: %s%n%s: $, .2f; %s:%.2f",super.tostring(),"hourly wage : ",getwage(),"hourly worked",gethours());
	}
		
	}
	class CommissionEmployee extends Employee{
		
		 private double grosssales;
		 private double commissionRate;
		 public CommissionEmployee(String firstname,String lastname,String socialsecuritynumber,double grosssales,double commissionRate) {
			      super(firstname, lastname,socialsecuritynumber);
			      if(commissionRate<0.0)
			    	 // throw new IllegalArgumentException("grosssales must be>0.0");
			      if(grosssales<0.0)//throw new IllegalArgumentException;
			      this.grosssales=grosssales;
			      this.commissionRate=commissionRate;
		 }
		 public void setgrosssales(double grosssales) {
			 if(grosssales<0.0)//throw new IllegalArgumentException;
		      this.grosssales=grosssales;
		 }
		 public double getgrosssales() {
			 return this.grosssales;
		 }
		 public void setcommissionRate(double commissionRate) {
			 if(commissionRate<0.0||commissionRate>=1.0)
		    	  //throw new IllegalArgumentException("commission rate must be within 0 and 1");
			  this.commissionRate=commissionRate;
			 
		 }
		 public double getcommissionRate() {
			 return commissionRate;
			 
		 }
		 public double earnings() {
			 return getgrosssales()*getcommissionRate();
		 }
		 
			 
			  
		 
		 public String tostring() {
				return super.tostring()+"commission employee"+" "+getcommissionRate() +" " +getgrosssales();
			}

		 
		 
		 
	}
	 class BasepluscommissionEmployee extends CommissionEmployee{
		     private double baseSalary;
		     public BasepluscommissionEmployee(String firstname, String lastname, String socialsecuritynumber,double grosssales,double commissionRate, double basesalary) {
		    	 super(firstname, lastname,socialsecuritynumber,grosssales,commissionRate);
		    	if(basesalary<0.0)
		    		//throw IllegalArgumentException("Base salary must be >=0.0");
		    	      this.baseSalary=baseSalary;
		     }
		     public void setbaseSalary(double baseSalary) {
		    	 if(baseSalary<0.0)//throw IllegalArgumentException("Base salary must be >=0.0");
		    		 
		    	   this.baseSalary=baseSalary;
		     }
		     public double getbasesalary() {
		    	 return this.baseSalary;
		     }
		     public double earnings() {
		    	 return getbasesalary()+super.earnings();
		     }
		     public String tostring() {
		    	 return super.tostring()+" "+"base salary"+getbasesalary();
		     }
	}
	class payrolsystemtest{
		public static void main(String[]args) {
			
		
		
			SalariedEmployee salariedemployee=new SalariedEmployee("John","Smith","111-11-111",800.00);
			HourlyEmployee hourlyemployee=new HourlyEmployee("karen","price","222-11-22",16.752,40);
			CommissionEmployee commissionemployee=new CommissionEmployee("sue","mirza","333-33-333",10.00,.06);
			BasepluscommissionEmployee t1=new BasepluscommissionEmployee("bob","Lewis","444-44-444",5000,.04,300);
			System.out.println("employees proccessed indivually");
			 System.out.println(t1.tostring());
			System.out.printf("%n%s%n: $%,.2f%n%n", salariedemployee,"earnee",salariedemployee.earnings());
			
		System.out.printf("%s%n%s: $%,.2f%n%n",hourlyemployee,"earned",hourlyemployee.earnings());
			System.out.printf("%s%n%s: $%,.2f%n%n",commissionemployee,"earned",commissionemployee.earnings());
			System.out.printf("%s%n%s: $%,.2f%n%n",t1,"earned",t1.earnings());
			 Employee[]employees=new Employee[4];
			 employees[0]=salariedemployee;
			 employees[1]=hourlyemployee;
			 employees[2]=commissionemployee;
			 employees[3]=t1;
			 System.out.println("employees processed polymorphically:%n%n");
			 for(Employee currentemployee:employees) {
				 System.out.println(currentemployee);
				 if( currentemployee instanceof BasepluscommissionEmployee) {
					  BasepluscommissionEmployee employee=(BasepluscommissionEmployee)currentemployee;
					  employee.setbaseSalary(1.10*employee.getbasesalary());
					  System.out.printf("new base salary with 10%% increase is : $%,.2f%n", employee.getbasesalary());
					  
				 }
				 System.out.printf("earned $,.2f%n%n",currentemployee.earnings());
				 
			 }
			 for(int j=0;j<employees.length;j++) {
				 System.out.printf("Employee %d is a %s%n", j,employees[j].getClass().getName());
			 }
			
			
			
		
			
		}
	}

