package com.limitationOfCloning;

//copy constructor is the modern java solution for cloning(traditional)
//it provide both shallow and deep cloning easily
//This class perform Shallow Cloning
class Employee
{
	int id;
	String name;
	
	public Employee(int id,String name) //normal constructor
	{
		this.id=id;
		this.name=name;
	}
	
	public Employee(Employee other) //copy constructor (takes another object of the same class as an argument and copy its fields
	{
		this.id=other.id;
		this.name=other.name;
	}
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
}

public class CopyConstructorShallowDemo {

	public static void main(String[] args) {
		
		Employee e=new Employee(101,"Nipendra");
		e.display();
		Employee c=new Employee(e); //shallow cloning
		c.display();
	}

}
