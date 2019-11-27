
public class Sample48 
{

	public static void main(String[] args) 
	{
		try
		{
			int x=10,y=10;
			System.out.println(x/y);
			int z=Integer.parseInt("surya");
			System.out.println(z-50);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Number cannot divisible by zero");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("surya cannot convert into Integer");
		}
	}

}
