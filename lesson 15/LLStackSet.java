public class LLStackSet<T> implements Set<T> {

  private Queue<T> queue;
                                 
  public LLQueueSet() {
	queue = new LinkedListQueue<>();
  }

  @Override
  public void add(T value) {
	if (this.contains(value)) {
	  return;
	}
	queue.enqueue(value);
  }

  @Override
  public boolean contains(T value) {
	try {
	  for (int i = 0; i < queue.getSize(); i++) {
		T val = queue.dequeue();
		queue.enqueue(val);
		if (val.equals(value)) {
		  return true;
		}
	  }
	} catch (Exception ex) {
	  System.out.print(ex.getMessage());
	}
	return false;
  }

  @Override
  public boolean remove(T value) {
	try {
	  for (int i = 0; i < queue.getSize(); i++) {
		T val = queue.dequeue();
		if (val.equals(value)) {
		  return true;
		} else {
		  queue.enqueue(val);
		}
	  }
	} catch (Exception ex) {
	  System.out.print("<---------------------->");
	  System.out.print(ex);
	}
	return false;
  }


  @Override
  public T removeAny() throws Exception {
	try {
	  return queue.dequeue();
	} catch (Exception ex) {
	  throw new Exception("Set is empty");
	}
  }

  @Override
  public int getSize() {
	return this.queue.getSize();
  }

  @Override
  public void clear() {
	queue.clear();
  }

  @Override
  public String toString() {
	return queue + "";
  }
}