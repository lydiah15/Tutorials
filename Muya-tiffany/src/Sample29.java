// Abstract method with abstract class using Hierarchy inheritance
abstract class Natural //abstract method has to have an abstract class
{
	public void add(int x, int y)
	{
		System.out.println(x+y);
	}
	public abstract void display(); // abstract method : a method without a body
}

class Muya extends Natural
{
	public void display()
	{
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}
}

class Moses extends Natural
{
	public void display()
	{
		for(int i=10;i>=1;i--)
			System.out.println(i);
	}	
}

public class Sample29 
{

	public static void main(String[] args)
	{
		Muya obj = new Muya();
		obj.add(10, 20);
		obj.display();
		
		Moses obj1 = new Moses();
		obj1.display();
		obj1.add(100, 200);
				

	}

}
