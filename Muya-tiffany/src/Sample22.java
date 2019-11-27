
public class Sample22
{
	int x;
	public Sample22() // default constructor(class name) - to initialize data member or value
	{
		x=100; // default constructor has no parameters
	}// ***constructors must be the same as the class name***
	public void display()
	{
		System.out.println(x);
	}

	public static void main(String[] args)
	{
		Sample22 obj = new Sample22();
		obj.display();

	}

}
