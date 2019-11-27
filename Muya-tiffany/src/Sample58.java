import java.util.*;
public class Sample58 {

	public static void main(String[] args)
	{
		TreeSet obj = new TreeSet();
		obj.add(10); //element
		obj.add(20); // integer
		obj.add(10);
		obj.add(42);
		obj.add(40);
		obj.add(12);
		obj.add(40);
		System.out.println(obj);
	}


// TreeSet follows the ascending order and doesn't allow duplicates
//has to have the same integer or string or decimal
// if you have integer and string you have to do try and catch block
}