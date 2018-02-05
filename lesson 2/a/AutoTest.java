//package a;
public class AutoTest
{
	public static void main(String[] args)
	{
		Automobile car = new Automobile("dnshakj");
		car.startCar();
		car.pressGas();
		car.pressGas();
		System.out.println(car);
		car.pressBreak();
		System.out.print(car);

//		System.out.printf("%f", getSpeed());
	}
}