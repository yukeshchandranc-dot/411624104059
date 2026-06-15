public class rec {
    public static void main(String[] args) {
        int n = 5;
         System.out.println(re(1, n, 1));

    }

    public static int re(int i, int n,int s) {
        if (i > n) {
            return s;
        }
        s*=i;
        return re(++i, n,s);
       

    }
}