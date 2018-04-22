public class test
{
	public static void main(String[] args) 
	{
       TowerOfHanoi t = new TowerOfHanoi(3);
       int discs = 3;
       t.solve(discs, 0, 1, 2);
   }
   
}
