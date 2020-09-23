import Classes.Person.*;
import Classes.Employee.*;
import Classes.Student.*;
import Classes.University.*;
import ForCreateFile.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Start
{
	public static void main(String args[])
	{
		System.out.println("---------------------------- University Management------------------------------");
		System.out.println("WELCOME ");
		
		Scanner input = new Scanner(System.in);
		
		ForCreateFile file = new ForCreateFile();
		
		Person P = new Person();
		University U=new University();
		
		boolean choice = true;
		int faOption;
		int SOption;
		int OOption;
		do
		{
			
			System.out.println("----------------------------------------------");
			System.out.println("PLEASE SELECT A OPTION \n THE OPTIONS ARE : \n");
			System.out.println("1) Faculty Management \n2) Student Management \n3) Officer Management  \n4) EXIT");
			
			System.out.print("\nPLEASE ENTER A OPTION : ");
			int option = input.nextInt();
			System.out.println("----------------------------------------------");
			
			switch(option)
			{
				//Faculty
				case 1:
				
					
				do{
				System.out.println("----------------------------------------------");
					System.out.println("OPTIONS FOR FACULTY MANAGEMENT : \n");
					System.out.println("\n1) Insert New Faculty \n2) Remove Existing Faculty \n3) Show All Faculty \n4) Going Back");

					
					System.out.print("\nPLEASE ENTER A OPTION : ");
					faOption = input.nextInt();
					System.out.println("----------------------------------------------");
					
					switch(faOption)
					{
						
						case 1:
						 Faculty F=new Faculty();
						boolean M = true;
		
		                    while(M)
		                      {
								 
						try{
							
						System.out.println("---------Insert new Faculty-----------------");
						input = new Scanner(System.in);
						F.settypeofperson("Faculty");
						System.out.print("PLEASE ENTER Faculty NAME : ");
	                    String Fname = input.next();	
                        F.setName(Fname);
						 
                        System.out.print("PLEASE ENTER  Faculty Id: ");
	                    String Fid = input.next();								
					    F.setId(Fid);
						System.out.print("PLEASE ENTER Faculty Department: ");
	                    String WF = input.next();		
				        F.setWorkField(WF);
						 System.out.print("PLEASE ENTER Faculty Salary: ");
	                     double FS = input.nextDouble();
	                     F.setSalary(FS);
						 String Sd=Double.toString(FS) ;
						file.writeInFile("\nINSERTED"+"\nFaculty name:"+Fname + "\nFaculty ID:" + Fid +"\nFaculty Working Fild:"+WF+"\nFaculty Salary:"+ Sd + "TK"+"\n______________","History/Faculty.txt");						
						M=false;
						 U.Insertperson(F,Fid);//Faculty information insert
						 System.out.println("----------------------------------------------");
				          }
		                   catch(InputMismatchException e){
			                      System.out.println("Your input is not proper \n Please try again");
		                  }
						  
							  }
							  
							  
						 break;
						 
						 
						 
						 
						 case 2:
						 boolean Y = true;
		
		                    while(Y)
		                      {
						 try{
							 input = new Scanner(System.in);
						  System.out.println("---------Remove Faculty-----------------");
						   System.out.print("PLEASE ENTER Faculty ID : ");
	                       String FI = input.next();	
						   U.removeperson(U.getPerson(FI));//deleted Faculty information
						   file.writeInFile("\nREMOVED"+ "\nFaculty ID:" + FI + "\n______________" ,"History/Faculty.txt");
						   Y=false;
						   System.out.println("---------------------------------------------");
						 }
						 catch(NullPointerException npe)
		                    {
			                   System.out.println("This id is not insert the Faculty list\nPlease try again ");
		                      }
							  
							  }
				          break;
						  
						  
						  
						  
						  case 3:
				            System.out.println("----------------------------------------------");	
							System.out.println("LIST OF ALL FACULTY : \n");
							U.showALLperson("Faculty");//Show all Faculty
							
							System.out.println("----------------------------------------------");
							break;
							
							
							
							
							case 4:
						
							System.out.println("\nGOING BACK !!!\n");
						
							break;
					
					
					
						
						default:
						
							System.out.println("\nINVALID OPTION !!! \nCAUSE THIS OPTION IS GIVEN \nPLEASE CHOOSE OPTION AGAIN \n");
						
							break;
					}
					
					
					
					
							
				
				}while(faOption!=4);
				
				
				break;
				
				//Students
				case 2:
				do{
					
				
				System.out.println("----------------------------------------------");
					System.out.println("OPTIONS FOR STUDENT MANAGEMENT : \n");
					System.out.println("\n1) Insert New Student \n2) Droping course \n3) Adding course\n4) Show All information");
                    System.out.println("5) Remove Student Detail \n6) Go Back");
					
					
					 Student S = new Student();
					 S.settypeofperson("Student");
					 
					System.out.print("\nPLEASE ENTER A OPTION : ");
					SOption = input.nextInt();
					System.out.println("----------------------------------------------");
					switch(SOption)
					{
						
						
				case 1:
		        boolean X = true;
		
		                    while(X)
		                      {
								 
						try{
						input = new Scanner(System.in);	
		        System.out.print("PLEASE ENTER STUDENT NAME : ");
	            String name = input.next();		
		        S.setName(name);
	            System.out.print("PLEASE ENTER STUDENT ID : ");
	            String  id = input.next();	
	            S.setId(id);
	            System.out.print("PLEASE ENTER STUDENT CGPA : ");
	            double cgpa = input.nextDouble();
	             S.setCgpa(cgpa);
				 String A=Double.toString(cgpa);
		        System.out.print("PLEASE ENTER Complet Course : ");
	            int cc = input.nextInt();
				String B=Integer.toString(cc);
	            S. setCompletCourse(cc);
				file.writeInFile("\nINSERTED"+"\nStudent name:"+name + "\nStudent ID:" + id +"\nStudent Cgpa:"+ A +"\nComplet Course :"+ B + "\n______________","History/Student.txt");
				 
				   X =false;
				    U.Insertstudent(S,id);//Student information insert
				 }
		         catch(InputMismatchException e){
			            System.out.println("Your input is not proper \n Please try again");
		           }
				   
						  
		        }
		       
				
			    break;
				   
				   
				   
				     case 3:
				    System.out.print ("Adding Course\n");
					  System.out.print("Enter course number :");
		             int n2=input.nextInt();
					 int []b=new int[n2];
					  System.out.println ("Please Enter Course detail");
					for(int w:b)
					 {
		            boolean Z = true;
		
		                    while(Z)
		                      {
						
						try{
							input = new Scanner(System.in);	
							
					        System.out.print ("Enter Student id :");
		                    String sid1 = input.next();
				       	    Course C1 = new Course();
		                   
	                        System.out.print ("Course Name : ");
	                        String cn =input.next();
		                    System.out.print ("Course Section : ");
	                        char c=input.next().charAt(0);
		                    C1.setSection(c);	
		                    C1.setCourseName(cn);
		                    System.out.print ("Course Credit : ");
		                    int cr=input.nextInt();
		                    C1.setCredit(cr);
		                    System.out.print ("Course Day & time : ");
		                    String dt =input.next();
		                    C1.setDaytTime(dt);
						    Student S2=U.getStudent(sid1);
						    S2.AddingCourse(C1,dt,cn);//Adding Course
						      Z =false;
						  }
						
		         catch(InputMismatchException e){
			            System.out.println("Your input is not proper \n Please try again");
		           }
					 catch(NullPointerException npe)
		                    {
			                   System.out.println("This id is not insert the Student list \nPlease try again ");
		                      }	  
		        
		                    
		        }	
					    
					 }
		                break;
						
						
						
						
						
						case 2:
				
                          System.out.print ("Droping Course\n");
						   boolean F = true;
		
		                    while(F)
		                      {
								Course C = new Course(); 
						try{
							input = new Scanner(System.in);	
		                    System.out.print ("Enter Student id :");
		                      String sid = input.next();
				              System.out.print("Enter course number :");
		                        int n1=input.nextInt();
	                              for(int i=0;i<n1;i++)
		                        {
		                         System.out.print ("Enter Course name :");
		                           String Cname = input.next();	
                                  
						           Student S3=U.getStudent(sid);								   
		                           S3.DropingCourse(S3.getCourses(Cname));//Dopp this Course
								    F =false;
				                  }
								   }
		         catch(InputMismatchException e){
			            System.out.println("Your input is not propore \n Please try again");
		           }
					 catch(NullPointerException npe)
		                    {
			                   System.out.println("This id is not insert the Student list Please try again ");
		                      }	 
							  }							  
				                     break;
						
						
						
						
							
						case 4:
							System.out.println("\n Show All information for student\n");
							U.showALLstudent();//Show all student information
							
						
							break;
							
							
							
							
							
							
						case 5:
					            System.out.print ("Remove the Student Detail\n");
								boolean B = true;
		
		                    while(B)
		                      {
								
						try{
							input = new Scanner(System.in);	
		                    System.out.print ("Enter Student id :");
		                      String sids = input.next();
							 file.writeInFile("\nREMOVED"+ "\nStudent ID:" + sids + "\n______________" ,"History/Student.txt");
							  U.removestudent(U.getStudent(sids));//remove Student
							   B =false;
						}
						catch(NullPointerException npe)
		                    {
			                   System.out.println("This id is not insert the Student list \nPlease try again ");
		                      }
							  
							  }
							  break;
							  
							  
							  
							  
							  
							  
							 case 6:
						
							System.out.println("\nGOING BACK !!!\n");
						
							break; 
						
							
							
						
						
						default:
						
							System.out.println("\nINVALID OPTION !!! \nCAUSE THIS OPTION IS GIVEN \nPLEASE CHOOSE OPTION AGAIN \n");
						
							break;
					}
					
					
					
				}while(SOption!=6);
				 
                   break;

				   
		            case 3:
					do{
						
					
				System.out.println("----------------------------------------------");
					System.out.println("OPTIONS FOR Officer MANAGEMENT : \n");
					System.out.println("\n1) Insert New Officer \n2) Remove Existing Officer \n3) Show All Officer \n4) Going Back");

					
					System.out.print("\nPLEASE ENTER A OPTION : ");
					OOption = input.nextInt();
					System.out.println("----------------------------------------------");
					switch(OOption)
					{
						case 1:
						boolean D = true;
		             Officers O=new Officers();
		                    while(D)
		                      {
								 
						try{
							input = new Scanner(System.in);	
						System.out.println("---------Insert new Officer-----------------");
						
						O.settypeofperson("Officer"); 
						System.out.print("PLEASE ENTER Officer NAME : ");
	                    String Oname = input.next();	
                           O.setName(Oname);
                         System.out.print("PLEASE ENTER  Officer Id: ");
	                      String Oid = input.next();								
						   O.setId(Oid);
						System.out.print("PLEASE ENTER Officer Work Field : ");
	                    String OWF = input.next();		
				        O.setWorkField(OWF);
						 System.out.print("PLEASE ENTER Officer Salary: ");
	                     double OS = input.nextDouble();
	                     O.setSalary(OS);
						  String Sd1=Double.toString(OS) ;
						
						 D =false;
						 file.writeInFile("\nINSERTED"+"\nOfficer name:"+Oname + "\nOfficer ID:" + Oid +"\nOfficer Working Fild:"+OWF+"\nOfficer Salary:"+ Sd1 + "Tk" + "\n______________","History/Officer.txt");
						 U.Insertperson(O,Oid);//insert officer
						 
						 System.out.println("----------------------------------------------");
				 }
		         catch(InputMismatchException e){
			            System.out.println("Your input is not proper \n Please try again");
		           }
							  }
				
						 break;
						 
						 
						 
						 
						 case 2:
						 
						 boolean C = true;
		
		                    while(C)
		                      {
								 
						try{
							input = new Scanner(System.in);	
						  System.out.println("---------Remove Officer-----------------");
						   System.out.print("PLEASE ENTER Officer ID : ");
	                       String On = input.next();	
                           file.writeInFile("\nREMOVED"+ "\nOfficer ID:" + On + "\n______________" ,"History/Officer.txt");
						   U.removeperson(U.getPerson(On));//remove officer
						    C =false;
						System.out.println("----------------------------------------------");
				          }
						 catch(NullPointerException npe)
		                    {
			                   System.out.println("This id is not insert the Faculty list \nPlease try again ");
		                      }
							  
							  }
				          break;
						  
						  
						  
						  
						  case 3:
						  
				            System.out.println("----------------------------------------------");	
							System.out.println("LIST OF ALL Officer : \n");
							U.showALLperson("Officer");//show all information
							System.out.println("----------------------------------------------");
							break;
							
							case 4:
						
						
						
							System.out.println("\nGOING BACK !!!\n");
						
							break;
						
						default:
						
							System.out.println("\nINVALID OPTION !!! \nCAUSE THIS OPTION IS GIVEN \nPLEASE CHOOSE OPTION AGAIN \n");
						
							break;
					}
					
					
					}while(OOption!=4);
					
					break;
					
					
				   case 4:
					
							System.out.println("\n EXIT");
						
							return;
				
		 
       	           default:
				
					System.out.println("\nINVALID OPTION !!! \nCAUSE THIS OPTION IS GIVEN \nPLEASE CHOOSE OPTION AGAIN\n");
					
					break;
		
		
	}
	
	
	}
	
	
	while(choice);
}


}