public class Test2 extends IsIncreasing
{
	public static void main(String[] args)
	{
		Stack<Double> st = new ArrayStack();
		for(int i = 1; i <= 12; i++)
		{
			st.push((double)(i) + 0.5);
		}	
		st.push(12.5);
		System.out.println(st.toString());
		try
		{
			System.out.println(isIncreasing(st));
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}