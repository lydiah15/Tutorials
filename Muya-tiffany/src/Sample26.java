// Multilevel Inheritance--multiple extends classes
// Hierarchy inheritance-- super class extends more than once
class First 
{
	int x=10,y=20;
	public void add()
	{
		System.out.println(x+y);
	}
}

class Second extends First // two functions
{
	public void sub()
	{
		System.out.println(y-x);
	}
}

class Third extends Second // three functions
{
	public void multiply()
	{
		System.out.println(x*y);
	}
}


public class Sample26 
{

	public static void main(String[] args) 
	{
		Second obj = new Second();
		obj.add();
		obj.sub();
		
		Third obj1 = new Third();
		obj1.add();
		obj1.sub();
		obj1.multiply();

	}

}
