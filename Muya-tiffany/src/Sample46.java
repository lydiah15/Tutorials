// Lang time error
public class Sample46 
{

	public static void main(String[] args)
	{
		try
		{
			String str = "surya";
			System.out.println(str.charAt(10));
		}
		catch(StringIndexOutOfBoundsException ee)
		{
			System.out.println("String surya is out of bound!");
		}

	}

}
