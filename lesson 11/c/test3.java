public class test3 extends IsPalindrome
{
	public static void main(String[] args)
	{
		Queue<Character> q = new LinkedListQueue();	
		q.enqueue('a');
		q.enqueue('b');
		q.enqueue('A');
		try
		{
			System.out.println(isPalindrome(q));
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println(q.toString());
	}
}