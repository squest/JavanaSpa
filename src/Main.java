import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("We are making something here");
        long res = Prime.sieve(2000000);


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



        for (int i = 1; i <= 2; i++) {
            long startTime = System.nanoTime();
            res = SmallProblems.sol3(600851475143L);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 3a");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }

        for (int i = 1; i <= 2; i++) {
            long startTime = System.nanoTime();
            res = SmallProblems.sol3b(600851475143L);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 3b");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }

        for (int i = 1; i <= 2; i++) {
            long startTime = System.nanoTime();
            res = SmallProblems.sol3c(600851475143L);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 3c");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }

        for (int i = 1; i <= 2; i++) {
            long startTime = System.nanoTime();
            res = SmallProblems.sol4(999);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 4");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }

        for (int i = 1; i <= 2; i++) {
            long startTime = System.nanoTime();
            res = SmallProblems.sol5(20);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 5");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }

        for (int i = 1; i <= 2; i++) {
            long startTime = System.nanoTime();
            res = SmallProblems.sol6(100);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 6");
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
            res = SmallProblems.sol9(1000);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 9");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }

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
            res = SmallProblems.sol12(13000, 500);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 12");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }

        for (int i = 1; i <= 2; i++) {
            long startTime = System.nanoTime();
            res = SmallProblems.sol14(1000000);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 14");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }

        for (int i = 1; i <= 3; i++) {
            long startTime = System.nanoTime();
            res = SmallProblems.sol21(10000);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("This is number 21");
            System.out.println(res);
            long divs = duration / 1000000;
            long rems = 1000000 + (duration % 1000000);
            System.out.println(divs + "." + rems + "ms " + duration / 1000 + " micro seconds");
        }

    }
}