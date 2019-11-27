import java.util.HashSet;// another class under util

public class Sample56 
{

	public static void main(String[] args) 
	{
		HashSet obj = new HashSet(); // won't follow order and won't allow dublicates
		obj.add(10); //element
		obj.add(20);
		obj.add(10);
		obj.add(42);
		obj.add(40);
		obj.add(12);
		obj.add(45);
		obj.add(40);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains(10));
		System.out.println(obj.isEmpty());
		obj.remove(40);
		System.out.println(obj);
		
	}

}
