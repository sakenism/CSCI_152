public class test2 extends IsBalanced
{
	public static void main(String[] args)
	{
		Queue<Character> q = new LinkedListQueue();
		q.enqueue('{');
		q.enqueue('(');
		
		q.enqueue('[');

		q.enqueue(']');

		q.enqueue('}');
		q.enqueue(')');


		System.out.println(q.toString());


		System.out.println(isBalanced(q));

		System.out.println(q.toString());


	}
}