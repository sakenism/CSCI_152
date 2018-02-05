//package a;
public class AutoTest
{
	public static void main(String[] args)
	{
		Automobile car = new Automobile("dnshakj");
		//car.startCar();
		try
		{
			car.pressGas();
		}	
		catch(Exception ex)
		{
			System.out.println("I've caught an exception\n" + ex.getMessage());		
		}

		System.out.println(car);
		car.pressBreak();
		System.out.print(car);

//		System.out.printf("%f", getSpeed());
	}
}