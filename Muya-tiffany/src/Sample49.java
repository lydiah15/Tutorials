// Lang time error
public class Sample49 
{

	public static void main(String[] args) 
	{
		try
		{
			int x=50, y=10;
			System.out.println(x/y);
			float n=Float.parseFloat("2.0");
			System.out.println(n);
			String str = "Hyde";
			System.out.println(str.charAt(3));
			int arr[] = {11,15,27,57};
			System.out.println(arr[0]+arr[1]+arr[2]+arr[3]);
			String l=null;
			System.out.println(l.charAt(2));
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Numeber isn't divisible by zero");
		}
		catch(NumberFormatException ee)
		{
			System.out.println("She said YES cannot convert to float");
		}
		catch(StringIndexOutOfBoundsException aa)
		{
			System.out.println("String Hyde charAt(7) is out of bound");
		}
		catch(ArrayIndexOutOfBoundsException bb)
		{
			System.out.println("Array 5 is out of bound");
		}
		catch(NullPointerException ea)
		{
			System.out.println("charAt(2) cannot be defined or output anything");
		}
		

	}

}
