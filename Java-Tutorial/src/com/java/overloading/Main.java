package com.java.overloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		emp.getDetails();
		
		TeamLead tl=new TeamLead();
		tl.getDetails();
		
		Employee emp1=new TeamLead();
		emp1.getDetails();
		
		Employee emp2=new TeamLead();
		TeamLead t2=(TeamLead) emp2;
		t2.getDetails();
		
		TeamLead tl2=new TeamLead();
		Employee emp3=tl2;
		emp3.getDetails();
		
		/*
		 * Employee emp4=new Employee(); TeamLead tl4=(TeamLead) emp4; tl4.getDetails();
		 */ 
		
		
		Employee emp5=new TeamLead();
		emp5.hello();

	}

}
