// Single level Inheritance -- acquiring property(data) from super to sub class
//Major keyword for Inheritance **extends**
class Father // Super class
{
	int fproperty = 10;
}

class Son extends Father // Sub class
{
	int sproperty = 5;
	public void buildhome()
	{
		System.out.println("Son can construct a house using "+(sproperty+fproperty)+ " lacs" );
	}
}



public class Sample25
{

	public static void main(String[] args)
	{
		Son obj = new Son();
		obj.buildhome();
	}

}
