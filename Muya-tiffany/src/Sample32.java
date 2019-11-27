// Multiple interfaces
interface Shape1
{
	public void area();
}

interface Shape2
{
	public void perimeter();
}

class Rectangle implements Shape1,Shape2 // class can implements multiple interfaces
{
	int l=98,w=67;
	public void area()
	{
		System.out.println(l*w);
	}
	public void perimeter()
	{
		System.out.println(2*(l+w));
	}

}

class Circle implements Shape2,Shape1
{
	float pi=3.14f,rad=7.6f;
	public void perimeter()
	{
		System.out.println(2*pi*rad);
	}
	public void area()
	{
		System.out.println(pi*rad*rad);

	}

}

public class Sample32 
{

	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.perimeter();
		c.area();
		
		Rectangle r = new Rectangle();
		r.area();
		r.perimeter();

	}

}
