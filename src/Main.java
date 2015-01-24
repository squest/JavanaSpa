import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("We are making something here");

        BigInteger lim = new BigInteger("10");
        lim = lim.pow(999);
        long startTime = System.nanoTime();
        int res = Fibonaci.fiboWith(lim);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(res);
        long divs = duration / 1000000;
        long rems = 1000000 + (duration % 1000000);
        System.out.println(divs + "." + rems + "ms " + duration / 1000 + " microsec");
    }
}