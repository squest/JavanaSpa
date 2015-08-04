import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Any;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        for (int i = 3; i <= (lim/4); i+=1) {
            int isqr = i*i;
            for (int j = i+1; j <= (lim/2); j+=1) {
                int jsqr = j*j;
                int k = 1000-(i+j);
                if (k*k == isqr+jsqr) {
                    return i*j*k;
                }
            }
        }
        return 1;
    }
}
