// Interface -- contains only abstract methods -- methods without a body.
// Major keyword ***implements***

interface Add1
{
	public void addnumbers(int x, int y);
}

class AA implements Add1 // Keyword "implements"
{
	public void addnumbers(int x, int y)
	{
		System.out.println(x+y);
	}
}

class BB implements Add1
{
	public void addnumbers(int x, int y)
	{
		int s=0;
		for(int i=x;i<=y;i++)
		{
			s+=i; // returns 10+11+12+13...20
		}
		System.out.println(s);
	}
}

public class Sample31
{

	public static void main(String[] args)
	{
		AA obj = new AA();
		obj.addnumbers(20, 34);
		
		BB obj1 = new BB();
		obj1.addnumbers(10, 20);

	}

}
