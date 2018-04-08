public class test1
{
	public static void main(String[] args)
	{
		LLQHashTableSet<Student> set1 = new LLQHashTableSet(10); 

		for(int i = 100; i <= 299; i++)
		{
			Student tmp = new Student(i, "Bob");
			q.add(tmp);
		}
		//System.out.println(q.bucketToString());

	}
}