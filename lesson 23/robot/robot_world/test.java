
public class test extends ReverseQueue
{
	public static void main(String[] args)
	{  
		Queue<Integer> q = new ArrayQueue();
	

		for(int i = 7; i <= 22; i++)
		{
			q.enqueue(i);
		}

/*		for(int i = 22; i >= 7; i--)
		{
			q.enqueue(i);
		}
*/
		System.out.println(q.toString());
		try
		{
			System.out.println(reverseQueue(q));
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}                          