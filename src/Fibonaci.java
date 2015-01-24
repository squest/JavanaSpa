import java.math.BigInteger;

/**
 * Created by macquest on 1/24/15.
 */
public class Fibonaci {
    public static int fiboWith (BigInteger lim) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("0");
        BigInteger temp;
        int i = 1;
        while (a.compareTo(lim) == -1) {
            i++;
            temp = a;
            a = a.add(b);
            b = temp;
        }
        return i;
    }
}
