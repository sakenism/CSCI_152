public class Node<T>
{
	private T value;
	private Node<T> link;
	public Node(T val)
	{
		this.value = val;
	}
	public T getValue()
	{
		return value;
	}
	public void setValue(T value)
	{
		this.value = value;	
	}
	public Node<T> getLink()
	{
		return link;
	}

	public void setLink(Node<T> link)
	{
		this.link = link;
	}
	public String toString()
	{
		return value.toString();
	}
}