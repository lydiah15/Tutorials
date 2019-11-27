// Abstract Class and Method
abstract class Human // Abstract class
{
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public abstract void display(); // Abstract method
}
class Man extends Human
{
	public void display()
	{
		for(int x=1;x<=10;x++)
			System.out.println(x);
	}
}

class Woman extends Human
{
	public void display()
	{
		for(int x=10;x>=1;x--)
			System.out.println(x);
	}	
}
public class Sample30 
{
	public static void main(String[] args)
	{
		Man jeremy = new Man();
		jeremy.add(15, 27);
		jeremy.display();
		
		Woman bella = new Woman();
		bella.add(2, 5);
		bella.display();
	}

}
