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
                    


/*

public class Student implements Comparable 
	public int compareTo(Object student)
	{
		Student s = (Student) student;
		return id.compareTo(s.getId());
	}


}*/
	@Override
	public boolean contains(T value)
	{
		return dfs(root, value);					
	}
	@Override
	public boolean remove(T value)
	{
		throw new UnsupportedOperationException("Not supported yet");
	}

	@Override 
	public T removeAny()
	{
		throw new UnsupportedOperationException("Not supported yet");
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
	  		return true;
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
			return;

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



}


   
