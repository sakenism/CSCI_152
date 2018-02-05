public class Iphone extends AppleDevices
{
	private String model;
	public Iphone(String model, int charge)
	{
		super(charge);
		this.model = model;
	}
	public void isItApple()
	{
		System.out.println("Yes, it is an Iphone");
	}
	public String toString() 
	{
		return "The Iphone is charged for " + getCharge();	
	}
}