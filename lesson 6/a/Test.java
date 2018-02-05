public class Test
{
	public static void main(String[] args)
	{
		ArrayIntStack Yerma = new ArrayIntStack();
		for(int i = 0; i < 12; i++)
		{
			Yerma.push(i + 1);
		}
 		System.out.println(Yerma.toString());
		/*try
		{
			System.out.println(Yerma.top());
		}
		catch(Exception ex)	
		{
			System.out.println(ex.getMessage());
		}*/                                   
      for(int i = 0; i < 7; i++)
      {   
			try
			{
				System.out.println(Yerma.pop());
			}
			catch(Exception ex)	
			{
				System.out.println(ex.getMessage());
			}
		}
		System.out.println(Yerma.toString());
		Yerma.clear();
		System.out.println(Yerma.toString());
		for(int i = 0; i < 22; i++)
		{
			Yerma.push(i * 2);
		}
		System.out.println(Yerma.toString());
	}
}
// 0 1 2 3 4
// 1 2 3 4 5