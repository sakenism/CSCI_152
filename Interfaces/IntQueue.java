//package Interfaces;

public interface IntQueue
{
	public void enqueue(int num);

	public int getFront();

	public int dequeue() throws Exception;

	public int getSize();

	public void clear();

	public String toString();

}