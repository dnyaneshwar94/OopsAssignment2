package com.yash.Task9;

public class Employee implements Cloneable
{
	int eid;
	String name;
	double salary;
	String department;

	public Employee(int eid, String name, double salary, String department) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee e1=new Employee(111, "Ajay", 30000, "QA");
		
		
	System.out.println("Using Employee e1 Object.. ");
	System.out.println("EID ="+e1.eid);
	System.out.println("EName ="+e1.name);
	System.out.println("Esalary ="+e1.eid);
	System.out.println("Emp dept ="+ e1.department);

	Employee e2=(Employee) e1.clone();

	System.out.println("After clone Employee e2 Object ");
	System.out.println("EID ="+e2.eid);
	System.out.println("EName ="+e2.name);
	System.out.println("Esalary ="+e2.eid);
	System.out.println("Emp dept ="+ e2.department);

	System.out.println("e1 hashcode ="+e1.hashCode());
	System.out.println("e2 hashcode ="+e2.hashCode());





	System.out.println(e1==e2);
		
		
	}

}
