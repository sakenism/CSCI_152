import java.util.Scanner;

public class a
{
	public static void main(String[] args)
	{
		int l, w, h;
		Scanner in = new Scanner(System.in);
		l = in.nextInt();	
		w = in.nextInt();
		h = in.nextInt();
		System.out.printf("Volume as %d and surface area is %d ", l * w * h, 2 * (l * w + w * h + l * h));
	}
}