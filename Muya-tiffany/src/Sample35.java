// Class String functions
public class Sample35
{

	public static void main(String[] args) 
	{
		String obj = new String("Welcome to JAVA world");
		System.out.println(obj.toUpperCase()); // functions
		System.out.println(obj.toLowerCase());
		System.out.println(obj.concat(" and python world")); // another word for add a string to another
		System.out.println(obj.contains("JAVA"));
		System.out.println(obj.startsWith("Wel"));
		System.out.println(obj.endsWith("RLD"));
		System.out.println(obj.equals("Welcome to java world"));
		System.out.println(obj.equalsIgnoreCase("WELCOME to JAVA world"));
		System.out.println(obj.length());
		System.out.println(obj.charAt(19)); //index character starting with 0
		System.out.println(obj.replace('e', 'x'));
		

	}

}
