public class Test
{
	public static void main(String[] args)
	{
		Deque<Integer> q = new LinkedListDeque();
	
		try
		{
			System.out.println(q.popBack());
	  	}
	  	catch(Exception ex)
	  	{
	  		System.out.println(ex.getMessage());
	  	}

		try
		{
			System.out.println(q.popFront());
	  	}
	  	catch(Exception ex)
	  	{
	  		System.out.println(ex.getMessage());
	  	}

	  	System.out.println(q.toString() + " " + q.getSize());



	  	for(int i = 1; i <= 5; i++)
		{
			q.pushFront(i);
		}	
		System.out.println(q.toString() + " " + q.getSize());
	   
	   
	   for(int i = 1; i <= 5; i++)
	   {
	   	try
			{
				System.out.println(q.popFront());
		  	}
		  	catch(Exception ex)
		  	{
		  		System.out.println(ex.getMessage());
		  	}

	   }
	   System.out.println(q.toString() + " " + q.getSize());
	 	for(int i = 1; i <= 6; i++)
	 	{
	 		q.pushFront(i);
	 		System.out.println(q.toString() + " " + q.getSize());
	 	}

	}
}