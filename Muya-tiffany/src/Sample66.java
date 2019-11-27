//when you're extending a thread you have to have a function
//Thread is light weight which performs a unit of work.
public class Sample66 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"--"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
			
			}//try & catch is mandatory when performing thread.sleep
		}
	}

	public static void main(String[] args) throws InterruptedException //is mandatory is join()functions 
	{
		Sample66 obj = new Sample66(); //we can create any number of threads
		Sample66 obj1 = new Sample66();
		Sample66 obj2 = new Sample66();

		obj.setName("MuyaThread");
		obj1.setName("SuryaThread");
		obj2.setName("TiffanyThread");

		obj.start();
		obj.join(); //make other threads wait until--Muya thread is done//another function in thread
		obj1.start();
		obj2.start();

		
	}

}
