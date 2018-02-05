public class AnimalImpl implements Animal
{
	private int age;
	private boolean status;
	private int maxAge;
	private String name;
	private String foodPos;
	   /*
	public AnimalImpl(String name, boolean status, int maxAge, int age, String foodPos)
	{
		this.name = name;
		this.status = status;
				
	}     */
	public void setMaxAge(int q)
	{
		maxAge = q;
	}
	public void setFood(String a)
	{
		foodPos = a;
	}
	public void setAge(int a)
	{
		age = a;
		status = true;
		if(age > maxAge)
			status = false;
	}
	public void setName(String nam)
	{
		name = nam;
	}
	@Override
	public String animalKind()
	{
		return name;
	}
	@Override
	public int getAge()
	{
		return age;
	}
	@Override
	public boolean canEat(String food)
	{
		if(food.equals(foodPos))
			return true;
		return false;	
	}
	@Override
	public String feed(String food)
	{
		if(canEat(food))
		{
			return "TY";
		}
		else
		{
			return "I dont eat this";
		}
	}
	@Override
	public void ageOneYear() throws Exception
	{
		if(status == false)
			throw new Exception("The animal is dead");
		else
			age++;
		if(age >= maxAge)
			status = false;
	}
	@Override
	public boolean isAlive()
	{
		return status;
	}
	@Override
	public String toString()
	{
	
		return "The name of the animal " + name + " age is " + age;
	}
}