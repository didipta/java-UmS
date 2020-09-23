package Classes.Student;
import java.lang.*;
import Classes.Student.*;
public class Course extends Student
{
	
	 //access modifier datatype variable_name
	//protected datatype
	protected String coursename;
	protected String daytime;
	protected int credit;
	protected char sec;
	
 
   //constructor is empty
   public Course()
     {
		 
	    //No_retrunType may or may not have parameter
	
     }
   //setter methods to access
	//access_modifier returnType method_name (datatype parameter )

   public void setCourseName(String coursename)
	{
		this.coursename=coursename;
	}
	
	public void setDaytTime(String daytime)
	{
		this.daytime=daytime;
	}
	public void setCredit(int credit)
	{
		this.credit=credit;
	}
	public void setSection(char sec)
	{
		this.sec=sec;
	}
	//getter methods to access
	
	//Getter method for getting values from instance variable
	
	public String getCourseName()
	{
		
		return coursename;
	
	}
	public String getDayTime()
	{
		return daytime; 
	}
	public int getCredit()
	{
	   return credit;
	}
	public char getSection()
	{
		return sec;
	}
	//information
	void ShowCourseInfo()
	{
		System.out.println ("Course Name : "+getCourseName());
		System.out.println ("Course Section : "+getSection());
		System.out.println ("Course Credit : "+getCredit());
		System.out.println ("Course Day & time : "+getDayTime());
	}
	
	
}