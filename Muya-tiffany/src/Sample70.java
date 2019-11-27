import java.io.*;
public class Sample70 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File obj = new File("/Users/margaretmuya/Documents/test/muya.txt");
		FileInputStream fis = new FileInputStream(obj);
		int ch = 0;
		try {
			while((ch = fis.read()) !=-1)
			{
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
// Hello how are you
//Where are you