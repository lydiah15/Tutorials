// Exception handling
// **lang time error is found in the default package**
public class Sample43 
{

	public static void main(String[] args)
	{
		try
		{
		int x=10,y=0;
		System.out.println(x/y); // lang time error 
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Number cannot divisible by zero");
		}
	}

}
