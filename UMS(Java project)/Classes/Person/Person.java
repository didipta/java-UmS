package Classes.Person;
import java.lang.*;
public class Person 
{   

     //access modifier datatype variable_name
	//protected datatype
	protected String name;
   protected String id;
   protected String typeofperson;
   //constructor is empty
   public Person()
     {
		 
	    //No_retrunType may or may not have parameter
	
     }
   //setter methods to access
	//access_modifier returnType method_name (datatype parameter )

   public void setName(String name)
	{
		this.name=name;
	}
	//getter methods to access
	
	//Getter method for getting values from instance variable
	
	public String getNAME()
	{
		
		return name;
	
	}
	
	public void setId(String id)
	{
		this.id=id;
	}
	
	//getter methods to access
	
	//Getter method for getting values from instance variable
	
	public String getId()
	{
		
		return id;
	
	}
	
	public void settypeofperson(String typeofperson)
	{
		this.typeofperson=typeofperson;
	}
	
	//getter methods to access
	
	//Getter method for getting values from instance variable
	
	public String gettypeofperson()
	{
		
		return typeofperson;
	
	}
	//information
	public void ShowInfo()
	{
		System.out.println ("      ");
	}
}