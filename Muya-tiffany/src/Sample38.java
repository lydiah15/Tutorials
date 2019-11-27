// StringBuffer functions has the same functions as String
public class Sample38 
{

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Welcome to JAVA world");
		sb.append(" Muya"); // adds the function at the end
		System.out.println(sb);
		sb.insert(8, "Surya "); // inserts
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		System.out.println(sb.length());
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.delete(0, 6);
		System.out.println(sb);
		sb.replace(1, 6, "Satya");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		

	}

}
