public class IsPalindrome 
{
	public static boolean isPalindrome(Queue<Character> qo)	
	{
		Queue<Character> q1 = new LinkedListQueue();
		Queue<Character> q2 = new LinkedListQueue();
		Stack<Character> st = new LinkedListStack();
		int sz = 0;
		char tmp = 'a';
		sz = qo.getSize();
		for(int i = 0; i < sz; i++)
		{
			try
			{
				tmp = qo.dequeue();
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			st.push(tmp);
			qo.enqueue(tmp);
			q1.enqueue(tmp);
		}
		//System.out.println(q1.toString());
		for(int i = 0; i < sz; i++)
		{
			try
			{
				tmp = st.pop();
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			q2.enqueue(tmp);
		}
		//System.out.println("!" + q2.toString());
		for(int i = 0; i < sz; i++)
		{
			try
			{
				if(q1.dequeue() != q2.dequeue())
				{
					return false;					
				}
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		return true;
	}
}