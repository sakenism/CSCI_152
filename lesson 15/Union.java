public class Union
{
	public static Set<String> union(Set<String> s1, Set<String> s2)
	{
		Set<String> tmp1 = s1;
		Set<String> fin = s2;
		while(s1.getSize() != 0)
		{
			try
			{
				String tm = tmp1.removeAny();
				fin.add(tm);
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		return fin;


	}
}