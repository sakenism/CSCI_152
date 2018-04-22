public class IsIncreasing
{
	public static boolean isIncreasing(Stack<Double> sto) throws Exception
	{
		Stack<Double> tmp = new ArrayStack();
		boolean ans = true;
		int sz = sto.getSize();
		for(int i = 1; i <= sz; i++)	
		{
			double temp = sto.pop();
			if(tmp.getSize() != 0)
			{
				if(temp > tmp.top())
					ans = false;
			}
			tmp.push(temp);
		}
		for(int i = 1; i <= sz; i++)
		{
			sto.push(tmp.pop());
		}
		return ans;
	}
}