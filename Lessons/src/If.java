import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        while (true) { // for (; ; )
            System.out.println("Введите число: ");
            int input = new Scanner(System.in).nextInt();

            if (input <= 50) {
                System.out.println("Введёное число < или = 50");
            } else {
                System.out.println("Введёное число > 50");
            }
            System.out.println();
        }
    }
}
