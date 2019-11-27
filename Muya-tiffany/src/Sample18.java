// Object Oriented Programming
class car
{
	int wheels=4; // Instant Variable
	int windshieldwipers=2; //Instant Variable
	int steeringwheel=1; //Instant Variable
	int trunk=1; // Instant Variable
	
	public void moving() //Functions or methods functions of the class variable
	{
		System.out.println("Car can move or stop using 4 wheels");  
	}
	public void wipig()
	{
		System.out.println("Car can wipe the windshield using 2 windshieldwipers");
	}
	public void turning()
	{
		System.out.println("Car can turn left or right using 1 steeringwheel");
	}	
	public void storing ()
	{
		System.out.println("Car can store items using 1 trunk");
	}
	
}

public class Sample18
{

	public static void main(String[] args) 
	{
		car acura = new car();
		acura.moving();
		acura.wipig();
		acura.turning();
		acura.storing();
	}

}
