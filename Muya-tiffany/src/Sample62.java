import java.util.*;
public class Sample62 {

	public static void main(String[] args)
	{
		TreeMap hm = new TreeMap();
		hm.put(101, "Muya");
		hm.put(104, "Surya");
		hm.put(102, "Moses");
		hm.put(103, "Mike");
		hm.put(105, "Tiffany");
		hm.put(106, "Suman");
		
		Set s =hm.keySet(); // purpose to get set of keys
		Iterator itr=s.iterator(); // s only contains all the keys
		while(itr.hasNext())
		{
			Object o = itr.next(); //101
			Object p = hm.get(o); //muya
			String st = (String) p; //you have to convert the object into string values
			if(st.startsWith("Su")) 
			{
				System.out.println(o+"---"+p);
			}
		}
	
	
		
	}	

}
