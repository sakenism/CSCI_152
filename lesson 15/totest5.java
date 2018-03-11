public class totest5 extends Intersection
{
	public static void main(String[] args)
	{
		Set<String> s1 = new LLQueueSet();
		Set<String> s2 = new LLQueueSet();

		s1.add("a");
		s1.add("b");
		s1.add("c");
		s2.add("a");
		s2.add("c");
		System.out.println(intersection(s1, s2));
	}
}