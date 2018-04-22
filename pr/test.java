import java.util.*;
public class test
{
	public static void main(String[] args)
	{
		int nd = 2;
		Book b = new Book("Bentley Jon", "Programming pearls", "2000", "9780201657883", "Addison-Wesley", "QA76.6 .B453 2000", "8", nd);
		BSTSet2<Book> n = new BSTSet2();
		Book a = new Book("Gchasl", "Matlab for engineers explained", "2003", "9781852336974", "Springer", "TA345 .G878 2003", "20", nd);
		Book c = new Book("Csacxas", "Introduction to robotics:Mechanics and control", "2005", "9780131236295", "Springer", "TJ211   .C67 2005", "1", nd);
		


		n.add(a);
		n.add(c);
		n.add(b);
		//n.remove(c);
		
		ArrayList<ArrayList<String>> q = new ArrayList<ArrayList<String>>();
		q = n.toStr();
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 7; j++)
				System.out.print(q.get(i).get(j) + ';');
			System.out.print('\n');
		}

		
		//System.out.println(q);
		//q.remove();
		//System.out.print(q.get(0).toString() + '\n');
		
		//System.out.print(q.get(1).toString() + '\n');
		//ArrayList<ArrayList<String>> q =  new ArrayList<ArrayList<String>>();
	}
}