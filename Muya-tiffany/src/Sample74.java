//Deserialization---reading a file of an object created in a folder
import java.io.*;
public class Sample74 {

	public static void main(String[] args) throws IOException,ClassNotFoundException
	{
		File obj = new File("/Users/margaretmuya/Documents/test/muya.txt");
		FileInputStream fos = new FileInputStream(obj);
		ObjectInputStream oos = new ObjectInputStream(fos);
		
		Employee emp = (Employee)oos.readObject();
		System.out.println(emp.getEmpno());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpsal());
		oos.close();
		fos.close();
	}

}
