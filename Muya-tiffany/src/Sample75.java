//Serialization
import java.io.*;

public class Sample75 {

	public static void main(String[] args) throws IOException 
	{
		File obj = new File("/Users/margaretmuya/Documents/test/muya.txt");
		FileOutputStream fos = new FileOutputStream(obj);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student st = new Student();
		st.setStudentName("Lydiah Muya");
		st.setStudentID(115);
		st.setStudentParking(256);
		st.setStudentAge(21);
		st.setStudentDegree("Management Information Systems");
		
		oos.writeObject(st);
		oos.close();
		fos.close();
	}

}
