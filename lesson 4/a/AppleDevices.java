public class AppleDevices
{    
	
	private int license;
	private int charge;
	private boolean security;
	public AppleDevices(int n)
	{
		license = n;
		security = true;
		charge = 13;		
	}
	public void isItApple()
	{
		System.out.println("Yes, I have an apple");		
	}
	public void charge()
	{
		charge++;
		System.out.println("Pip");		
	}
	/**
	  @return returns the current charge
	*/
	public int getCharge()
	{
		return charge;
	}
	public void jailBreak()
	{
		security = false;	
		System.out.println("The device is cracked");
	}
	public String toString()
	{
		return "Device is charged for " + charge;
	}
}
