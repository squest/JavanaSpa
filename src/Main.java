import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("We are making something here");
        long res = Prime.sieve(2000000);
        for (int i = 1; i <= 2; i++) {
            long startTime = System.nanoTime();
            res = Prime.sieve(2000000);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 10");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }
        for (int i = 1; i <= 2; i++) {
            long startTime = System.nanoTime();
            res = Prime.sol7(10001);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 7");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }

        for (int i = 1; i <= 2; i++) {
            long startTime = System.nanoTime();
            res = SmallProblems.sol1(10001);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 1");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }

        for (int i = 1; i <= 2; i++) {
            long startTime = System.nanoTime();
            res = SmallProblems.sol2(4000000);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 2");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }

        List itmp = SmallProblems.numcol(12321);
        System.out.println(itmp);
        System.out.println(SmallProblems.isPalin(itmp));


        for (int i = 1; i <= 2; i++) {
            long startTime = System.nanoTime();
            res = SmallProblems.sol3(600851475143L);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 3");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }
    }
}