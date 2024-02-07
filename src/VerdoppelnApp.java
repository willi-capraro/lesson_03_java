public class VerdoppelnApp {

    public static void main(String[] args) {
        int n = 13;
        int x = 2;
        int max = 32;
        for (int i=0; i < n; i++) {
            System.out.println(x);
            x = x * 2;
            if (x > max) {
                break;
            }
        }
    }
}
