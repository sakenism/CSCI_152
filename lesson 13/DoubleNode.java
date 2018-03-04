public class DoubleNode<T>
{
    private T value;      
    private DoubleNode<T> next;

    private DoubleNode<T> prev;

    public DoubleNode(T val)
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
    public DoubleNode<T> getNext()
    {
        return this.next;
    }

    public void setNext(DoubleNode<T> link)
    {
        this.next = link;
    }


    public DoubleNode<T> getPrev()
    {
        return this.prev;
    }

    public void setPrev(DoubleNode<T> link)
    {
        this.prev = link;
    }


    public String toString()
    {
        return value.toString();
    }
}