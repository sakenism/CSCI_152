public class Test
{
	public static void main(String[] args)
	{
		SortedQueue<Integer> q = new LinkedListSortedQueue();
		for(int i = 90; i >= 10; i -= 10)
		{
			q.insert(i);
		}    

		System.out.println(q.toString() + q.getSize());



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

		System.out.println(q.toString() + q.getSize());

		for(int i = 100; i <= 900; i += 100)
		{
			q.insert(i);
		}
		System.out.println(q.toString() + q.getSize());

		for(int i = 1; i <= 4; i++)
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
		System.out.println(q.toString() + q.getSize());

		for(int i = 5; i <= 915; i += 10)
		{
			q.insert(i);
		}
		System.out.println(q.toString() + q.getSize());

		int sz = q.getSize();
		for(int i = 1; i <= sz; i++)
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
		System.out.println(q.toString() + q.getSize());

		q.insert(1);
		q.insert(21);
		q.insert(31);


		System.out.println(q.toString() + q.getSize());

		q.insert(11);
		q.insert(101);
		q.insert(22);
		q.insert(12);
		System.out.println(q.toString() + q.getSize());




	}
}