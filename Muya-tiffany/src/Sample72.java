import java.io.*;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Sample72 {

	public static void main(String[] args) throws IOException 
	{
		File obj = new File("/Users/margaretmuya/Documents/test/muya.txt");
		FileInputStream fis = new FileInputStream(obj);
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readUTF());

	}

}
