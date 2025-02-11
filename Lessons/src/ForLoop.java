public class ForLoop {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i = i + 2)
//        for (int i = 0; i <= 10; i = i + 5)
        for (int i = 0; i <= 10; i++) {  // (i = i + 1) == (i++)
            System.out.println("Hello World  " + i);
        }
        System.out.println();
        for (int i = 10; i >=0 ; i--) {
            System.out.println("Hello Java " + i);
        }
    }
}
