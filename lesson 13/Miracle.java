public class Miracle extends MergeSort
{
	public static void main(String[] args)
	{
		Deque<Integer> dq = new LinkedListDeque();

		dq.pushBack(7);

		dq.pushBack(2);

		dq.pushBack(4);

		dq.pushBack(15);


		dq.pushBack(3);
		


		Deque<Integer> f = mergeSort(dq);
		System.out.println(f.toString());
		

	}
}