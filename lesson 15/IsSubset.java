public class IsSubset 
{
	public static boolean isSubset(Set<Integer> set1, Set<Integer> set2)
	{
		Set<Integer> q = set1;
		while(set1.getSize() != 0)
		{
			try
			{
				int tmp = q.removeAny();
				if(!set2.contains(tmp))
				return false;
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		return true;		
	}
}