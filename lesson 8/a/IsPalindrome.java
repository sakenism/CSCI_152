import Interfaces.IntQueue;
import Interfaces.IntStack;

public class IsPalindrome
{
	public static boolean isPalindrome(ArrayIntQueue qo)	
	{
		ArrayIntQueue q1 = new ArrayIntQueue();
		ArrayIntQueue q2 = new ArrayIntQueue();
		ArrayIntStack st = new ArrayIntStack();
		int sz = 0, tmp = 0;
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
			q1.enqueue(tmp);
		}
		//System.out.println(q1.toString());
		sz = st.getSize();
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
		sz = q2.getSize();
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