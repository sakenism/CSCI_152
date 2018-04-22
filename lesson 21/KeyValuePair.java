public class KeyValuePair<K, V>
{

	private K key;
	private V val;
	public KeyValuePair(K key, V val)
	{
		this.key = key;
		this.val = val;
	}
	public K getKey()
	{
		return this.key;
	}
	public void setKey(K key)
	{
		this.key = key;
	}
	public V getValue()
	{
		return this.val;
	}
	public void setValue(V val)
	{
		this.val = val;
	}
	@Override
	public String toString()
	{
		return "<" + this.key + ", " + this.val + ">";
	}
}