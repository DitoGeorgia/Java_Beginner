public class ClassesAndObjects {
    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.name = "Роман";
//        person1.age = 50;
//        System.out.println("Меня зовут " + person1.name + ", мне " + person1.age + " лет.");
//
//        Person person2 = new Person();
//        person2.name = "Вова";
//        person2.age = 20;
//        System.out.println("Меня зовут " + person2.name + ", мне " + person2.age + " лет.");

        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.speak();
        person1.sayHello();
        int year1 = person1.calculateYearsToRetirement();
        System.out.println("До пенсии: " + year1 + " лет.\n");

        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        person2.speak();
        person2.sayHello();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("До пенсии: " + year2 + " лет.");
    }
}


// У класса могут быть:
// 1. Данные (поля, переменные, fields)
// 2. Действия , которые он может совершать (методы)

class Person {
    String name;
    int age;

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
    }
    void sayHello() {
        System.out.println("Hello " + name + " ");
    }
//    void calculateYearsToRetirement() {
//        int years = 65 - age;
//        System.out.println("Количество лет до пенсии: " + years + "\n");
//    }
    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }
}
