public class test
{
	public static void main(String[] args)
	{
		LLStackMap<Integer, String> m = new LLStackMap();
		try
		{
			m.removeAny();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		m.define(3, "Saken");
	
		m.define(1, "Yerma");

		m.define(4, "Zhuma");
		
		m.define(35, "Max");
		
		m.define(9, "Zhanbo");

		System.out.println(m.toString());
		System.out.println(m.remove(9));
		System.out.println(m.toString());

		System.out.println(m.remove(0));
		
		m.define(30, "Aliba");
		m.define(30, "Alibek");
		System.out.println(m.toString());
		try
		{
			System.out.println(m.removeAny());
			System.out.println(m.removeAny());
		}
		catch(Exception ex)
		{
			System.out.print(ex.getMessage() + "\n");
		}
		System.out.println(m.toString());
		
		m.define(1, "Tl");
		System.out.println(m.toString());
		
		System.out.println(m.getValue(1));

	}
}