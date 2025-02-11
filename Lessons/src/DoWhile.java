import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число '5'");
//        int value = scanner.nextInt();
//        while (value != 5) {
//            System.out.println("Введите число '5'");
//            value = scanner.nextInt();
//        }
//        System.out.println("Вы ввели число '5'");


        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введите число '5'");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("Вы ввели число '5'");

    }
}
