public class A
{
	public static void main(String[] args)
	{
		Clock sagat = new Clock(1, 23, 45);
		System.out.println(sagat);
		sagat.setTime(23, 59, 59);
		sagat.tick();
		System.out.print(sagat);
	}
}