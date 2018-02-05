//package a;
public class Automobile
{
	private double speed;
	private String license;
	private boolean engineRunning;
	public Automobile(String a)
	{
		speed = 0.0;
		engineRunning = false;
		license = a;
	}
	public void startCar()
	{
		engineRunning = true;
	}
	public void pressGas()
	{
		if(engineRunning)
			speed = speed + 10.0;	
	}
	public void pressBreak()
	{
		speed = 0.0;
	}
	public void shutdown()
	{
		engineRunning = false;
	}
	public boolean isEngineRunning()
	{
		return engineRunning;
	}
	public double getSpeed()
	{
		return speed;
	}  
	public double calc(double time) 
	{
		return time * speed;
	}
	public String toString()
	{
		return "License of the car: " + license + " Engine running: " + engineRunning + " Speed: " + speed;
	}
}