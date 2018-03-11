public class totest3 extends IsSubset
{
	public static void main(String[] args)
	{
		Set<Integer> s1 = new LLQueueSet();
		Set<Integer> s2 = new LLQueueSet();

		s1.add(1);
		s1.add(11);
		s2.add(1112);
		s2.add(121);
		s2.add(1);
		System.out.println(isSubset(s1, s2));
	}
}