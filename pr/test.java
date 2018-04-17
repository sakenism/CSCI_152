public class test
{
	public static void main(String[] args)
	{
		int nd = 2;
		Book b = new Book("Bentley, Jon", "Programming pearls", 2000, "9780201657883", "Addison-Wesley", "QA76.6 .B453 2000", 8, nd);
		BSTSet2<Book> n = new BSTSet2();
		n.add(b);
		Book a = new Book("Gustafsson, Fredrik", "Matlab for engineers explained", 2003, "9781852336974", "Springer", "TA345 .G878 2003", 20, nd);
		Book c = new Book("Craig, John J.", "Introduction to robotics:Mechanics and control", 2005, "9780131236295", "Springer", "TJ211   .C67 2005", 1, nd);
		n.add(a);
		n.add(c);
		
		Book cc = new Book("Craig, John J.", "Introduction to robotics:Mechanics and control", 2005, "9780131236295", "Pearson Education", "TJ211   .C67 2005", 2, nd);
		n.add(cc);
		n.remove(c);

		System.out.print(n.toString() + " @@@ " + n.getSize());
	}
}