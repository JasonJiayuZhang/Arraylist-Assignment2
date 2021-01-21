import java.util.ArrayList;

class Question2 {
    
    public static ArrayList<Integer> under(int n) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        
        for (int i = 2; i <= n; i++) {
            primes.add(i);
        }
        for (int i =0; i < primes.size(); i++) {
            int p =primes.get(i);
            for (int j =i+1; j < primes.size(); j++ ) {
                if (primes.get(j) % p== 0) {
                    primes.remove(j);
                    j--;
                }
            }
        }
        return primes;
    }
    
    public static void gold(int n) {
        ArrayList<Integer> primes = under(n);
        for(int i = 0; i < primes.size(); i++) {
            int Prime1  = primes.get(i);
            int Prime2 = n - Prime1;
            if (primes.contains(Prime2)) {
                System.out.println(Prime1 +  " + " + Prime2 + " = " + n);
                return;
            }
        }
    }
    
    public static void main (String[] args) {
        for (int i = 4; i <= 100; i += 2) {
            gold(i);
        }
    }
}