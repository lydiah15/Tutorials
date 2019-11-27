// Wrapper classes--changing a string to an integer, float, and boolean.
// Major keyword .parse
public class Sample34 
{

	public static void main(String[] args) 
	{
		String s = "123";
		
		int x = Integer.parseInt(s); // Wrapper classes
		System.out.println(x+100);
		
		float f = Float.parseFloat("3.6");
		System.out.println(f*f);
		
		boolean b = Boolean.parseBoolean("true");
		System.out.println(!b);
		
		float n = Float.parseFloat(s);
		System.out.println(n*n);

	}

}
