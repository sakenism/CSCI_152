public class test
{
	public static void main(String[] args)
	{
		ArrayIntQueue Juma = new ArrayIntQueue();
		/*
		Juma.enqueue(1);
		
		try
		{
			Juma.dequeue();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());			
		}                                   

		*/
		try
		{
		
			System.out.println(Juma.dequeue());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		for(int i = 1; i <= 9; i++)
		{
			Juma.enqueue(i);

			Juma.enqueue(i * i);
	 	}
			try
			{
				System.out.println(Juma.dequeue());
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());			
			}                      
  	System.out.println(Juma.toString());
	}
}