import java.util.Arrays;
public class ArrayIntQueue implements IntQueue
{
	private int[] values;
	private int size, front, back;
	public ArrayIntQueue()
	{
		values = new int[5];
		size = 0;
		front = 0;
		back = 0;
	} 
	@Override
	public void enqueue(int num)
	{
		if(size == values.length)
		{
			int[] val = new int[values.length * 2];
			for(int l = 0, m = 0; l < size; l++, m = (m + 1) % values.length)
			{
				val[l] = values[m];
			}
			values = val;
			front = 0;
			back = size;
		}
		values[back] = num;
		back = (back + 1) % values.length;
		size++;
	}

	@Override
	public int front()
	{
		return values[size - 1];	
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
			return values[size];			
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
	}  
	@Override
	public String toString()
   {
   	for(int i = 0; i < size; i++)
   	{
   		System.out.println(values[i]);
   	}
   	return "Size of the stack is " + size;
   }
}