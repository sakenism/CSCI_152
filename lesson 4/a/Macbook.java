public class Macbook extends AppleDevices
{
	private String model;
	public Macbook(String model, int charge)
	{
		super(charge);
		this.model = model;
	}                                 
	
	
	public void isItApple()
	{
		System.out.println("Yes, it is a Mac");
	}
	
	public String toString() 
	{
		return "The Mac is charged for " + getCharge();	
	}
}