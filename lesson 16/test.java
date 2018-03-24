public class test
{
	public static void main(String[] args)
	{
		Set<Integer> q = new BSTSet();
		q.add(5); 
		q.add(12);
		q.add(3);
		q.add(6);
		q.add(14);
		q.add(2);
		q.add(-6);
		q.add(8);
		q.add(0);
		System.out.println(q.toString());



		q.add(14);

		q.add(-6);

		q.add(5);
		System.out.println(q.toString());
	
		System.out.println(q.contains(12));
		System.out.println(q.contains(7));
		System.out.println(q.contains(2));
		System.out.println(q.contains(-8));
		System.out.println(q.contains(5));
		q.clear();
		System.out.println(q.toString());
		q.add(55);	
		q.add(24);
		q.add(78);
		q.add(51);
		System.out.println(q.toString() + " " + q.getSize());
		
	}
}