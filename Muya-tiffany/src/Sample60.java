import java.util.*;
public class Sample60 {

	public static void main(String[] args) 
	{
		HashMap hm = new HashMap(); // doesn't allow dublicate keys and does't follow order
		hm.put(101, "muya"); //key,value
		hm.put(104, "surya");
		hm.put(102, "moses");
		hm.put(103, "mike");
		hm.put(101, "tiffany");
		System.out.println(hm);
		System.out.println(hm.get(102)); //functions
		System.out.println(hm.size());//functions size is 4 but indexOf would be 3 size counts the element
		System.out.println(hm.containsKey(112));
		System.out.println(hm.containsValue("surya"));
		hm.remove(101); //not added in the print-line
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		hm.clear(); //don't add it in the print-line
		System.out.println(hm);
		System.out.println(hm.isEmpty());
	}

}
