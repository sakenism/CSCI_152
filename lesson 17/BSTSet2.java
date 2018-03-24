public class BSTSet<T extends Comparable> implements Set<T>
{
	private TreeNode<T> root;
	private int size;
	public BSTSet()
	{
		size = 0;
		root = null;
	}

	@Override
	public void add(T value)
	{  	
	   if(size == 0)
	   {
			TreeNode<T> tmp = new TreeNode(value);
			root = tmp;
	   }
	  	
		else
		{
			addHelper(root, value);
		}
		size++;
	}
                    
	@Override
	public boolean contains(T value)
	{
		return dfs(root, value);					
	}
	@Override
	public boolean remove(T value)
	{
		if(!(contains(value)))
			return false;
	
		else
		{
			size--;
			removeHelper(root, value);	
			return true;
	  	}
	}

	@Override 
	public T removeAny() throws Exception
	{
		if(size == 0)
		{
			throw new Exception("Tree is empty");
		}
		else
		{
			if(size == 1)
			{
				T tmp = root.getValue();
				clear();
				return tmp; 
			}            
			else
			{
				T tmp;
				if(root.getLeft() != null)
				{
					tmp = root.getLeft().getValue();
					remove(tmp);

				}
				else
				{
					tmp = root.getRight().getValue();
					remove(tmp);
				}
				return tmp;      
			}
		}
	}

	@Override
	public int getSize()
	{
		return this.size;	
	}

	@Override
	public void clear()
	{
		root = null;
		size = 0;
	}

	@Override
	public String toString()
	{
		return toStringHelper(root);
	}
	private boolean dfs(TreeNode<T> node, T value)
	{
		if(node == null)	
			return false;
	  	else if(value == node.getValue())
	  	{
	  		if(node.getStatus() == true)
		  		return true;
	   	else
	   		return false;
	   }
		else if(value.compareTo(node.getValue()) < 0)
	  		return dfs(node.getLeft(), value);
	
	  	else //if(value.compareTo(node.getValue()) > 0)
	  		return dfs(node.getRight(), value);

	}
	private String toStringHelper(TreeNode<T> node)
	{
		if(node == null)
			return " ";

	  	return toStringHelper(node.getLeft()) + node.getValue() + toStringHelper(node.getRight());
	}




	public void addHelper(TreeNode<T> node, T value)
	{
		if(value.compareTo(node.getValue()) == 0)
		{
			node.setStatus(true);
			return;
		}
		//to the left
		if(value.compareTo(node.getValue()) < 0)
		{
			if(node.getLeft() == null)
			{
				TreeNode<T> tmp = new TreeNode(value);
				node.setLeft(tmp);
			}
			else
			{
				if(value.compareTo(node.getLeft().getValue()) > 0)
				{
					TreeNode<T> tmp = new TreeNode(value);
					tmp.setLeft(node.getLeft());
					node.setLeft(tmp);
				}
				else
				{
					addHelper(node.getLeft(), value);
				}
			}
		}


		// to the right
		if(value.compareTo(node.getValue()) > 0)
		{
			if(node.getRight() == null)
			{
				TreeNode<T> tmp = new TreeNode(value);
				node.setRight(tmp);
			}
			else
			{
				if(value.compareTo(node.getLeft().getValue()) < 0)
				{
					TreeNode<T> tmp = new TreeNode(value);
					tmp.setRight(node.getRight());
					node.setRight(tmp);
				}
				else
				{
					addHelper(node.getRight(), value);
				}
			}
		}
	}

	public void removeHelper(TreeNode<T> node, T value)
	{            
		if(value.compareTo(node.getValue()) > 0)
			removeHelper(node.getRight(), value)
		else if(value.compareTo(node.getValue()) < 0)
			removeHelper(node.getLeft(), value)
	  	else
	  		node.setStatus(false);

	}


}


   
