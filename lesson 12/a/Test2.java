public class Test2 
{
	public static void main(String[] args)
	{
		SortedQueue<Student> q = new LinkedListSortedQueue();
		Student Yerma = new Student("Yerma", 201512121);
		Student Saksh = new Student("Saksh", 2015457213);
		Student Zhuma = new Student("Zhuma", 54156465);
		Student Zhanbo = new Student("Janbo", 24412121);
		
		
		q.insert(Yerma);
		q.insert(Zhuma);
		q.insert(Zhanbo);

		q.insert(Saksh);
		System.out.println(q.toString() + " " + q.getSize());
	}
}