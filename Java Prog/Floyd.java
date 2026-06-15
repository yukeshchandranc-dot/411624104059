public class Floyd {
    public static void main(String[] args) {
        int num = 21;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
}