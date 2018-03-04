public class MergeSort extends Merge
{
	public static Deque<Integer> mergeSort(Deque<Integer> d)
	{
		int sz = d.getSize(), hl = sz / 2;
//		System.out.println(d.toString() + " " + d.getSize());
		if(sz == 1)
		{
			return d;
		}
		else
		{
			Deque<Integer> d1 = new LinkedListDeque();
			Deque<Integer> d2 = new LinkedListDeque();
			for(int i = 1; i <= hl; i++)
			{
				try
				{
					d1.pushBack(d.popBack());
				}				
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
			}
			for(int i = 1; i <= sz - hl; i++)
			{
				try
				{
					d2.pushBack(d.popBack());
				}				
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
			}
			Deque<Integer> tmp1 = mergeSort(d1);
			Deque<Integer> tmp2 = mergeSort(d2);
			return merge(tmp1, tmp2);
		}
	}
}