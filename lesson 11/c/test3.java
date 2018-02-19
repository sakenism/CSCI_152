public class test3 extends IsPalindrome
{
	public static void main(String[] args)
	{
		Queue<Character> q = new LinkedListQueue();	
		q.enqueue('A');
		q.enqueue('B');
		q.enqueue('B');
		q.enqueue('C');
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