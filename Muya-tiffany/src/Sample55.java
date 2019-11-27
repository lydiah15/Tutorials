import java.util.*; //* means you're inputing everything in the util class

public class Sample55 
{

	public static void main(String[] args)
	{
		ArrayList obj = new ArrayList();
		obj.add(10); //element
		obj.add(20);
		obj.add(36);
		obj.add(42);
		obj.add(40);
		obj.add(12);
		
		Iterator itr =obj.iterator(); //Iterator is an interface--iterates a collection of objects
		while(itr.hasNext())
		{
			Object o = itr.next();
			Integer i = (Integer)o;
			int x = i.intValue();
			if(x%3==0)
				System.out.println(i);
		}

	}

}
