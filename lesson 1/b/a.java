import java.util.Scanner;
public class a
{
	public static void main(String[] args)
	{
		double r, pi = 3.1415926;
		Scanner in = new Scanner(System.in);
		r = in.nextDouble();
		System.out.printf("Area is %f, and circumference is %f", pi * r * r, 2 * pi * r);
		                                      
	}
}