public class FacN {
    public static void main(String[] args) {
        int n = 50, c = 0;
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if (n % i == 0){
                System.out.println(i);
                System.out.println(n/i);
            c+=2;
        }
        }
        System.out.println("Count:"+c);
    }
}