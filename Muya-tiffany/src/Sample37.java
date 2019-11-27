
public class Sample37 
{

	public static void main(String[] args) 
	{
		String usr = "WEL@surya";
		String pwd = "hello"; //password
		String cpwd = "hello"; // confirm password
		
		if(usr.startsWith("WEL") && usr.length()>6 && pwd.equals(cpwd) && usr.contains("@")) // String functions
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Failed");
		}

	}

}
