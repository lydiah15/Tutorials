//Thread major keyword **extends**
public class Sample65 extends Thread//multithreading program
{

	public static void main(String[] args)
	{
		Sample65 obj = new Sample65();
		
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getPriority());
		System.out.println(obj.isAlive());
		System.out.println(obj.getState());
		
		obj.setName("muya");
		System.out.println(obj.getName());
		
		obj.setPriority(8);
		System.out.println(obj.getPriority());


		
		
	}

}
