package Classes.Employee;
import java.lang.*;
import Classes.Person.*;
import Classes.Student.*;
import Classes.Employee.*;
public class Officers  extends Employee
{
	
 
   //constructor is empty
   public Officers()
     {
		 
	    //No_retrunType may or may not have parameter
	
     }

  
	//information
	public void ShowInfo()
	{
		System.out.println ("Type Of person :" +gettypeofperson());
		System.out.println ("Officers Id : "+getId());
		System.out.println ("Officers Name : "+getNAME());
		System.out.println ("Working Field : "+getWorkfield());
		super.ShowInfo();
	}
	
}