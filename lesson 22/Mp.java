public interface Mp<K, V>
{

	public void add(KeyValuePair<K,V> value);

	public boolean contains(K value);

	public boolean remove(K value);

	public V removeAny() throws Exception;

	public int getSize();

	public void clear();

	public String toString();


}