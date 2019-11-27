import light.Lamp;
public class Sample53 
{

	public static void main(String[] args) 
	{
		Lamp obj = new Lamp();
		obj.theSwitch();
		obj.theSwitch("button");
		obj.theSwitch("button", "button");
	}

}
