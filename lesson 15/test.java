public class test
{
	public static void main(String[] args)
	{
		Set<Student> st = new LLQueueSet();
		                
		st.add(new Student("Bob", 1231));
		st.add(new Student("Bob", 1231));
		st.add(new Student("Bob", 1231));		
		try
		{
			System.out.println(st.removeAny());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

		System.out.println(st.toString());		
	}
}