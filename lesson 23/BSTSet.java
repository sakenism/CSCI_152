
public class BSTSet<T extends Comparable> implements Set<T> {

    private TreeNode<T> root;
    private int size;


    public BSTSet() {
        root = null;
        size = 0;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    @Override
    public void add(T value) {
        TreeNode<T> newNode = new TreeNode(value);
        if(contains(value)) return;
        size++;
        if(root == null){
            root = newNode;
        }else{
            TreeNode<T> current = root;    
            while(true){
                if(current.getValue().compareTo(newNode.getValue()) > 0){
          
                    if(current.getLeft() == null) { 
                        current.setLeft(newNode);
                        return;
                    }
                    current = current.getLeft();
                } else if(current.getValue().compareTo(newNode.getValue()) <= 0){
              
                    if(current.getRight() == null) { 
                        current.setRight(newNode);
                        return;
                    }
                    current = current.getRight();
                }
            }
        }
        
    }

    @Override
    public boolean contains(T value) {
   
        if(root == null) 
		return false;
        TreeNode<T> current = root;
        int i =0;
        while(true){
        
            int compare = current.getValue().compareTo(value);
           
            
            if(compare>0){       
                i++;
                if(current.getLeft() == null) return false;
                current  = current.getLeft();
                
            }else if(compare<0){
               
                i++;
                
                if(current.getRight() == null) return false;
                current  = current.getRight();
            }else{
                
                i++;
                
                return true;
            }
            
        }
    }

    @Override
    public boolean remove(T value) {
        if(!contains(value)) return false;
        
        TreeNode<T> current = root; 
        boolean isLeftChild = false;
        while(true){
            int compare = current.getValue().compareTo(value);
           
            if(compare>0){
                
                
                if(current.getLeft() == null) return false;
                current  = current.getLeft();
                isLeftChild = true;
            }else if(compare<0){
                
                if(current.getRight() == null) return false;
                current  = current.getRight();
                isLeftChild = false;
            }else{
                
               
                size--;
                if(current.getLeft() == null && current.getRight() == null){ 
                    if(size  == 0) {
                        root = null;
                        return true;
                    }
                    if(isLeftChild == true){
                        current.getParent().setLeft(null);
                        return true;
                    }else{
                        current.getParent().setRight(null);
                        return true;
                    }
                }
                
              
                if(current.getLeft() == null){
                    if(size == 0) {
                        root = null;
                        root = current.getRight();
                        return true;
                    }
                    if(isLeftChild == true){
                        current.getParent().setLeft(current.getRight());
                        current = null;
                        return true;
                    }else{
                        current.getParent().setRight(current.getRight());
                        current = null;
                        return true;
                    }
                }else 
                if(current.getRight() == null){
                    if(size == 0) {
                        root = current.getLeft();
                        return true;
                    }
                    if(isLeftChild == true){
                        current.getParent().setLeft(current.getLeft());
                        current = null;
                        return true;
                    }else{
                        current.getParent().setRight(current.getLeft());
                        current = null;
                        return true;
                    }
                } 
               
                if(current.getLeft()!=null && current.getRight()!=null){ 
                    TreeNode<T> min = current.getRight();
                    boolean minIsLeft = false;
                    while(true){
                        if(min.getLeft() == null){  
                            if(min.getRight()!=null){
                                if(minIsLeft) min.getParent().setLeft(min.getRight()) ;
                                        else min.getParent().setRight(min.getRight()) ;
                            }
                            else {
                                if(minIsLeft) min.getParent().setLeft(null) ;
                                        else min.getParent().setRight(null) ;
                            }
                            min.setLeft(current.getLeft());
                            min.setRight(current.getRight());
                            if(isLeftChild == true){ 
                                current.getParent().setLeft(min);
                                current = null;     
                                return true;
                            }else{
                                System.out.println("is right");
                                if(current.getParent()==null){
                                    root = min;
                                    root.setParent(null); 
                                }else
                                current.getParent().setRight(min);
                                current = null; 
                                return true;
                            }  
                        }
                        min = min.getLeft();
                        minIsLeft = true;
                    }
                } 
                        
            }  
        }
    }

    @Override
    public T removeAny() throws Exception { 
        T result = null;
        if(size == 0) throw new Exception("empty");
        if(size == 1){
            result = root.getValue();
            root = null;
            size--;
            return result;
        }else{ 
            result = root.getValue();
            remove(result); 
            return result;
        }
        
        
    }

    public void setSize(int size) {
        this.size = size;
    } 
    
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }
    
    public String toString(){
        return treeToString(root);
    }
    
    public String treeToString(TreeNode tree){
        if(tree == null) return "";
        
        return treeToString(tree.getLeft())+" "+tree.getValue()+" "+ treeToString(tree.getRight());
        
    }
    
    
}
