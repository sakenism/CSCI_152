public class totest4 extends Union
{
	public static void main(String[] args)
	{
		Set<String> s1 = new LLQueueSet();
		Set<String> s2 = new LLQueueSet();
      s1.add("ftata");                    
      s1.add("a");
      s1.add("b");
      s1.add("sf");
      s1.add("riki");
      s1.add("bara");
                              		
		System.out.println(union(s1, s2));
	}
}

