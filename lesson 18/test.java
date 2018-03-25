
public class test {

    public static void main(String[] args) {
     
        Set<Integer> q = new LLQHashTableSet(100);

        System.out.println("Commencing ...");
        long t1, t2, ans;
        t1 = System.currentTimeMillis();
         
        for (int i = 0; i < 9999; i++) {
            q.add(i);
        }
       
        t2 = System.currentTimeMillis();
        ans = t2 - t1;

        System.out.println("Time: " + ans);
        System.out.println(q.toString());
    }

}