public interface Map<K, V>
{
	public void define(K key, V val);

	public V getValue(K key);

	public V remove(K key);

	public KeyValuePair<K, V> removeAny() throws Exception;

	public int getSize();

	public void clear();

	@Override
	public String toString();  
}