//Array
public class Sample47
{

	public static void main(String[] args) 
	{
		try
		{
			int arr[] = {10,20,30};
			System.out.println(arr[0]+arr[11]+arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException aa)
		{
			System.out.println("Array 11 is out of bound");
		}

	}

}
