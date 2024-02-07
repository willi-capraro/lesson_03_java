public class FibonacciLoopApplicataion {

    public static void main(String[] args) {
        int n = 9;
        int vorletzte = 0;
        int letzte = 1;
        System.out.println(vorletzte);
        System.out.println(letzte);
        for (int i = 1; i <= n-2; i++) {
            int result = vorletzte + letzte;

            System.out.println(result);

            vorletzte = letzte;
            letzte = result;
        }
    }
}
