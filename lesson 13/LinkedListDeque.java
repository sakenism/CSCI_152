public class LinkedListDeque<T> implements Deque<T>
{
	private DoubleNode<T> front;
	private DoubleNode<T> back;	
	private int size;
	public LinkedListDeque()
	{
		front = null;
		back = null;
		size = 0;
	}                            

	@Override
	public void pushFront(T value)
	{
		DoubleNode<T> newNode = new DoubleNode(value);
		if(size == 0)
		{
			front = newNode;
			back = newNode;
		}
		else
		{
			newNode.setNext(front);  
			front.setPrev(newNode);
			front = newNode;
	  	}
	  	size++;
	}

	@Override
	public void pushBack(T value)
	{  
		DoubleNode<T> newNode = new DoubleNode(value);
	   if(size == 0)
	   {
	   	back = newNode;
			front = newNode;
	   }
		else
		{
			back.setNext(newNode);
			newNode.setPrev(back);
			back = newNode;	
		}	
		size++;
	}

	@Override
	public T popFront() throws Exception
	{
		if(size == 0)
		{
			throw new Exception("Deque is empty");	
		}

		if(size == 1)
		{
			T vl = front.getValue();
			front = null;
			back = null;
		   size--;
			return vl;

		}
		else
		{
			size--;   
			T vl = front.getValue();
			front = front.getNext();
			front.setPrev(null);
			return vl;

		}
	}
	@Override
	public T popBack() throws Exception
	{
		if(size == 0)
		{
			throw new Exception("Deque is empty");	
		}

		if(size == 1)
		{
			T vl = back.getValue();
			front = null;
			size--;
			back = null;
			return vl;
		}

		else
		{
			size--;
			T vl = back.getValue();
			back = back.getPrev();
			back.setNext(null);
			return vl;	
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
		front = null;
		back = null;
		size = 0;
	}



    @Override
    public String toString() {
        String res = "";
        DoubleNode<T> tmp = this.front;
        boolean first = true;
        while (tmp != null) {
            if (!first) 
                res += ", ";
            else
                first = false;
            res += tmp.getValue().toString();
            tmp = tmp.getNext();
        }
        return "[" + res + "]";
    }


}