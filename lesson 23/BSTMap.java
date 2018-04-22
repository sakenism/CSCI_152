public class BSTMap<K extends Comparable, V> implements Map<K, V> {

	private TreeNode<KeyValuePair<K,V>> root;
	private int size;
	
	public BSTMap() 
	{
		root = null;
		size = 0;
	}
	
	@Override
	public void define(K key, V value) 
	{
		KeyValuePair<K, V> t = new KeyValuePair(key, value);
	   if(size == 0)
	   {
			TreeNode<KeyValuePair<K, V>> tmp = new TreeNode(t);
			root = tmp;
	   }
	  	
		else
		{
			addHelper(root, t);
		}
		size++;
	}

	@Override
	public V getValue(K key) 
	{
		return dfs(root, key);
	}

	@Override
	public V remove(K key) 
	{
		if(getValue(key) == null)
			return null;
		else
		{
			size--;
			return removeHelper(key);
	  	}
	}

	@Override
	public KeyValuePair<K, V> removeAny() throws Exception 
	{
		if(size == 0)
		{
			throw new Exception("Tree is empty");
		}
		else
		{
			if(size == 1)
			{
				KeyValuePair<K, V> tmp = root.getValue();
				clear();
				return tmp; 
			}            
			else
			{
				K tmp;
				if(root.getLeft() != null)
				{
					tmp = root.getLeft().getValue().getKey();
					remove(tmp);

				}
				else
				{
					tmp = root.getRight().getValue().getKey();
					remove(tmp);
				}
				KeyValuePair<K, V> tq = new KeyValuePair(tmp, getValue(tmp));
				return tq;      
			}
		}
	}

	@Override
	public int getSize() 
	{
		return size; 
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



    private V dfs(TreeNode<KeyValuePair<K, V>> node, K value)
	{
		if(node == null)	
			return null;
	  	else if(value.compareTo(node.getValue().getKey()) == 0)
	  		return node.getValue().getValue();
	  	else if(value.compareTo(node.getValue().getKey()) < 0)
	  		return dfs(node.getLeft(), value);
	
	  	else //if(value.compareTo(node.getValue()) > 0)
	  		return dfs(node.getRight(), value);

	}
	private String toStringHelper(TreeNode<KeyValuePair<K, V>> node)
	{
		if(node == null)
			return " ";

	  	return toStringHelper(node.getLeft()) + node.getValue().getKey() + toStringHelper(node.getRight());
	}




	public void addHelper(TreeNode<KeyValuePair<K, V>> node, KeyValuePair<K,V> t)
	{
		if(t.getKey().compareTo(node.getValue().getKey()) == 0)
			return;

		//to the left
		if(t.getKey().compareTo(node.getValue().getKey()) < 0)
		{
			if(node.getLeft() == null)
			{
				TreeNode<KeyValuePair<K, V>> tmp = new TreeNode(t);
				node.setLeft(tmp);
			}
			else
			{
				if(t.getKey().compareTo(node.getLeft().getValue().getKey()) > 0)
				{
					TreeNode<KeyValuePair<K, V>> tmp = new TreeNode(t);
					tmp.setLeft(node.getLeft());
					node.setLeft(tmp);
				}
				else
				{
					addHelper(node.getLeft(), t);
				}
			}
		}


		// to the right
		if(t.getKey().compareTo(node.getValue().getKey()) > 0)
		{
			if(node.getRight() == null)
			{
				TreeNode<KeyValuePair<K, V>> tmp = new TreeNode(t);
				node.setRight(tmp);
			}
			else
			{
				if(t.getKey().compareTo(node.getLeft().getValue().getKey()) < 0)
				{
					TreeNode<KeyValuePair<K, V>> tmp = new TreeNode(t);
					tmp.setRight(node.getRight());
					node.setRight(tmp);
				}
				else
				{
					addHelper(node.getRight(), t);
				}
			}
		}
	}

	public TreeNode<KeyValuePair<K, V>> findNode(TreeNode<KeyValuePair<K, V>> node, K value)
	{
		if(value.compareTo(node.getValue().getKey()) > 0)
			return findNode(node.getRight(), value);
		else if(value.compareTo(node.getValue().getKey()) < 0)
			return findNode(node.getLeft(), value);
		else
			return node;
	}




	public TreeNode<KeyValuePair<K, V>> findParent(TreeNode<KeyValuePair<K, V>> node, K value)
	{
		if(value.compareTo(node.getValue().getKey()) > 0)
		{
			if(value.compareTo(node.getRight().getValue().getKey()) == 0)
				return node;
			else
				return findParent(node.getRight(), value);
	   }
		
		else if(value.compareTo(node.getValue().getKey()) < 0)
		{
		   if(value.compareTo(node.getLeft().getValue().getKey()) == 0)
		   	return node;
		   else
				return findParent(node.getLeft(), value);
		}
		else
		{
			TreeNode<KeyValuePair<K, V>> n = null;
			return n;
		}
	}


	public KeyValuePair<K, V> minOfTree(TreeNode<KeyValuePair<K, V>> node)
	{
		if(node.getLeft() != null)
			return minOfTree(node.getLeft());
		else
			return node.getValue(); 
	}


	public V removeHelper(K value)
	{            
		TreeNode<KeyValuePair<K, V>> node = findNode(root, value);
		int ch = 0;
		if(node.getLeft() == null)
			ch++;
	  	if(node.getRight() == null)
			ch++;
	  	// no children
		if(ch == 2)
		{
			if(findParent(root, value).getLeft().getValue().getKey().compareTo(node.getValue().getKey()) == 0)
				findParent(root, value).setLeft(null);


			else if(findParent(root, value).getRight().getValue().getKey().compareTo(node.getValue().getKey()) == 0)
				findParent(root, value).setRight(null);
			return node.getValue().getValue();
		}
		// 1 child
		else if(ch == 1)
		{
			if(findParent(root, value) == null && size == 0)
			{
				V tq = root.getValue().getValue();
				root = null;
				return tq;
			}
			if(node.getLeft() != null)
			{
				V tq = findParent(root, value).getValue().getValue();
				if(findParent(root, value).getLeft().getValue().getKey().compareTo(node.getValue().getKey()) == 0)
					findParent(root, value).setLeft(node.getLeft());			
			
				else
					findParent(root, value).setRight(node.getLeft());	
				return tq;
			}
			else
			{
				V tq = findParent(root, value).getValue().getValue();
				if(findParent(root, value).getLeft().getValue().getKey().compareTo(node.getValue().getKey()) == 0)
					findParent(root, value).setLeft(node.getRight());			
			
				else
					findParent(root, value).setRight(node.getRight());		
				return tq;	
			
			}
		}

		// 2 children
		else         
		{
			KeyValuePair<K, V> kerek = minOfTree(node.getRight());
			K q = kerek.getKey();
			TreeNode<KeyValuePair<K, V>> tmp = findParent(root, q);

			tmp.setLeft(null);
			node.getValue().setKey(kerek.getKey());
			node.getValue().setValue(kerek.getValue());
			return kerek.getValue();
		}
	}
}