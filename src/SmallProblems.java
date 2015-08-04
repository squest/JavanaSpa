/**
 * Created by questmac on 8/5/15.
 */
public class SmallProblems {
    public static int sol1 (int lim) {
        int res = 0;
        for (int i = 1; i < lim; i++){
            if ((0 == i % 3) || (0 == i % 5)){
                res += i;
            }
        }
        return res;
    }
}
