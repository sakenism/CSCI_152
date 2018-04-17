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
            if(size == 0)
            {
                clear();
                return true;
            }
            removeHelper(value);    
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
                addHelper(node.getLeft(), value);
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
                addHelper(node.getRight(), value);
            }
        }
    }

    public TreeNode<T> findNode(TreeNode<T> node, T value)
    {
        if(value.compareTo(node.getValue()) > 0)
            return findNode(node.getRight(), value);
        else if(value.compareTo(node.getValue()) < 0)
            return findNode(node.getLeft(), value);
        else
            return node;
    }




    public TreeNode<T> findParent(TreeNode<T> node, T value)
    {
        if(value.compareTo(node.getValue()) > 0)
        {
            if(value.compareTo(node.getRight().getValue()) == 0)
                return node;
            else
                return findParent(node.getRight(), value);
       }
        
        else if(value.compareTo(node.getValue()) < 0)
        {
           if(value.compareTo(node.getLeft().getValue()) == 0)
            return node;
           else
                return findParent(node.getLeft(), value);
        }
        else
        {
            TreeNode<T> n = null;
            return n;
        }
    }


    public T minOfTree(TreeNode<T> node)
    {
        if(node.getLeft() != null)
            return minOfTree(node.getLeft());
        else
        {
            return node.getValue(); 
        }
    }


    public void removeHelper(T value)
    {            
        TreeNode<T> node = findNode(root, value);
        int ch = 0;
        if(node.getLeft() == null)
            ch++;
        if(node.getRight() == null)
            ch++;
        // no children
        if(ch == 2)
        {
            if(findParent(root, value).getLeft().getValue().compareTo(node.getValue()) == 0)
                findParent(root, value).setLeft(null);
            else if(findParent(root, value).getRight().getValue().compareTo(node.getValue()) == 0)
                findParent(root, value).setRight(null);
        }
        // 1 child
        else if(ch == 1)
        {
            if(findParent(root, value) == null && size == 0)
            {
                root = null;
            }
            if(node.getLeft() != null)
            {
                if(findParent(root, value).getLeft().getValue().compareTo(node.getValue()) == 0)
                    findParent(root, value).setLeft(node.getLeft());            
            
                else
                    findParent(root, value).setRight(node.getLeft());   
            }
            else
            {
                if(findParent(root, value).getLeft().getValue().compareTo(node.getValue()) == 0)
                    findParent(root, value).setLeft(node.getRight());           
            
                else
                    findParent(root, value).setRight(node.getRight());          
            
            }
        }

        // 2 children
        else         
        {
            T kerek = minOfTree(node.getRight());
           findParent(root, kerek).setLeft(null);
           node.setValue(kerek);
        }


    }


}


   