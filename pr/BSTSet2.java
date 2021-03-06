import java.util.*;
public class BSTSet2<T extends Comparable> implements Set<T> {

  private Node root;
  private int size;

  private class Node {

	private Node left, right, parent;
	private T value;

	public Node(T value) {
	  this.left = null;
	  this.right = null;
	  this.parent = null;
	  this.value = value;
	}

	@Override
	public String toString() {
	  String res = "";
	  if (left != null) {
		res += left + "; ";
	  }
	  res += value;
	  if (right != null) {
		res += "; " + right;
	  }
	  return res;
	}

  }

  public BSTSet2() {
	root = null;
	size = 0;
  }
  
  @Override
  public void add(T value) {
	Node newNode = new Node(value);
	Node previous = null, tmp = root;
	while (tmp != null) {
	  previous = tmp;
	  int compareResult = value.compareTo(tmp.value);
	  /*if (compareResult == 0) {
		return;
	  }*/
	  if (compareResult < 0) {
		tmp = tmp.left;
	  } else {
		tmp = tmp.right;
	  }
	}
	size++;
	if (previous == null) {
	  //Tree is empty
	  root = newNode;
	  return;
	}
	if (value.compareTo(previous.value) < 0) {
	  previous.left = newNode;
	  newNode.parent = previous;
	} else {
	  previous.right = newNode;
	  newNode.parent = previous;
	}
  }

  @Override
  public boolean contains(T value) {
	Node node = find(value);
	return node != null;
  }

  @Override
  public boolean remove(T value) {
	Node node = find(value);
	if (node == null) {
	  return false;
	}
	removeHelper(node);
	size--;
	return true;
  }

  @Override
  public T removeAny() throws Exception {
	if (root == null) {
	  if (size != 0) {
		throw new Exception("Something really bad happened");
	  }
	  throw new Exception("Set is empty");
	}
	T result = root.value;
	remove(result);
	return result;
  }

  @Override
  public int getSize() {
	return this.size;
  }

  @Override
  public void clear() {
	root = null;
	size = 0;
  }

  @Override
  public String toString() {
//	return out(root, 0) + "[" + root + "]";
	return root.toString();
  }


  public ArrayList<ArrayList<String>> toStr() {
//	return out(root, 0) + "[" + root + "]";
  	String nd = root.toString();
  	//System.out.print(nd + '\n');
  	String tmp = "";

  	int sz = nd.length(), j = 0, cnt = 0;
  	ArrayList<ArrayList<String>> q =  new ArrayList<ArrayList<String>>();
  	
  	q.add(new ArrayList<String>());
  	//q.add("1");
 	//System.out.println(nd);
  	for(int i = 0; i < sz; i++)
  	{
  	//	System.out.println(nd.charAt(i));
  		if(nd.charAt(i) != '~')
  		{
  			tmp = tmp + nd.charAt(i);
		}
  		else
  		{
  			//System.out.println(tmp);
  			if(cnt == 7)
  			{
  				j++;
  				cnt = 0;
  				q.add(new ArrayList<String>());
  			}
  			q.get(j).add(tmp);
  			cnt++;
  			tmp = "";
  		}
  	}
  	//System.out.print("J" + j);
  	for(int i = 1; i <= j; i++)
  	{
  		String qtmp = q.get(i).get(0), qrmp = "";
  		for(int z = 2; z < qtmp.length(); z++)
  			qrmp += qtmp.charAt(z);
  		//System.out.println(q.get(i).get(0));
  		q.get(i).set(0, qrmp);

  	//System.out.println(qrmp);
  	//	System.out.println(q.get(i).get(0));
  	}
  	for(int i = 0; i <= j; i++)
  	{
  		String qtmp = q.get(i).get(0), qrmp = "";
		qtmp = q.get(i).get(4);
  		qrmp = "";
  		for(int z = 1; z < qtmp.length(); z++)
  			qrmp += qtmp.charAt(z);
  		//System.out.println("QS" + qtmp + "!" + qrmp);
  		q.get(i).set(4, qrmp);
  	}
  	//System.out.print(q); 
  	return q;
  }



  private Node find(T value) {
	Node cur = root;
	while (cur != null) {
	  int compareResult = value.compareTo(cur.value);
	  if (compareResult == 0) {
		return cur;
	  }
	  if (compareResult < 0) {
		cur = cur.left;
	  } else {
		cur = cur.right;
	  }
	}
	return null;
  }

  private void removeHelper(Node node) {
	if (node == null) {
	  return;
	}
	if (node.left == null && node.right == null) {
	  //No children
	  if (node.parent == null) {
		root = null;
	  } else {
		if (node.parent.left == node) {
		  node.parent.left = null;
		} else {
		  node.parent.right = null;
		}
	  }
	  return;
	}
	if (node.left == null) {
	  node.right.parent = node.parent;
	  if (node.parent == null) {
		root = node.right;
	  } else {
		if (node.parent.left == node) {
		  node.parent.left = node.right;
		} else {
		  node.parent.right = node.right;
		}
	  }
	  return;
	}
	if (node.right == null) {
	  node.left.parent = node.left;
	  if (node.parent == null) {
		root = node.left;
	  } else {
		if (node.parent.left == node) {
		  node.parent.left = node.left;
		} else {
		  node.parent.right = node.left;
		}
	  }
	  return;
	}
	Node newNode = node;
	while (newNode.left != null) {
	  newNode = newNode.left;
	}
	node.value = newNode.value;
	removeHelper(newNode);
  }
}