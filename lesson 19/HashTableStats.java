public interface HashTableStats
{
	public int getNumberOfBuckets();

	public int getBucketSize(int index) throws Exception; 

	public double getLoadFactor();

	public double getBucketSizeStd();

	public String bucketToString();
}