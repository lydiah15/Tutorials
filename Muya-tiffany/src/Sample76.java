//Deserialization
import java.io.*;
public class Sample76 {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		File obj = new File("/Users/margaretmuya/Documents/test/muya.txt");
		FileInputStream fos = new FileInputStream(obj);
		ObjectInputStream oos = new ObjectInputStream(fos);
		
		Student st = (Student)oos.readObject();
		System.out.println("The student name is "+st.getStudentName());
		System.out.println("Lydiah's student ID is "+st.getStudentID());
		System.out.println("Her parking spot number is "+st.getStudentParking());
		System.out.println("The student Lydiah's age is "+st.getStudentAge());
		System.out.println("Lydiah's degree major is "+st.getStudentDegree());
		oos.close();
		fos.close();


	}

}
