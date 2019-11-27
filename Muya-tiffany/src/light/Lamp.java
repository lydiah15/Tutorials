package light;
// Method overloading example
public class Lamp 
{
	public void theSwitch()
	{
		System.out.println("The switch will turn the lamp on");
	}
	public void theSwitch(String left)
	{
		System.out.println("The switch will turn the lamp off");
	}
	public void theSwitch(String on, String off)
	{
		System.out.println("The on switch allows you to have light and the off switch takes it away");
	}

}
