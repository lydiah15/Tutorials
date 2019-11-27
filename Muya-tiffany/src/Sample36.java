
public class Sample36
{

	public static void main(String[] args) 
	{
		String obj = new String("Welcome to JAVA world");
		for(int i=0;i<obj.length();i++)
		{
			if(obj.charAt(i)=='a' || obj.charAt(i)=='e' || obj.charAt(i)=='i' || obj.charAt(i)=='o' || obj.charAt(i)=='u')
				System.out.println(obj.charAt(i)); // it's case sensitive
		}
		
		System.out.println();
		for(int j=obj.length()-1;j>=0;j--)
		{
			System.out.print(obj.charAt(j));
		}

	}

}
