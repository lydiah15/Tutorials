
public class Sample12 
{

	public static void main(String[] args)
	{
		int m=51,m2=23,m3=60;
		int tot = m+m2+m3;
		float avg = tot/3;
		if(avg>=55)
		{
			System.out.println("First Class");
		}
		else if(avg>=27 && avg<70)
		{
			System.out.println("Second Class");

		}
		else if(avg>=50 && avg<55)
		{
			System.out.println("Third Class");

		}
		else
		{
			System.out.println("Failed");

		}
			
		
	}

}
