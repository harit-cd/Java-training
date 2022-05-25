public class RecursionNumRev {
    public static void recursion(int num , int rev , int split) {
        if (num > 0) {
            split = num % 10;
            rev = rev * 10 + split;
            num /= 10;
            recursion(num, rev, split);
        } else
            System.out.println(rev);
    }

    public static void main(String[] args) {
        int num = 154324;
        int rev = 0 , split = 0;
       // int ans =
        recursion(num, rev ,split);
    }
}
