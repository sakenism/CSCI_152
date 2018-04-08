
public class test {
    public static void main(String[] args)
    {

        LLQHashTableSet<Student> s = new LLQHashTableSet(1000); 
        for (int i = 100; i < 300; i++) {
            s.add(new Student(i,"Bob"));            
        }
        System.out.println(s.getLoadFactor() + " " + s.getBucketSizeStandardDev());
        
    }        
}
