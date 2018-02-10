
public class Copy
{
	public static Stack<Integer> copy(Stack<Integer> sto) throws Exception
	{
		Stack<Integer> st1 = new ArrayStack();

		Stack<Integer> fin = new ArrayStack();

		int ans = 0, temp = 0, sz = sto.getSize();
		for(int i = 0; i < sz; i++)
		{
			temp = 0;
			try
			{
				temp = sto.pop();
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			st1.push(temp);
		}


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
			fin.push(temp);
		}


//		System.out.println(fin.toString());
		return fin;
	}
}