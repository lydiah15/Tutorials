// Object Oriented Programming---method and functions ()
// 2 different classes
class HumanBeing
{
	int legs=2; // Instant Variables are declared inside a class
	int hands=2; //objects of a class
	int nose=1;
	
	public void walking() // Functions or methods of the objects
	{
		System.out.println("Human Being can walk with 2 legs");
	}
	public void writing()
	{
		System.out.println("Human Being can write with 2 hands");
	}
	public void breathing()
	{
		System.out.println("Human Being can breathe with 1 nose");
	}
	
}


public class Sample17
{

	public static void main(String[] args)
	{
		HumanBeing muya = new HumanBeing(); // Object
		muya.walking();
		muya.writing();
		muya.breathing();

	}

}

