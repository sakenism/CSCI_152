/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 1
 */


/**
 *
 * @author manny
 * @param <T>
 */
public class LinkedListStack<T> implements Stack<T> {

  private Node<T> top;
  private int size;
  
  public LinkedListStack() {
	top = null;
	size = 0;
  }
  
  @Override
  public void push(T value) {
	Node<T> node = new Node<>(value);
	node.setLink(top);
	top = node;
	size++;
  }

  /*

   @Override
  public void push(T value) {
	LLNode<T> node = new LLNode<>(value);
	node.setNext(this.head);
	this.head = node;
	size++;
  }

  */



  @Override
  public T pop() throws Exception {
	if (size == 0)
	  throw new Exception("Stack is empty");
	T result = top.getValue();
	top = top.getLink();
	size--;
	return result;
  }

  @Override
  public int getSize() {
	return size;
  }

  @Override
  public void clear() {
	size = 0;
	top = null;
  }
  
  @Override
  public String toString() {
	String res = "";
	Node<T> tmp = top;
	boolean first = true;
	while (tmp != null) {
	  if (!first) {
		res += ", ";
	  } else
		first = false;
	  res += tmp.getValue().toString();
	  tmp = tmp.getLink();
	}
	return "[" + res + "]";
  }
}