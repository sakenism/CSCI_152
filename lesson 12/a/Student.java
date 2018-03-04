public class Student implements Comparable 
{
	private Integer id;
	private String name;
	public Student(String name, int id)
	{
		this.id = id;
		this.name = name;
	}
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public int compareTo(Object student)
	{
		Student s = (Student) student;
//		return name.compareTo(s.getName());
		return id.compareTo(s.getId());
	}

	public String toString()
	{
		String res = "";
		res += this.name + ',' + this.id;
		return res;
	}


}