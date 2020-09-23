package ForCreateFile;
import java.lang.*;
import java.io.*;
import Classes.Person.*;
import Classes.Employee.*;
import Classes.Student.*;
import Classes.University.*;
public class ForCreateFile
{
				
	private FileWriter writer;		
	private FileReader reader;		
	private BufferedReader bfr;		
	
	
	public void writeInFile(String s, String fname)
	{
		
		try
		{
			File file = new File(fname);	
			file.createNewFile();					
			writer = new FileWriter(file,true);	
			writer.write(s+"\r"+"\n");				
			writer.flush();							
			writer.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFile(String fname) 
	{
		
		
		try
		{
			File file = new File(fname);
			reader = new FileReader(file);			
			bfr = new BufferedReader(reader);		
			String fullText="", singleLine;					
			
			while((singleLine=bfr.readLine())!=null)		
			{
				String sp[] = singleLine.split(" ");
				
				fullText=fullText+singleLine+"\n\r";			
			}
			
			System.out.println(fullText);				
			reader.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
}