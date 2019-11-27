import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Sample71 
{

	public static void main(String[] args) throws IOException
	{
		File obj = new File("/Users/margaretmuya/Documents/test/muya.txt");
		FileOutputStream fos = new FileOutputStream(obj);
		DataOutputStream dos = new DataOutputStream(fos); //you can write any data
		dos.writeInt(100);
		dos.writeFloat(4.5f); 
		dos.writeBoolean(true);
		dos.writeUTF("muya");//string--UTF
		dos.close();
		fos.close();
	}

}
