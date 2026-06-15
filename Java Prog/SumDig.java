public class SumDig {
    public static void main(String[] args) {
        int n = 523;
        System.out.print(Sum(n, 0));

    }

    public static int Sum(int n, int s) {
        if (n == 0)
            return s;
        s += (n % 10);
        return Sum(n / 10, s);

    }
}