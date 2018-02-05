public class Cat extends AnimalImpl
{
/*	public Tiger()
	{
		name = "Tigerrr";
		age = 3;
	}
	super(name);     */
	//name = "TIGERRR";
	public Cat(String name)
	{
		super();
		super.setName(name);
	}

	public String animalKind()
	{
		return name;
	}
		
   
	public String toString()
	{
		return "The name of the mini-tiger " + animalKind() + " and age is " + getAge();
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