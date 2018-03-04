public interface Deque<T>
{

	public void pushFront(T value);


	public void pushBack(T value);



	public T popFront() throws Exception;
                         

	public T popBack() throws Exception;


	public int getSize();

	public void clear();


	public String toString();

}