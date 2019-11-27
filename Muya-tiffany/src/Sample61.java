import java.util.*; // TreeMap -- follows the ascending order of the key & don't allow dublicate
import java.util.Set;
public class Sample61 { // LinkedHashMap -- follows the order of the key & don't allow dublicate

	public static void main(String[] args) 
	{
		TreeMap hm = new TreeMap(); //follows the order also have LinkedHashMap
		hm.put(101, "muya"); //key,value
		hm.put(104, "surya");
		hm.put(102, "moses");
		hm.put(103, "mike");
		hm.put(101, "tiffany");
		
		Set s =hm.keySet(); // purpose to get set of keys
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object o = itr.next();
			Object p = hm.get(o);
			System.out.println(o+"---"+p);
			 
		}
		
		//check out LinkedHashMap
		
	}

}
