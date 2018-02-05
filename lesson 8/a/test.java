import Interfaces.IntQueue;
import Interfaces.IntStack;

public class test extends IsPalindrome
{
	public static void main(String[] args)
	{  
		ArrayIntQueue q = new ArrayIntQueue();
	

		for(int i = 7; i <= 22; i++)
		{
			q.enqueue(i);
		}
		for(int i = 22; i >= 7; i--)
		{
			q.enqueue(i);
		}
		//System.out.println(q.toString());
		try
		{
			System.out.println(isPalindrome(q));
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}