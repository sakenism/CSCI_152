public class test2
{
	public static void main(String[] args)
	{
		Set<Student> q = new BSTSet();
		q.add(new Student("Saken", 5)); 
		q.add(new Student("qwe", 12));
		q.add(new Student("asd", 3));
		q.add(new Student("qwe", 6));
		q.add(new Student("asd", 14));
		q.add(new Student("qwe", 2));
		q.add(new Student("asd", -6));
		q.add(new Student("qwe", 8));
		q.add(new Student("asd", 0));
		System.out.println(q.toString());



		q.add(new Student("qwe", 14));

		q.add(new Student("asd", -6));

		q.add(new Student("qwe", 5));
		System.out.println(q.toString());
	
		System.out.println(q.contains(new Student("asd", 12)));
		System.out.println(q.contains(new Student("qwe", 7)));
		System.out.println(q.contains(new Student("asd", 2)));
		System.out.println(q.contains(new Student("qwe", -8)));
		System.out.println(q.contains(new Student("asd", 5)));
		q.clear();
		System.out.println(q.toString());
		q.add(new Student("qwe", 55));	
		q.add(new Student("asd", 24));
		q.add(new Student("qwe", 78));
		q.add(new Student("asd", 51));
		System.out.println(q.toString() + " " + q.getSize());
	}
}