// Object oriented programming
//Method Overloading--same method/functions but different arguments/parameters
class Juice // method overloading or static polymorphism or compile time polymorphism
{
	public void prepareJuice() //static polymorphism--many forms--
	{
		System.out.println("Apple juice prepared");
	}
	public void prepareJuice(String fruit)
	{
		System.out.println(fruit+" juice prepared");
	}
	public void prepareJuice(String fruit, String milk)
	{
		System.out.println(fruit+" juice prepared " +milk);
	}
}


public class Sample24
{

	public static void main(String[] args)
	{
		Juice muya = new Juice(); //object
		muya.prepareJuice();
		muya.prepareJuice("Banana", "without milk" );
		muya.prepareJuice("Grape");

	}

}
