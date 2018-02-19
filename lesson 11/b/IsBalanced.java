public class IsBalanced extends LinkedListQueue
{
	public static boolean isBalanced(Queue<Character> old)
	{
		char ch, last = ' ';                   
		boolean check = false;
		Queue<Character> q = new LinkedListQueue();
		int a = 0, b = 0, c = 0, sz = old.getSize();
	   for(int i = 1; i <= sz; i++)
	   {
	   	try
	   	{
	   		char tmp = old.dequeue();
	   		q.enqueue(tmp);
	   		old.enqueue(tmp);
	   		if(tmp != '(' && tmp != '{' && tmp != '[' && tmp != '}' && tmp != ']' && tmp != ')')
	   		{
	   			check = true;		
	   		}
	   	}
	   	catch(Exception ex)
	   	{
	   		System.out.println(ex.getMessage());
	   	}
	   }
	   if(check == true)
	   {
	   	System.out.println("There is somethin that is not bracket");
	   	return false;
	   }
		for(int i = 1; i <= sz; i++)
		{
			try
			{
				ch = q.dequeue();
				if(ch == '{')
				{
					a++;
//					System.out.println("@");
				}
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

				//q.enqueue(ch);
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