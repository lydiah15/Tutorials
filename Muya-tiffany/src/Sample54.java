import java.util.LinkedList; // functions of ArrayList are contained in linked list
public class Sample54 
{

	public static void main(String[] args) 
	{
		LinkedList obj = new LinkedList();
		obj.add(10);
		obj.add(20);
		obj.add("muya");
		obj.add("surya");
		obj.add("muya");
		obj.add(false);
		obj.add(true);
		obj.add(4.5f);
		
		obj.addFirst(100);
		obj.addLast(200);
		System.out.println(obj);
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		obj.removeFirst();
		obj.removeLast();
		System.out.println(obj);
		obj.removeFirstOccurrence("muya");
		System.out.println(obj);
		obj.removeLastOccurrence("muya");
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		

	}

}
