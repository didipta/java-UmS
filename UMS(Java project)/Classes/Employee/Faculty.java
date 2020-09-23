package Classes.Employee;
import java.lang.*;
import Classes.Person.*;
import Classes.Student.*;
import Classes.Employee.*;
public class Faculty extends Employee
{
	
 
   //constructor is empty
   public Faculty()
     {
		 
	    //No_retrunType may or may not have parameter
	
     }
  

   
	//information
	public void ShowInfo()
	{
		
		System.out.println ("Type Of person :" +gettypeofperson());
		System.out.println("Faculty ID:"+getId());
		System.out.println("Faculty Name:"+getNAME());
		System.out.println ("Department : "+getWorkfield());
		super.ShowInfo();
		 
	
	}
	
}