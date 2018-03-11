public class Intersection 
{
	public static Set<String> intersection(Set<String> set1, Set<String> set2)
	{
		Set<String> q = set1;
		Set<String> fin = new LLQueueSet();

		while(q.getSize() != 0)
		{
			try
			{
				String tmp = q.removeAny();
				if(set2.contains(tmp))
					fin.add(tmp);
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		return fin;		
	}
}