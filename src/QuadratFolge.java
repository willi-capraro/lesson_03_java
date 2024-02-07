public class QuadratFolge {
    public static void main(String[] args) {
        int n = 5;
        int x = 2;

        for (int i=0; i < n; i++) {
            System.out.println(x);
            x = x * x;
        }
    }
}
