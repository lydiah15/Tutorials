// Method Overriding--super and sub class has the same method
// Method Overriding is used in inheritance
// Major keyword--extends and-- ***super.themethod()***
// Outputs both methods/functions
class BlackWhiteTV
{
	public void watchMovie()
	{
		System.out.println("Movie can watch in Black White");
	}
}

class ColorTV extends BlackWhiteTV
{
	public void watchMovie()
	{
		super.watchMovie(); // keyword is "SUPER"
		System.out.println("Movie can watch in Color");

	}
}


public class Sample28 
{

	public static void main(String[] args) 
	{
		ColorTV obj = new ColorTV();
		obj.watchMovie();
	}

}
