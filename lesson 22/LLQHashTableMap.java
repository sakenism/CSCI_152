public class LLQHashTableMap<K, V> implements HashTableMap<K, V> {
    private LinkedListQueue<KeyValuePair<K, V>>[] bucket;
    private int size;

    public LLQHashTableMap(int a){
        bucket=new LinkedListQueue[a];
        size = 0;
    }       
    
    @Override
    public void add(KeyValuePair<K,V> value) {
        int ind = Math.abs(value.getKey().hashCode()) % bucket.length;
        
        if(!contains(value.getKey())){
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
    public boolean contains(K value) {
        int ind = Math.abs(value.hashCode()) % bucket.length;
        
        if(bucket[ind] == null) 
            return false;    
        int sz = bucket[ind].getSize();
        for(int i = 1; i <= sz; i++)
        {
            try
            {
                KeyValuePair<K,V> tmp = bucket[ind].dequeue();
                bucket[ind].enqueue(tmp);
                if(tmp.getKey() == value)
                    return true;
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean remove(K value) {
        if(!contains(value)) return false;
        
        int ind = Math.abs(value.hashCode()) % bucket.length;
        
        size--;

        int sz = bucket[ind].getSize();
        for(int i = 1; i <= sz; i++)
        {
            try
            {
                KeyValuePair<K,V> tmp = bucket[ind].dequeue();
                if(tmp.getKey() != value)
                {
                    bucket[ind].enqueue(tmp);
                }
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        return true;
        
        
    }

    @Override
    public V removeAny() throws Exception {
        if(size == 0 ) throw new Exception("bucket is empty");
        
        V result = null;
        
        for (int j = 0; j < bucket.length; j++) { 
            if(bucket[j].getSize() > 0) {
                result = bucket[j].dequeue().getValue();
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
    public double getBucketSizeStandardDev() {
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
    public String bucketsToString() {
        return toString();
    }
    
}