public class A
{
	public static void main(String[] args)
	{
		Clock sagat = new Clock();
		try
		{
			sagat.setMin(-56);
	  	}
	  	catch(Exception ex)
	  	{
			System.out.println("I've caught an exception\n" + ex.getMessage());	  	
	  	}
		try
		{
			sagat.setMin(21);
	  	}
	  	catch(Exception ex)
	  	{
			System.out.println("I've caught an exception\n" + ex.getMessage());	  	
	  	}
		try
		{
			sagat.setHours(85);
	  	}
	  	catch(Exception ex)
	  	{
			System.out.println("I've caught an exception\n" + ex.getMessage());	  	
	  	}

	}
}