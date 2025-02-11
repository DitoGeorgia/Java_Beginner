public class Multidimensional_arrays {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3}; // одномерный массив / линейный порядок чисел

        int[][] numbers2 = new int[5][10];       // двумерый массив чисел
        String[][] numbers3 = new String[2][2];  // двумерый массив строк


        /**
         * 1,2,3,4,0,-1,2,10  // одномерный массив
         * ---------------------------------------
         * 123  // двумерый массив, предсставляет из себя матрицу / таблицу
         * 456  // два числа / первое число указвыает на строку, второе - на столбец.
         * 789  // 8 --> [2][1];  4 --> [1][0];
         * ---------------------------------------
         */

//        int[][] matrica = {{}, {}, {}}; // пустой

//        int[][] matrica2 = {{78},
//                           {48963},
//                           {473}};

//        int[][] matrica2 = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] matrica2 = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        System.out.println(matrica2[2][2]); // -->  9
        System.out.println(matrica2[1][0]); // -->  4
        System.out.println();

        int[][] numbers4 = new int[5][5];
        for (int i = 0; i < numbers4.length; i++) {
            for (int j = 0; j < numbers4[i].length; j++) {
                System.out.print(numbers4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] numbers5 = {{1,2,3,4,5},
                           {6,7,8,9,10},
                           {11,12,13,14,15}};
        for (int i = 0; i < numbers5.length; i++) {
            for (int j = 0; j < numbers5[i].length; j++) {
                System.out.print(numbers5[i][j] + " ");
            }
            System.out.println();
        }
     }
}
