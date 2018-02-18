public class IsBalanced extends LinkedListQueue
{
	public static boolean isBalanced(Queue<Character> q)
	{
		char ch, last = '-';
		int a = 0, b = 0, c = 0, sz = q.getSize();
		for(int i = 1; i <= sz; i++)
		{
			try
			{
				ch = q.dequeue();
				if(ch == '{')
					a++;
				if(ch == '[')
					b++;
				if(ch == '(')
					c++;

			  	if(ch == ']')
			  	{
			  		if(last == '{' || last == '(')
			  			return false;
			  		else
				  		b--;
				}
				if(ch == '}')
			  	{
			  		if(last == '[' || last == '(')
			  			return false;
			  		else
				  		a--;
				}
				
				if(ch == ')')
			  	{
			  		if(last == '{' || last == ']')
			  			return false;
			  		else
				  		c--;
				}

				q.enqueue(ch);
			  	last = ch;
			  	if(a < 0 || b < 0 || c < 0)
			  		return false;
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		if(a == 0 && b == 0 && c == 0)
		{
			return true;
		}
		return false;
	}
}