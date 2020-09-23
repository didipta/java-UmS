package Classes.University;
import java.lang.*;
import Classes.Person.*;
import Classes.Student.*;
import Classes.Employee.*;
import Interface.*;
import ForCreateFile.*;

public class University implements Ipersonoperation, Istudentoperation
{
	
	Employee listofemployee[]=new Employee[10000];
	Student listofstudent[]=new Student[10000];
	 public University()
     {
		 
	    //No_retrunType may or may not have parameter
	
     }
	 //Insert student details
	public void Insertperson(Employee E , String id)
	{
		boolean cheekid = checkEId(id);
		int flag=0;
		if(!cheekid)
		{
			System.out.println("This id already insert");
		}
		else
		{
			for(int i=0; i<listofemployee.length; i++)
		{
			if(listofemployee[i] == null)
			{
				listofemployee[i] = E;
				flag = 1;
				break;
			}
		}
	
		
		
		
		if(flag == 1){System.out.println("Successfully Inserte the details");}
		else {System.out.println("Can Not Insert the ");}
		}
	}
	//remove student details
	public void removeperson(Employee E)
	{
	
		int flag =0;
		for(int i=0; i<listofemployee.length; i++)
		{
			if(listofemployee[i] == E)
			{
			   listofemployee[i] = null;
				flag = 1;
				break;
			}
	
		}
		if(flag==1){System.out.println("remove person details");}
		else{System.out.println("Sorry /n please try again ");}
	}
	//show student details
	public void showALLperson(String type)
	{
		for(int i=0; i<listofemployee.length; i++)
		{
			
			if(listofemployee[i] != null)
			{
				
		     if(listofemployee[i].gettypeofperson().equals(type))
			{
				System.out.println("---------------");
				listofemployee[i].ShowInfo();
				
				System.out.println();
				
			}
			}
		}
	}
	//get Student Id
	public Employee getPerson(String id)
	{
		Employee E= null;

		for(int i = 0; i < listofemployee.length; i++)
		{
			
			if(listofemployee[i] != null)
			{
				if(listofemployee[i].getId().equals(id))
				{
				
				    E = listofemployee[i];
					
					break;
				}
			}
		}
		
		return E;
	}
	
	
	
	public void Insertstudent(Student s,String id)
	{
		boolean cheekid = checkSId(id);
		int flag=0;

		if(!cheekid)
		{
			System.out.println("This Student id already insert");
		}
		else
		{
		for(int i=0; i<listofstudent.length; i++)
		{
			if(listofstudent[i] == null)
			{
				listofstudent[i] = s;
				flag = 1;
				break;
			}
		}
	
		
		if(flag == 1){System.out.println("Successfully Inserte the Student details");}
		else {System.out.println("Can Not Insert the ");}
	}
	}
	//remove student details
	public void removestudent(Student s)
	{
	
		int flag =0;
		for(int i=0; i<listofstudent.length; i++)
		{
			if(listofstudent[i] == s)
			{
			   listofstudent[i] = null;
				flag = 1;
				break;
			}
	
		}
		if(flag==1){System.out.println("remove person details");}
		else{System.out.println("Sorry /n please try again ");}
	}
	//show student details
	public void showALLstudent()
	{
		for(int i=0; i<listofstudent.length; i++)
		{
			if(listofstudent[i] != null)
			{
				System.out.println("---------------");
				listofstudent[i].ShowInfo();
				
				System.out.println();
			}
		}
	}
	//get Student Id
	public Student getStudent(String sid)
	{
		Student s = null;

		for(int i = 0; i < listofstudent.length; i++)
		{
			
			if(listofstudent[i] != null)
			{
				if(listofstudent[i].getId().equals(sid))
				{
				
				    s = listofstudent[i];
					
					break;
				}
			}
		}
		
		return s;
	}
	//Student id Checking
	public boolean checkSId(String Id)
	{
		for(int i=0; i<listofstudent.length; i++)
		{
			if(listofstudent[i] != null)
			{
			if(listofstudent[i].getId().equals(Id))
			{
				return false;
			}
				}
		}
		return true;
	}
	//Employee id Checking
	public boolean checkEId(String Id)
	{
		for(int i=0; i<listofemployee.length; i++)
		{
			if(listofemployee[i] != null)
			{
			if(listofemployee[i].getId().equals(Id))
			{
				return false;
			}
				}
		}
		return true;
	}
}