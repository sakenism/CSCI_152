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