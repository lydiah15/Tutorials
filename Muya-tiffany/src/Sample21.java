
public class Sample21
{
	int n;
	public void display(int x) // argument or parameter
	{
		n=x;
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
	public void validatevowel(char x)
	{
		if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
			System.out.println("Vowel");
		else
			System.out.println("Not Vowel");
	}

	public static void main(String[] args)
	{
		Sample21 obj = new Sample21();
		obj.display(10);
		obj.display(30);
		obj.validatevowel('i');

	}

}
