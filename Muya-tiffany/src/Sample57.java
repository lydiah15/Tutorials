import java.util.*;

public class Sample57 
{

	public static void main(String[] args)
	{
		LinkedHashSet obj = new LinkedHashSet(); //follows order and don't allow dublicate
		obj.add(10); //element
		obj.add(20); // integer
		obj.add(10);
		obj.add(42);
		obj.add(40);
		obj.add(12);
		obj.add(45);
		obj.add(40);
		
		System.out.println(obj);
	}

} 
