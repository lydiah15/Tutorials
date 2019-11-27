//Finally block -- it's not mandatory it's optional
public class Sample50 
{

	public static void main(String[] args) 
	{
		try
		{
			int arr[] = {10,20,30};
			System.out.println(arr[0]+arr[11]+arr[2]);	
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Index not found");
		}
		finally // only can write one finally block but it's not mandatory it's optional
		{
			System.out.println("Hello Muya");
		}

	}

}
