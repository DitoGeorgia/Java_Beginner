public class Arrays {
    public static void main(String[] args) {

//        char character = 'a';  // примитивный тип данных
//
//        String s = "Hello";                  // ссылочный тип данных
//        String s1 = new String ("Hello");    // ссылочный тип данных

        int number = 10;            // примитивный тип данных  // [10]



        int[] array = new int[5];// ссылочный тип данных  // array2 -> [массив]

//        array[0] = 10;
//        array[1] = 20;
//        array[2] = 30;
//        array[3] = 40;
//        array[4] = 50;
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 10;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        int[] array2 = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
