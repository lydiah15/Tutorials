// Input/Output Operation in Java(java.io Package)
import java.io.*; //input output class---data--create a folder
public class Sample68 { //finder in the Documents folder

	public static void main(String[] args) throws IOException 
	{
		File obj = new File("/Users/margaretmuya/Documents/test/muya.txt");
		//obj.mkdir(); //it's a function that's creating a directory.
		obj.createNewFile();
		//obj.delete(); //---how to delete a file
		
		FileOutputStream fos = new FileOutputStream(obj); //write a content and create a file
		byte arr[] = {65,66,67,68};
		fos.write(arr);
		fos.close();
	}

}
// we can create folder and a file and delete also
//created my directory in the --terminal--