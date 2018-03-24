public interface Set<T>
{

	public void add(T value);

	public boolean contains(T value);

	public boolean remove(T value);

	public T removeAny() throws Exception;

	public int getSize();

	public void clear();

	public String toString();


}