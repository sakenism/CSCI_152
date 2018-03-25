
public class LLQHashTableSet<T> implements Set<T> {

    private LinkedListQueue<T>[] buckets;
    private int size;
    private int index;

    public LLQHashTableSet(int  index) {
        buckets = (LinkedListQueue<T>[]) new LinkedListQueue[ index];
        size = 0;
        this.index = index;
    }

    @Override
    public void add(T value) {
        if (contains(value) == false) {
            int hash = Math.abs(value.hashCode()) % index;
            
            if (buckets[hash] == null) {
                buckets[hash] = new LinkedListQueue();
                buckets[hash].enqueue(value);
                size++;
            } 
            else 
            {
                buckets[hash].enqueue(value);
                size++;
            }
        } 
    }

    @Override
    public boolean contains(T value) {
        
        int hash = Math.abs(value.hashCode()) % index;
        boolean check = false;
        
        if (size == 0) 
            return false;
        
        
        if (buckets[hash] == null) 
            return false;
            
        int sz = buckets[hash].getSize();
        for (int i = 0; i < sz; i++) 
        {
            try 
            {
                T vl = buckets[hash].dequeue();
                buckets[hash].enqueue(vl);
                if (vl.equals(value)) 
                    return true;
            } 
            catch (Exception ex) 
            { 
                System.out.println("Smth went wrong!");
            }
        }
        return false;
    }
       

    @Override
    public boolean remove(T value) {
        if (contains(value)) {
            int hash = Math.abs(value.hashCode()) % index;

            int sz = buckets[hash].getSize();
            for (int i = 0; i < sz; i++) {
                try {
                    T vl = buckets[hash].dequeue();
                    if (vl.equals(value)) {
                        size--;
                        return true;
                    } 
                    else 
                        buckets[hash].enqueue(vl);
                } 
                catch (Exception ex) 
                {
                    System.out.println("Fix it!");
                }
            }
        }
        return false;
    }

    @Override
    public T removeAny() throws Exception {
        if (size == 0) 
            throw new Exception("The Set is empty.");
        else 
        {
            for(int i = index - 1; i >= 0; i--)
            {
                if (buckets[i].getSize() != 0) 
                {
                    size--;
                    return buckets[i].dequeue();
                } 
            } 
        }
        return null;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void clear() {
        buckets = (LinkedListQueue<T>[]) new LinkedListQueue[index];
        this.size = 0;
    }

    @Override
    public String toString() {
        String check = null;
        for(int i = 0; i < index; i++)
            check += buckets[i] + "\n";

        check += "Size:" +  size;
        return check;
    }

}