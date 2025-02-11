public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);  // 10
        System.out.println(numbers[1]);  // 0
        System.out.println();

        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Java";
        strings[2] = "Dimitri";

//        System.out.println(strings[0]);
//        System.out.println(strings[1]);
//        System.out.println(strings[2]);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String string : strings) {    // for-each
            System.out.println(string);
        }

        System.out.println();
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum = sum + x;
        }
        System.out.println(sum);

        int value = 0;  // 32 бита в памяти
        String s;       // выделяется память под ссылку


    }
}









