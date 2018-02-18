public class test1 extends LinkedListQueue
{
	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedListQueue();
		try
		{
			System.out.println(q.dequeue());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		for(int i = 1; i <= 8; i++)
		{
			q.enqueue(i * 2 + 4);
		}

		System.out.println(q.toString());


		for(int i = 1; i <= 3; i++)
		{
			try
			{
				System.out.println(q.dequeue());
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		System.out.println(q.toString());
	
	   for(int i = 10; i <= 19; i++)
	   {
	   	q.enqueue(i * i + 2);
	   	try
	   	{
	   		System.out.println(q.dequeue());
	   	}
	   	catch(Exception ex)
	   	{
	   		System.out.println(ex.getMessage());
	   	}
	   }

	   System.out.println(q.toString());
	   q.clear();
	   System.out.println(q.toString());
		
		for(int i = 1; i <= 22; i++)
		{
			q.enqueue(i * 4 + 4);
		}

	   System.out.println(q.toString());
		
	}
}