import java.util.ArrayList; // ArrayList is a Class in util
public class Sample52 
{

	public static void main(String[] args) 
	{
		ArrayList obj = new ArrayList();

		
		obj.add(10);
		obj.add(20);
		obj.add("muya");
		obj.add("surya");
		obj.add(false);
		obj.add(true);
		obj.add(4.5f);
		System.out.println(obj); //prints it in array [] format
		System.out.println(obj.size()); //counts all the elements
		System.out.println(obj.isEmpty());
		System.out.println(obj.indexOf("surya")); //indexOf starts at 0 and counts the elements
		System.out.println(obj.contains("moses"));
		System.out.println(obj.get(6)); //get the index of 6
		obj.remove("surya");
		System.out.println(obj);
		obj.clear();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
	
	}

}
