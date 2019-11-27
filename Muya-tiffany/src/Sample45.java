
public class Sample45 
{

	public static void main(String[] args)
	{
		try
		{
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException aa)
		{
			System.out.println("null cannot output anything!");
		}

	}

}
