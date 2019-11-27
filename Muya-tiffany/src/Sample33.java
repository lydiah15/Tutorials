// Interface OOP
interface Animal
{
	public void Talk();
}

class Dog implements Animal
{
	public void Talk()
	{
		System.out.println("Andy's dog can talk!");
	}
}

class Goat implements Animal
{
	public void Talk()
	{
		System.out.println("My neighbor's goat can talk!");
	}
}

class Hen implements Animal
{
	public void Talk()
	{
		System.out.println("You would never believe it, but I saw a hen that can talk!");
	}
}

public class Sample33 
{

	public static void main(String[] args)
	{
		Dog steve = new Dog();
		steve.Talk();
		
		Goat henry = new Goat();
		henry.Talk();
		
		Hen sue = new Hen();
		sue.Talk();
	}

}
