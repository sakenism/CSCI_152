//import Interfaces.IntQueue;
//import Interfaces.IntStack;

public class ReverseQueue
{
	public static Queue<Integer> reverseQueue(Queue<Integer> qo) throws Exception
	{
		Stack<Integer> st1 = new ArrayStack();

		Queue<Integer> fin = new ArrayQueue();

		int ans = 0, temp = 0, sz = qo.getSize();
		for(int i = 0; i < sz; i++)
		{
			temp = 0;
			try
			{
				temp = qo.dequeue();
			//	System.out.println("! " + temp + " !");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			st1.push(temp);
		}


		//System.out.println("KAZ");

		//System.out.println(st1.toString());

		//System.out.println("KAZ");
		sz = st1.getSize();	
		for(int i = 0; i < sz; i++)
		{
			temp = 0;
			try
			{
				temp = st1.pop();
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			fin.enqueue(temp);
		}


//		System.out.println(fin.toString());
		return fin;
	}
}