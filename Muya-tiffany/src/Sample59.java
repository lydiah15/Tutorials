import java.util.*;
public class Sample59 {

	public static void main(String[] args) 
	{
		HashSet obj = new HashSet();
		obj.add(10); //element
		obj.add(20); // integer
		obj.add(10);
		obj.add(42);
		obj.add(40);
		obj.add(12);
		obj.add(45);
		obj.add(40);
		Iterator itr =obj.iterator();
		while(itr.hasNext())
		{
			Object o = itr.next();
			int n = (Integer)o;
			if(n%5==0)
				System.out.println(n);
		}
	}

}
