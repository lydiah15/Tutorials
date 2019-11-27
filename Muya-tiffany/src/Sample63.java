import java.util.*; //token
public class Sample63 {

	public static void main(String[] args)
	{
		String s = "welcome-to-java-world";
		
		StringTokenizer st = new StringTokenizer(s,"-"); //split into the tokens
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
