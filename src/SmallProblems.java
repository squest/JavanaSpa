import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Any;

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
        while (true) {
            if (i > n / i) {
                return true;
            } else if (0 == n % i) {
                return false;
            }
            i += 2;
        }
    }

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

    private static boolean cmp(List<?> l1, List<?> l2) {
        // make a copy of the list so the original list is not changed, and remove() is supported
        ArrayList<?> cp = new ArrayList<>(l1);
        for (Object o : l2) {
            if (!cp.remove(o)) {
                return false;
            }
        }
        return cp.isEmpty();
    }

    public static boolean isPalin (List<Integer> col) {
        return cmp(col, reverse(col));
    }

}
