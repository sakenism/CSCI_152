import CSCI_152.Interfaces.IntQueue;
import CSCI_152.Interfaces.IntStack;

import java.util.Arrays;
public class ArrayIntQueue implements IntQueue
{
	private int[] values;
	private int size, front = 0;
	public ArrayIntQueue()
	{
		values = new int[5];
		size = 0;
	} 
	@Override
	public void enqueue(int num)
	{
		if(size == values.length)
		{
			values = Arrays.copyOf(values, size * 2);
		}
		if(size == 0)
		{
			front = 0;
		}
		values[size] = num;
		size++;	
	}

	@Override
	public int getFront()
	{
		return values[front];	
	}

	@Override
	public int dequeue() throws Exception
	{
		if(size == 0)	
		{
			throw new Exception("KETCH, ESEK!");
		}
		else
		{
			size--;
			front++;
			return values[front - 1];
		}
	}
	@Override
	public int getSize()
	{
	   return size;
		
	}
	@Override
	public void clear()
	{
		size = 0;
		front = 0;	
	}  
	@Override
	public String toString()
   {
   	System.out.println("front");
   	for(int i = front; i < size; i++)
   	{
   		System.out.println(values[i]);
   	}

   	System.out.println("back");
   	return "Size of the queue is " + size;
   }
}