
public class Sample41 
{

	public static void main(String[] args) 
	{
		String str = new String("mos3e7s4");
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))// isLetter isUpperCase isLowerCase //Character is a class
			{
				System.out.println(str.charAt(i)); //prints only the number
			}
			if(Character.isLetter(str.charAt(i)))
			{
				System.out.println(str.charAt(i)); //prints only the letter
			}
//functions of Character class isDigit, isLetter, isUpperCase, isLowerCasse e.t.c.
		}

	}

}
