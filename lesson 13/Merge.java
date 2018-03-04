public class Merge
{
	public static Deque<Integer> merge(Deque<Integer> d1, Deque<Integer> d2)
	{
		Deque<Integer> fin = new LinkedListDeque();
		while(d1.getSize() != 0 && d2.getSize() != 0)
		{
//			System.out.println("!!!!!!!!!!!!");
			try
			{
				int tmp1 = d1.popFront();
				int tmp2 = d2.popFront();
				if(tmp1 < tmp2)	
				{
					fin.pushBack(tmp1);
					d2.pushFront(tmp2);
				}
				else
				{
					fin.pushBack(tmp2);
					d1.pushFront(tmp1);
				}
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		while(d1.getSize() != 0)
		{

	//		System.out.println("@@@@@@@@@@");
			try
			{
				fin.pushBack(d1.popFront());
		  	}
		  	catch(Exception ex)
		  	{
		  		System.out.println(ex.getMessage());
		  	}
		}

		while(d2.getSize() != 0)
		{
			
//			System.out.println("###########");
			try
			{
				fin.pushBack(d2.popFront());
		  	}
		  	catch(Exception ex)
		  	{
		  		System.out.println(ex.getMessage());
		  	}
		}
		return fin;


	}
}