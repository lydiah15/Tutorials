
public class Sample20 
{
	int x,y; // instant variable
	public void add(int p,int q)  // function/methods with p,q are arguments or parameters
	{
		x=p;
		y=q;
		System.out.println(x+y);
	}
	public void sub(int n1,int n2)
	{
		x=n1;
		y=n2;
		System.out.println(n1-n2);
	}

	public static void main(String[] args)
	{
		Sample20 obj = new Sample20();
		obj.add(100, 200);
		obj.sub(45, 23);

	}

}
