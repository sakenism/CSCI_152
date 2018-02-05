public class Test
{
	public static void main(String[] args)
	{
		Tiger tiger = new Tiger();
		Cow cow = new Cow();
		Cat cat = new Cat();
		tiger.setName("Tigerrrr!");
		cow.setName("Yerma");
		cow.setMaxAge(5);
		cow.setAge(6);
		try
		{
			cow.ageOneYear();
	  	}
	  	catch(Exception ex)
	  	{
			System.out.println(ex.getMessage());	  		
	  	}
//		tiger.setName("S");	
		System.out.println(cow.isAlive());
		System.out.println(cow.toString());
		cat.setFood("Korm");
		System.out.println(cat.feed("Korm"));
	}
}