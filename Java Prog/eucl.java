public class eucl {
    public static void main(String[] args) {
        int a = 154, b =420, m;
        while (b != 0) {
            m = a % b;
            a = b;
            b = m;
        }
        System.out.print("GCD:" + a);
    }
}