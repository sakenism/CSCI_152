public class LLQHashTableMap<T> implements HashTableSet<T> {
    private LinkedListQueue<T>[] bucket;
    private int size;

    public LLQHashTableSet(int a){
        bucket=new LinkedListQueue[a];
        size=0;
    }       
    
    @Override
    public void add(T value) {
        int ind = Math.abs(value.hashCode()) % bucket.length;
        
        if(!contains(value)){
            if(bucket[ind] == null){
                bucket[ind] = new LinkedListQueue();
                bucket[ind].enqueue(value);
            }else {
                bucket[ind].enqueue(value);
            }
            size++;
        }
    }

    @Override
    public boolean contains(T value) {
        int ind = Math.abs(value.hashCode()) % bucket.length;
        
        if(bucket[ind] == null) return false;    
        
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
        if(size == 0 ) throw new Exception("bucket are empty");
        
        T result = null;
        
        for (int j = 0; j < bucket.length; j++) { 
            if(bucket[j].getSize() >0) {
                result = bucket[j].dequeue();
                size--;      
                break;
            }                       
        }
        
        return result;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        size=0;       
        for (int i = 0; i < bucket.length; i++) {
            bucket[i].clear();            
        }
    }
    
    public String toString(){
        String result = "";
        if(size == 0 ) return "Set Is empty"; 
        
        for (int i = 0; i < bucket.length; i++) {
            if(bucket[i] == null) continue; 
            result += bucket[i].toString()+" "; 
            
        }
        return result+" size:"+size;        
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
        return size / bucket.length;
    }

    @Override
    public double getBucketSizeStd() {
        int mean, sum = 0;
        for (int i = 0; i < bucket.length; i++) {
            if(bucket[i] != null)
            sum += bucket[i].getSize();
        }
        mean = sum / bucket.length;
        
        int sumOfSquares = 0;
        
        for (int i = 0; i < bucket.length; i++) {
            int s = 0;
            if(bucket[i]!=null) s = bucket[i].getSize(); 
            sumOfSquares += Math.pow(s - mean , 2);
        }
        
        return Math.sqrt(sumOfSquares/bucket.length);
    }

    @Override
    public String bucketToString() {
        return toString();
    }
    
}