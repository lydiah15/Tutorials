
public class Sample40
{

	public static void main(String[] args)
	{
		String user = "apple";
		String pwd = "elppa";
		
		StringBuffer sb = new StringBuffer(pwd);
		StringBuffer sb1 = sb.reverse();
		
		if(user.contentEquals(sb1.toString())) // purpose of .toString is to convert a StringBuffer to a string
			System.out.println("Login Success");
		else
			System.out.println("Login Failed");
		

	}

}
