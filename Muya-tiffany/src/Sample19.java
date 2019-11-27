// All under one class
public class Sample19 
{
	int n1=24,n2=89;
	public void add() // function or method
	{
		System.out.println(n1+n2);
	}
	public void sub() // function or method
	{
		System.out.println(n2-n1);
	}

	public static void main(String[] args)
	{
		Sample19 obj = new Sample19();
		obj.add();
		obj.sub();

	}

}
