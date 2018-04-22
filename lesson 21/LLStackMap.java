public class LLStackMap<K extends Comparable, V> implements Map<K, V>
{
	private LinkedListStack<KeyValuePair<K, V> > pairs;
	public LLStackMap()
	{
		pairs = new LinkedListStack();
	}
	@Override 
	public void define(K key, V val)
	{
		LinkedListStack<KeyValuePair<K, V> > temp = new LinkedListStack<KeyValuePair<K, V>>();
		KeyValuePair<K, V> tmp = new KeyValuePair(key, val);
		int sz = pairs.getSize();
		if(getValue(key) != null)
		{
			for(int i = 1; i <= sz; i++)
			{
				try
				{
					tmp = pairs.pop();
					if(tmp.getKey() == key)
						tmp.setValue(val);
					temp.push(tmp);
				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
			}
			for(int i = 1; i <= sz; i++)
			{
				try
				{
					pairs.push(temp.pop());
				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
			}
			
		}
		else
		{	
			pairs.push(tmp);
		}
	}

	@Override 
	public V getValue(K key)
	{
		LinkedListStack<KeyValuePair<K, V> > temp = new LinkedListStack<KeyValuePair<K, V>>();
		int sz = pairs.getSize();
		for(int i = 1; i <= sz; i++)
		{
			try
			{
				KeyValuePair<K, V> tmp = pairs.pop();
				temp.push(tmp);
				if(tmp.getKey().equals(key))
				{
					while(temp.getSize() != 0)
					{
						pairs.push(temp.pop());
					}
					return tmp.getValue();
				}
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			
		}
		try
		{
			while(temp.getSize() != 0)
			{
				pairs.push(temp.pop());
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return null;
	}

	@Override
	public V remove(K key)
	{
		LinkedListStack<KeyValuePair<K, V> > temp = new LinkedListStack<KeyValuePair<K, V>>();
		int sz = pairs.getSize();
		for(int i = 1; i <= sz; i++)
		{
			try
			{
				KeyValuePair<K, V> tmp = pairs.pop();
				
				if(tmp.getKey().equals(key))
				{
					while(temp.getSize() != 0)
					{
						pairs.push(temp.pop());
					}
					return tmp.getValue();
				}
				temp.push(tmp);
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			
		}
		try
		{
			while(temp.getSize() != 0)
			{
				pairs.push(temp.pop());
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
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
				return pairs.pop();
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