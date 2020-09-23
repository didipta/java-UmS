package Classes.Employee;
import java.lang.*;
import Classes.Person.*;
import Classes.Student.*;
public class Employee extends Person
{
	
	 //access modifier datatype variable_name
	//protected datatype
	protected String workfield;
	protected double salary;
	
 
   //constructor is empty
   public Employee()
     {
		 
	    //No_retrunType may or may not have parameter
	
     }
   //setter methods to access
	//access_modifier returnType method_name (datatype parameter )

   public void setWorkField(String workfield)
	{
		this.workfield=workfield;
	}
	
	//access_modifier returnType method_name (datatype parameter )
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	//getter methods to access
	
	//Getter method for getting values from instance variable
	
	public String getWorkfield()
	{
		
		return workfield;
	
	}
	
	//Getter method for getting values from instance variable
	public double getSalary()
	{
		return salary;
	}
	//information
	public void ShowInfo()
	{
		
		System.out.println ("Salary : "+getSalary()+"TK");
	}
	
	
	
	
	
	
	
	
}