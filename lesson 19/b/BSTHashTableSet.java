public class BSTHashTableSet<T extends Comparable> implements HashTableSet<T> {
    private BSTSet<T>[] bucket;
    private int sz;

    public BSTHashTableSet(int a){
        bucket = new BSTSet[a];
        sz = 0;
    }       
    
    @Override
    public void add(T value) {
        int ind = Math.abs(value.hashCode()) % bucket.length;
        
        if(!contains(value)){
            if(bucket[ind] == null){
                bucket[ind] = new BSTSet();
            }
            bucket[ind].add(value);
            sz++;
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
        if(!contains(value)) 
		return false;
        
        int ind = Math.abs(value.hashCode()) % bucket.length;
        
        sz--;

        return bucket[ind].remove(value);
        
        
    }

    @Override
    public T removeAny() throws Exception {
        if(sz == 0 ) 
		throw new Exception("bucket are empty");
        
        T rs = null;
        
        for (int j = 0; j < bucket.length; j++) { 
            if(bucket[j].getSize() > 0) {
                rs = bucket[j].removeAny();
                sz--;      
                break;
            }                       
        }
        
        return rs;
    }

    @Override
    public int getSize() {
        return sz;
    }

    @Override
    public void clear() {
        sz = 0;       
        for (int i = 0; i < bucket.length; i++) {
            bucket[i].clear();            
        }
    }
    
    public String toString(){
        String rs = "";
        if(sz == 0 ) 
		return "Set Is empty"; 
        
        for (int i = 0; i < bucket.length; i++) {
            if(bucket[i] == null) 
		continue; 
            rs += bucket[i].toString()+" "; 
            
        }
        return rs+" sz:"+sz;        
    }

    @Override
    public int getNumberOfBuckets() {
        return bucket.length;
    }

    @Override
    public int getBucketSize(int index) throws Exception {
        if(bucket[index] == null) 
		throw new Exception("this busket is empty");
        return bucket[index].getSize();
    }

    @Override
    public double getLoadFactor() {
        return sz / bucket.length;
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
