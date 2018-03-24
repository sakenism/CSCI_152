
public class TreeNode<T> 
{
    private T value;
    private boolean status;
    private TreeNode<T> left;
    private TreeNode<T> right;
    
    public TreeNode(T val) {
        value = val;
        left = null;
        status = true;
        right = null;
    }
    
    public T getValue() 
    {
        return value;
    }

    public void setValue(T value) 
    {
        this.value = value;
    }

    public TreeNode<T> getLeft() 
    {
        return left;
    }

    public void setLeft(TreeNode<T> left) 
    {
        this.left = left;
    }

    public TreeNode<T> getRight() 
    {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public boolean getStatus()
    {
    	return this.status;
    }
    public void setStatus(boolean b)
    {
    	this.status = b;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
