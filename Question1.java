import java.util.ArrayList;

class Question1 {
    
    public static ArrayList<Integer> primesUnder(int n) {
        ArrayList<Integer> prime = new ArrayList<Integer>();
        
        for (int i = 2; i <= n; i++) {
            prime.add(i);
        }
        
        //remove the multiples!
        for (int i = 0; i < prime.size();i++) {
            int p = prime.get(i);
            for (int j = i+1; j <  prime.size(); j++) {
                if (prime.get(j) % p== 0) {
                    prime.remove(j);
                    j--;
                }
            }
        }
        return prime;
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> primesUnder100 = primesUnder(100);
        System.out.println(primesUnder100);
    }
}