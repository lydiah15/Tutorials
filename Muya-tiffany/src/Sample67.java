//unsynchronization---results any of the thread 
// synchronization does the first thread first 
class Table
{
	public synchronized void displayTable(int x) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(x+"*"+i+"="+(x*1));
			Thread.sleep(1000);
		}
	}
}

class Tiffany extends Thread
{
	Table t; //t is a data member
	public Tiffany(Table t) //Tiffany is a constructor
	{
		this.t=t; //argument t is ascending to data member t
	}
	public void run()
	{
		try {
			t.displayTable(5);
		} catch (InterruptedException e) {
		}
		
	}
}
class Surya extends Thread
{
	Table t;
	public Surya(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		try {
			t.displayTable(10);
		} catch (InterruptedException e) {
			
		}
	}
	
}

public class Sample67 {

	public static void main(String[] args) 
	{
		Table t = new Table();
		Tiffany t1 = new Tiffany(t);
		t1.start();
		
		Surya t2 = new Surya(t);
		t2.start();
		
	}

}
