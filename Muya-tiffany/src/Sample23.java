
public class Sample23 
{
	int x,y;
	public Sample23(int p,int q) // parameterized constructor
	{
		x=p;
		y=q;
	}
	public void display()
	{
		for(int i=x;i<=y;i++)
			System.out.println(i);
	}

	public static void main(String[] args) 
	{
		Sample23 obj = new Sample23(12,38);
		obj.display();

	}

}
