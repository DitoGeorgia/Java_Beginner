public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(0);

        System.out.println("Выводим значение в main методе: " + person1.getName());

        System.out.println("Выводим значение в main методе: " + person1.getAge());

    }
}


// У класса могут быть:
// 1. Данные (поля, переменные, fields)
// 2. Действия , которые он может совершать (методы)

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ввод пустого имени!!!");
        } else {
            name = userName;
        }
    }
    public String getName() {
        return name;
    }


    public void setAge(int userAge) {
        if (userAge <= 0) {
            System.out.println("Возраст не верный");
        } else {
            age = userAge;
        }
    }
    public int getAge() {
        return age;
    }




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
