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

	/**
	* @throws an exception is thrown if engine is off and speed is to be increased
	*/
	public void pressGas() throws Exception
	{
		if(engineRunning)
			speed = speed + 10.0;	
	  	else
	  	{
			throw new Exception("Engine is off");  		
	  	}
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

	/**
	  @return Current speed of the car is returned
	*/
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