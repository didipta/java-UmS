package Interface;
import Classes.Person.*;
import Classes.Employee.*;
import Classes.Student.*;
import Classes.University.*;
public interface Istudentoperation
{
	public abstract void Insertstudent(Student s,String Id);
	 void removestudent(Student s);
	 void showALLstudent();
     Student getStudent(String sid);
	  
	
}