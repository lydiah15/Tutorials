//Synchronization
class Italy
{
	public synchronized void displayItaly(double y) throws InterruptedException
	{
		for(double i=1.54;i<=5.53;i++)
		{
			System.out.println(y+"*"+i+"="+(y-8.90));
			Thread.sleep(1000);
		}
	}
}

class Venice extends Thread
{
	Italy n; //n is a data member
	public Venice(Italy n) //Venice is a constructor
	{
		this.n=n;
	}
	public void run() 
	{
		try {
			n.displayItaly(23.4);
		} catch (InterruptedException e) {
		}
	}
}

class Florence extends Thread
{
	Italy n; //data member
	public Florence(Italy n) //constructor
	{
		this.n=n;
	}
	public void run()
	{
		try {
			n.displayItaly(17.7);
		} catch (InterruptedException e) {
		}
	}
}


public class Sample69 {

	public static void main(String[] args) 
	{
		Italy n = new Italy();
		Venice n1 = new Venice(n);
		n1.start();
		
		Florence n2 = new Florence(n);
		n2.start();
	}

}
