// Method Overloading--a class with the same function but different arguments
class Add
{
	public void addElements(int num1, int num2)
	{
		System.out.println("Integer value in Add class is " +(num1+num2)+".");
	}
	public void addElements(double num1, double num2) // float
	{
		System.out.println("The double value in Add class is " +(num1+num2)+".");
	}
	public void addElements(String name, String color)
	{
		System.out.println("My name is "+name+" and my favorite color is " +color+".");

	}
}



public class Sample27 {

	public static void main(String[] args) 
	{
		Add first = new Add();
		first.addElements(15, 27);
		first.addElements(22.59, 57.23); // 22.59f, 57.23f
		first.addElements("Lydiah", "blue");
		
	}

}
