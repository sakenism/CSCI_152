import java.util.*;
public class test20
{
	public static void main(String[] args)
	{
	LLQHashTableSet<Integer> s = new LLQHashTableSet(10);
	System.out.println("Commencing ...");
        long t1, t2, ans;
        t1 = System.currentTimeMillis(); 

        for(int i = 0; i <= 50000; i++)
        {
                Random rn = new Random();
        	s.add(i);
        }
        System.out.println(s.getLoadFactor() + "  " + s.getBucketSizeStandardDev());
        t2 = System.currentTimeMillis();
        ans = t2 - t1;

        System.out.println("Time: " + ans);
	}
}