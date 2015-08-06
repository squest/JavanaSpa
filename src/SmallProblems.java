import java.util.ArrayList;
import java.util.List;

/**
 * Created by questmac on 8/5/15.
 */

public class SmallProblems {

    // This one runs in 0.5ms
    public static int sol1 (int lim) {
        int res = 0;
        for (int i = 1; i < lim; i++){
            if ((0 == i % 3) || (0 == i % 5)){
                res += i;
            }
        }
        return res;
    }

    // Runs in 2ms
    public static int sol2 (int lim) {
        int a = 1 ; int b = 0; int res = 0; int tmp = a;
        while (a < lim) {
            if (0 == a % 2) {
                res += a;
            }
            tmp = a;
            a += b;
            b = tmp;

        }
        return res;
    }

    public static boolean isPrime (long n) {
        int i = 3;
        int lim = (int) Math.sqrt((double) n);
        while (true) {
            if (i > lim) {
                return true;
            } else if (0 == n % i) {
                return false;
            }
            i += 2;
        }
    }

    // runs in 5.3ms
    public static long sol3 (long tar) {
        long n = tar; int i = 3;
        while (true) {
            if (isPrime(n)) {
                return n;
            } else if (isPrime(i)) {
                while (0 == n % i) {
                    n /= i;
                }
            }
            i += 2;
        }
    }

    // this one runs in 1ms
    public static long sol3b (long tar) {
        long n = tar; int i = 3;
        while (true) {
            if (isPrime(i)) {
                while (0 == n % i) {
                    n /= i;
                }
            }
            if (n == 1) {
                return i;
            }
            i += 2;
        }
    }

    public static long sol3c (long tar) {
        long n = tar; int i = 3; int lim = 10000000;
        while (i <= lim) {
            while ((0 == n % i) && isPrime(i)){
                n /= i;
                if (0 != n % i){
                    lim = (int) Math.sqrt((double) n);
                }
            }
            i += 2;
        }
        return n;
    }

    public static List numcol (int n) {
        List<Integer> res = new ArrayList<>();
        while (true) {
            if (n < 10) {
                res.add(0,n);
                return res;
            } else {
                res.add(0, n % 10);
                n /= 10;
            }
        }
    }

    public static List reverse (List<Integer> col) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : col) {
            res.add(0,i);
        }
        return res;
    }

    private static boolean cmp(List<Integer> l1, List<Integer> l2) {
        // make a copy of the list so the original list is not changed, and remove() is supported
        ArrayList<Integer> cp = new ArrayList<>(l1);
        for (Integer o : l2) {
            if (!cp.remove(o)) {
                return false;
            }
        }
        return cp.isEmpty();
    }

    public static boolean isPalin (int n) {
        List<Integer> res = new ArrayList<>();
        while (true) {
            if (n < 10) {
                res.add(0, n);
                break;
            } else {
                res.add(0, n % 10);
                n /= 10;
            }
        }
        int len = res.size();
        for (int i = 0; i < len; i++) {
            if (!(res.get(i).equals(res.get(len - i - 1)))) {
                return false;
            }
        }
        return true;
    }

    // runs in 2ms
    public static int sol4 (int lim) {
        int maxi = 0;
        for (int i = lim; i > 900; i--) {
            for (int j = i-1; j > 900; j--) {
                int tmp = i * j;
                if (isPalin(tmp)) {
                    return tmp;
                }
            }
        }
        return maxi;
    }

    // runs in 0.003ms
    public static long sol5 (int lim) {
        int [] refs = new int[lim+1];
        long res = 1L;
        for (int i = 1; i <=lim; i++){
            refs[i] = i;
        }
        for (int i =2; i <= lim; i++){
            int tmp = refs[i];
            for (int j = 2*i; j <= lim; j += i) {
                refs[j] /= tmp;
            }
            res *= refs[i];
        }
        return res;
    }

    // runs in 4ms
    public  static long sol6(int lim) {
        long itmp = 0;
        for (int i = 1; i <= lim; i++) {
            itmp += i;
        }
        itmp *= itmp;
        for (int i = 1; i <= lim; i++){
            itmp -= i*i;
        }
        return itmp;

    }

    // runs in 1ms
    public static int sol9(int lim) {
        for (int i = 3; i <= (lim / 4); i += 1) {
            int isqr = i * i;
            for (int j = i + 1; j <= (lim / 2); j += 1) {
                int jsqr = j * j;
                int k = 1000 - (i + j);
                if (k * k == isqr + jsqr) {
                    return i * j * k;
                }
            }
        }
        return 1;
    }

    // runs in 2.2ms
    public static int sol12 (int lim, int tar) {
        int [] faks = new int[lim+1];
        int llim = (int) Math.sqrt ((double) lim);
        for (int i = 1; i <= llim; i++){
            faks[i*i] += 1;
            for (int j = i*i+i; j <= lim; j += i){
                faks[j] += 2;
            }
        }
        for (int i=llim; i<lim; i += 2){
            int ifaks = faks[i];
            int jfaks = faks[i+1];
            int tmp;
            if (0 == i % 2) {
                tmp = (ifaks-2)*jfaks;
            } else {
                tmp = (jfaks-2)*ifaks;
            }
            if (tmp > tar) {
                return i*(i+1)/2;
            }
        }
        return tar;

    }

    // runs in 78ms
    public static int sol14(int lim) {
        int[] refs = new int[lim];
        for (int i = 1; i < lim; i++) {
            long a = i;
            int ctr = 1;
            while (a != 1) {
                if (a >= lim) {
                    ctr += 1;
                    if (0 == a % 2) {
                        a /= 2;
                    } else {
                        a = 3 * a + 1;
                    }
                } else {
                    int tmp = refs[(int) a];
                    if (tmp == 0) {
                        ctr += 1;
                        if (0 == a % 2) {
                            a /= 2;
                        } else {
                            a = 3*a+1;
                        }
                    } else {
                        ctr += tmp;
                        a = 1;
                    }
                }
            }
            refs[i] = ctr;
        }
        int maxi = 0; int cur = 0;
        for (int i = 1; i < lim; i++) {
            int tmp = refs[i];
            if (tmp > maxi) {
                maxi = tmp;
                cur = i;
            }
        }
        return cur;
    }

    // runs in 1.8ms
    public static int sol21 (int n) {
        int lim = 3*n;
        int[] refs = new int[lim+1];
        for (int i = 1; i <= lim; i++){
            refs[i] = 1;
        }
        int llim = (int) Math.sqrt((double) lim);
        for (int i = 2; i <= llim; i++){
            refs[i*i] += i;
            for (int j = i*i+i; j <= lim; j+= i){
                refs[j] += i + j/i ;
            }
        }
        int res = 0;
        for(int i=2; i <= n; i++ ) {
            int tmp = refs[i];
            if (i != tmp) {
                if (i == refs[tmp]) {
                    res += i;
                }
            }

        }
        return res;
    }

}
