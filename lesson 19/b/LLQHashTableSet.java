
public class LLQHashTableSet<T> implements HashTableSet<T> {
    private LinkedListQueue<T>[] bucket;
    private int size;

    public LLQHashTableSet(int ind){
        bucket=new LinkedListQueue[ind];
        size=0;
    }       
    
    @Override
    public void add(T value) {
        int ind = Math.abs(value.hashCode()) % bucket.length;
        
        if(!contains(value)){
            if(bucket[ind] == null){
                bucket[ind] = new LinkedListQueue();
            }
            bucket[ind].enqueue(value);
            size++;
        }
    }

    @Override
    public boolean contains(T value) {
        int ind = Math.abs(value.hashCode()) % bucket.length;
        
        if(bucket[ind] == null) 
            return false;    
        
        return bucket[ind].contains(value);
    }

    @Override
    public boolean remove(T value) {
        if(!contains(value)) return false;
        
        int ind = Math.abs(value.hashCode()) % bucket.length;
        size--;

        return bucket[ind].remove(value);
        
        
    }

    @Override
    public T removeAny() throws Exception {
        if(size == 0 ) throw new Exception("nothing in buckets");
        
        T rs = null;
        
        for (int j = 0; j < bucket.length; j++) { 
            if(bucket[j].getSize() > 0) {
                rs = bucket[j].dequeue();
                size--;      
                break;
            }                       
        }
        
        return rs;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;       
        for (int i = 0; i < bucket.length; i++) {
            bucket[i].clear();            
        }
    }
    
    public String toString(){
        String rs = "";
        if(size == 0 ) return "Set is empty"; 
        
        for (int i = 0; i < bucket.length; i++) {
            if(bucket[i] == null) continue; 
            rs += bucket[i].toString()+" "; 
            
        }
        return rs +" size:"+size;        
    }

    @Override
    public int getNumberOfBuckets() {
        return bucket.length;
    }

    @Override
    public int getBucketSize(int index) throws Exception {
        if(bucket[index] == null) throw new Exception("this busket is empty");
        return bucket[index].getSize();
    }

    @Override
    public double getLoadFactor() {
        return size/bucket.length;
    }

    @Override
    public double getBucketSizeStandardDev() {
        int mean , sum = 0;
        for (int i = 0; i < bucket.length; i++) {
            if(bucket[i] != null)
            sum += bucket[i].getSize();
        }
        mean = sum/bucket.length;
        
        int sumOfSquares = 0;
        
        for (int i = 0; i < bucket.length; i++) {
            int s = 0;
            if(bucket[i]!=null) s = bucket[i].getSize(); 
            sumOfSquares += Math.pow(s - mean , 2);
        }
        
        return Math.sqrt(sumOfSquares/bucket.length);
    }

    @Override
    public String bucketsToString() {
        return toString();
    }
    
}
