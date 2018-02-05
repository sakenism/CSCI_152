public class Test
{
	public static void main(String[] args)
	{
		Iphone pyats = new Iphone("pyats", 49);
		System.out.println(pyats);
		pyats.isItApple();
		
		Ipad mini = new Ipad("mini", 49);
		System.out.println(mini);
		mini.isItApple();
		Macbook pro = new Macbook("pro", 49);
		System.out.println(pro);
		pro.isItApple();
		AppleDevices smth = new AppleDevices(33);
		System.out.println(smth);
		smth.isItApple();

	}
}