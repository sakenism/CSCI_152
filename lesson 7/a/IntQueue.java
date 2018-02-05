public interface IntQueue
{
	public void enqueue(int num);

	public int front();

	public int dequeue() throws Exception;

	public int getSize();

	public void clear();

	public String toString();

}