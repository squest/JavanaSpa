/**
 * Created by macquest on 1/24/15.
 */
public class Prime {

    /// This one runs in 6-8ms
    public static long sieve (int lim) {
        boolean [] primes = new boolean[lim+1];
        int llim = (int) Math.sqrt((double) lim);
        int hlim = llim ;
        if (0 == llim % 2) {
            hlim = llim + 1;
        } else {
            hlim = llim + 2;
        }
        long res = 2;
        for (int i = 3 ; i <= llim ; i += 2) {
            if (!primes[i]) {
                for (int j = i*i; j <= lim ; j += 2*i) {
                    primes[j] = true;
                }
                res += i;
            }
        }
        for (int i = hlim ; i <= lim ; i += 2) {
            if (!primes[i]) {
                res += i;
            }
        }
        return res;
    }

    /// this runs in 1ms
    public static int sol7(int n) {
        int lim = 12 * n;
        int llim = (int) Math.sqrt((double) lim);
        boolean [] primes = new boolean[lim+1];
        int hlim = llim;
        if (0 == llim % 2) {
            hlim = llim + 1;
        } else {
            hlim = llim + 2;
        }
        int cur = 1;
        for (int i = 3; i <= llim ; i += 2){
            if (!primes[i]) {
                for (int j = i*i; j <= lim; j += 2*i) {
                    primes[j] = true;
                }
                cur += 1;
            }
        }
        int i = hlim;
        while (true) {
            if (!primes[i]) {
                cur++;
            }
            if (cur == n) {
                return i;
            } else {
                i += 2;
            }
        }
    }
}
