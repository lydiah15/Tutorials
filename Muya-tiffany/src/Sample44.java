
public class Sample44 
{

	public static void main(String[] args) 
	{
		try
		{
			int x = Integer.parseInt("surya");
			System.out.println(x-50);
		}
		catch(NumberFormatException ne)
		{
			System.out.println("surya cannot convert into number");
		}

	}

}
