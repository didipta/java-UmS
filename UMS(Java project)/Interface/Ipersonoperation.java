
package Interface;
import Classes.Person.*;
import Classes.Employee.*;
import Classes.Student.*;
import Classes.University.*;
public interface Ipersonoperation
{
	public abstract void Insertperson(Employee E,String id);
	 void removeperson(Employee E);
	 void showALLperson(String type);
	 Employee getPerson(String id);
	
}