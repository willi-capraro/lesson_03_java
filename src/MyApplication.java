public class MyApplication {

    public static void main(String[] args) {
        //print text "hello world" to console
        String firstName = "Wilhelm";
        System.out.println("hello " + firstName);
        System.out.println("wie gehts " + firstName + "?");
        int a = 23;
        int b = 3;
        int c = a * b;

        System.out.println(a * b);
        if (c >= 50) {
            System.out.println("Das war schwer");
        }
        else {
            System.out.println("Das war easy");
        }
        if (c != 69) {
            System.out.println("langweilig");
        }


    }

}
