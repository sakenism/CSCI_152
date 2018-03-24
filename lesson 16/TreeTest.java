public class TreeTest
{
	public static void main(String[] args)
	{
		TreeNode<Integer> n = new TreeNode(5);
		n.setRight(new TreeNode(11));
		n.setLeft(new TreeNode(121));
//		printTree(n);
	}
	
	public static void printTree(TreeNode<Integer> node)
	{
		if(node == null)
			return;
		System.out.println(node.getValue());
		printTree(node.getLeft());
		printTree(node.getRight());

	}

}