import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст: ");


//        int age = scanner.nextInt();
////        if (age == 10) {
////            System.out.println("Ты учишься в школе");
////        } else if (age == 18) {
////            System.out.println("Ты закончил школу");
////        } else if (age == 21) {
////            System.out.println("Первая работа");
////        }


//        int age = scanner.nextInt();
////        switch (age) {
////            case 0 :
////                System.out.println("Рождение");
////                break;
////            case 7 :
////                System.out.println("Школа");
////                break;
////            case 18 :
////                System.out.println("Окончание Школы");
////                break;
////            default:
////                System.out.println("Условие не подошло");
//        }

        String age = scanner.nextLine();
        switch (age) {
            case "0" :
                System.out.println("Рождение");
                break;
            case "7" :
                System.out.println("Школа");
                break;
            case "18" :
                System.out.println("Окончание Школы");
                break;
            default:
                System.out.println("Условие не подошло");
        }
    }
}
