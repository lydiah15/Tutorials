
public class Sample42 
{

	public static void main(String[] args) 
	{
		String str = new String ("We23LCo59mE4");
		int uppercase = 0, lowercase = 0, digits = 0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				uppercase++;
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				lowercase++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				digits++;
			}
			
		}
		System.out.println("Uppercase = "+uppercase);
		System.out.println("Lowercase = "+lowercase);
		System.out.println("Digits = "+digits);
	}
}
