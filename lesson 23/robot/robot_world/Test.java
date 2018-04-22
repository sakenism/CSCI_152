public class Test extends LinkedListStack
{
	public static void main(String[] args) 
	{
		Stack<Integer> q = new ArrayStack();
		try
		{
			System.out.println(q.pop());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		for(int i = 1; i <= 12; i++)
			q.push(i);
		try
		{
			System.out.println(q.pop());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		q.clear();
		System.out.println(q.toString());

		for(int i = 1; i <= 22; i++)
			q.push(i);
		System.out.println(q.toString());
	}
}