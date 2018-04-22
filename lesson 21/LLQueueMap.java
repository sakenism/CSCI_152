public class LLQueueMap<K extends Comparable, V> implements Map<K, V>
{
	private LinkedListQueue<KeyValuePair<K, V> > pairs;
	public LLQueueMap()
	{
		pairs = new LinkedListQueue();
	}
	@Override 
	public void define(K key, V val)
	{
		KeyValuePair<K, V> tmp = new KeyValuePair(key, val);
		int sz = pairs.getSize();
		if(getValue(key) != null)
		{
			try
			{
				for(int i = 1; i <= sz; i++)
				{
					KeyValuePair<K, V> tm = pairs.dequeue();
					if(tm.getKey() == key)
						tm.setValue(val);
					pairs.enqueue(tm);
				}
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		else
		{
			pairs.enqueue(tmp);
		}
	}

	@Override 
	public V getValue(K key)
	{
		int sz = pairs.getSize();
		for(int i = 1; i <= sz; i++)
		{
			try
			{
				KeyValuePair<K, V> tmp = pairs.dequeue();
				pairs.enqueue(tmp);
				if(tmp.getKey().equals(key))
					return tmp.getValue();
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			
		}
		return null;
	}

	@Override
	public V remove(K key)
	{
		int sz = pairs.getSize();
		for(int i = 1; i <= sz; i++)
		{
			try
			{
				KeyValuePair<K, V> tmp = pairs.dequeue();
				if(tmp.getKey().equals(key))
					return tmp.getValue();
				pairs.enqueue(tmp);
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			
		}
		return null;
	}

	@Override
	public KeyValuePair<K, V> removeAny() throws Exception
	{
			if(pairs.getSize() == 0)
			{
				throw new Exception("nothing in map");
			}
			else
			{
				return pairs.dequeue();
			}
	}

	@Override
	public int getSize()
	{
		return pairs.getSize();
	}

	@Override
	public void clear()
	{
		pairs.clear();
	}

	@Override
	public String toString()
	{
		return pairs.toString();
	}
}