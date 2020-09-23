package Classes.Student;
import java.lang.*;
import Classes.Person.*;
import Classes.Student.*;
public class Student extends Person
{
	//access modifier datatype variable_name
	//protected datatype
	
	protected double cgpa;
	protected int completcourse;
    Course listofcourse[]=new Course[1000];
	
 
   //constructor is empty
   public Student()
     {
		 
	    //No_retrunType may or may not have parameter
	
     }
   //setter methods to access
	//access_modifier returnType method_name (datatype parameter )

 
	
	public void setCgpa(double cgpa)
	{
		this.cgpa=cgpa;
	}
	public void setCompletCourse(int completcourse)
	{
		this.completcourse=completcourse;
	}
	//getter methods to access
	
	//Getter method for getting values from instance variable
	
	public double getCgpa()
	{
		return cgpa;
	}
	public int getCompletCourse()
	{
		return completcourse;
	}
	//Dopp the course
	public void DropingCourse(Course c )
	{
		
		int flag =0;
		for(int i=0; i<listofcourse.length; i++)
		{
			if(listofcourse[i] == c)
			{
			   listofcourse[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag==1){System.out.println("Successfully remove  details");}
		else{System.out.println("CanNot Remove");}
	}
	
	//Show all course
	public void showAllCourse()
	{
		for(int i=0; i<listofcourse.length; i++)
		{
			if(listofcourse[i] != null)
			{
				System.out.println("          ");
				listofcourse[i].ShowCourseInfo();
				System.out.println();
			}
		}
	}
	//Checking time
	public boolean checktime(String time)
	{
		for(int i=0; i<listofcourse.length; i++)
		{
			if(listofcourse[i] != null)
			{
			if(listofcourse[i].getDayTime().equals(time))
			{
				return false;
			}
				}
		}
		return true;
	}
	//subject name Checking
	public boolean checkSname(String Cname)
	{
		for(int i=0; i<listofcourse.length; i++)
		{
			if(listofcourse[i] != null)
			{
			if(listofcourse[i].getCourseName().equals(Cname))
			{
				return false;
			}
				}
		}
		return true;
	}
	//Searching course
	public Course getCourses(String cname)
	{
		Course c = null;
        
		for(int i = 0; i < listofcourse.length; i++)
		{
			if(listofcourse[i] != null)
			{
				
			  if(listofcourse[i].getCourseName().equals(cname))
				{
					c = listofcourse[i];
					
					break;
				}
				}
				 
		
		}
		return c;
	}
	//Adding course
	public void AddingCourse(Course c , String time,String Sname)
	{
		boolean cheekSname = checkSname(Sname);
		int flag = 0;
		if(!cheekSname)
		{
			System.out.println("This subject already inserted");
		}
		else
		{
		boolean cheekTime = checktime(time);
		if(!cheekTime)
		{
			System.out.println("Time Clash ");
		}
		else
		{
			for(int i=0; i<listofcourse.length; i++)
		{
			if(listofcourse[i] == null)
			{
				listofcourse[i] = c;
				flag = 1;
				break;
			}
		}
		}
			
		if(flag == 1){System.out.println("Successfully Inserte the details");}
		else {System.out.println("Can Not Insert");}
	}
	}
	
	//Show all information
	public void ShowInfo()
	{
		super.ShowInfo();
		System.out.println ("Student Id : "+getId());
		System.out.println ("Student Name : "+getNAME());
		System.out.println ("Student CGPA: "+getCgpa());
		System.out.println ("complet course: "+getCompletCourse());
		showAllCourse();
	}
	
}