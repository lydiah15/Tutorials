//Serialization--Writing an object in a file folder
import java.io.*;
public class Sample73 {

	public static void main(String[] args) throws IOException
	{
		File obj = new File("/Users/margaretmuya/Documents/test/muya.txt");
		FileOutputStream fos = new FileOutputStream(obj);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Employee emp = new Employee();
		emp.setEmpno(101);
		emp.setEmpname("Muya");
		emp.setEmpsal(5000);
		
		oos.writeObject(emp);//the process of writing an object from a file 
		oos.close();
		fos.close();
	}

}
