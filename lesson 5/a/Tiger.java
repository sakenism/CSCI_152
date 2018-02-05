public class Tiger extends AnimalImpl
{
	private String name;
	private int age;
/*	public Tiger()
	{
		name = "Tigerrr";
		age = 3;
	}
	super(name);     */
	//name = "TIGERRR";
	public void setName(String a)
	{
		name = "Tigerrr";
	}


	public String animalKind()
	{
		return name;
	}
	public void setAge()
	{
		age = 3;
	}

	public int getAge()
	{
		return age;
	}


	public String toString()
	{
		return "The name of the tiger " + animalKind() + " and age is " + getAge();
	}

}
                           /*
  public class Ipad extends AppleDevices
{
	private String model;
	public Ipad(String model, int charge)
	{
		super(charge);
		this.model = model;
	}
	public void isItApple()
	{
		System.out.println("Yes, it is an Ipad");
	}
	public String toString() 
	{
		return "The Ipad is charged for " + getCharge();	
	}
}





*/