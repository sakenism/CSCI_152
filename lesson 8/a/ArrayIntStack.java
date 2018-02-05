import Interfaces.IntQueue;
import Interfaces.IntStack;

import java.util.Arrays;
public class ArrayIntStack implements IntStack
{
	private int size;
	private int[] values;
	public ArrayIntStack()
	{
		values = new int[11];
		size = 0;
	}
	@Override 
	public void push(int value)
	{
		if(size == values.length)
		{
			values = Arrays.copyOf(values, size * 2);
		}
		values[size] = value;
		size++;
	}
	public int pop() throws Exception
	{
		if(size <= 0)
			throw new Exception("There is nothin in stack");
		else
		{                       	
			size--;
			int res = values[size]; 
	   	return res;
		}
	}
	public int top() throws Exception
	{
		if(size == 0)
			throw new Exception("There is nothin in stack");
		else
		{
	   	return values[size - 1];
		}
	}
   public int getSize()
   {
   	return size;
   }
   public void clear()
   {
   	size = 0;
   }
   public String toString()
   {
   	System.out.println("bot");
   	for(int i = 0; i < size; i++)
   	{
   		System.out.println(values[i]);
   	}

   	System.out.println("top");
   	return "Size of the stack is " + size;
   }

	/* 


	public void push(int value);

	public int pop() throws Exception;

	public int top();
	
	public int getSize();

	public void clear();

	public String toString();

	*/
}