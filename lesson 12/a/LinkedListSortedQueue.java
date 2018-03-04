public class LinkedListSortedQueue<T extends Comparable>  implements SortedQueue<T>
{
	private Node<T> front;
	private int size;
	public LinkedListSortedQueue()
	{
		front = null;
		size = 0;	
	}
	@Override
	public void insert(T value)
	{
		Node<T> newNode = new Node(value);
		if(size == 0)
		{
			front = newNode;
		}
		else
		{
			if(value.compareTo(front.getValue()) <= 0)
			{
				newNode.setLink(front);
				front = newNode;
			}
			else 
			{
				
				Node<T> src = front;
				while(true)
				{
					if(src.getLink() == null)
					{
						src.setLink(newNode);
						break;    
					}
					else
					{
						Node<T> tmp = src.getLink();
						if(value.compareTo(tmp.getValue()) > 0)
						{
							src = tmp;
						}
						else
						{
							src.setLink(newNode);
							newNode.setLink(tmp);
							break;
						}			
					}
				}
			}
		}
		size++;
	}

	@Override
    public T dequeue() throws Exception {
        if (size <= 0)
            throw new Exception("Queue is empty");
        T result = front.getValue();
        front = front.getLink();
        size--; 
        return result;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void clear() {
        front = null;
        size = 0;
    }

    @Override
    public String toString() {
        String res = "";
        Node<T> tmp = this.front;
        boolean first = true;
        while (tmp != null) {
            if (!first) {
                res += ", ";
            } else
                first = false;
            res += tmp.getValue().toString();
            tmp = tmp.getLink();
        }
        return "[" + res + "]";
    }


}                
