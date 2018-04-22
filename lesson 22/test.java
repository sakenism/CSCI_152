
public class test {

    public static void main(String[] args) {
     
        Mp<Integer, String> q = new LLQHashTableMap(100);

        System.out.println("Commencing ...");
        long t1, t2, ans;
        t1 = System.currentTimeMillis();
         
        for (int i = 0; i < 9999; i++) {
        	KeyValuePair<Integer, String> tmp = new KeyValuePair(i, "Saken");
            q.add(tmp);
        }
       
        t2 = System.currentTimeMillis();
        ans = t2 - t1;

        System.out.println("Time: " + ans);
        System.out.println(q.toString());
    }

}