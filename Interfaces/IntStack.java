package Interfaces;

public interface IntStack
{
	public void push(int value);

	public int pop() throws Exception;

	public int top() throws Exception;
	
	public int getSize();

	public void clear();

	public String toString();
}