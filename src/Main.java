public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();


    }
// задание 6
    private static void task5() {
     // я не знаю как ...
    }

    // задание 4, 5
    private static void task4() {
        int money = 15000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + total/100*7;
            total = total + money;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }

    // Задание 3
    private static void task3() {
        long population = 12_000_000;
        long BirthRate = population / 1000 * 17;
        long mortality = population / 1000 * 8;
        long years = 10;
        long differentPeople = 0;
        long peopleYear = 0;
        for (years=1; years <= 10; years++) {
            differentPeople = BirthRate - mortality;
            peopleYear =  peopleYear + differentPeople;
            System.out.println("Год " + years + " численность населения составляет " + peopleYear + " человек.");
        }
    }

    // Задание 2
    private static void task2() {
        int i = 1;
        int a = 10;
        for (; i<=10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (; a>=1; a--) {
            System.out.print(a + " ");
        }
    }
// Задание 1
    private static void task1() {
   int salary = 29000;
int total = 0;
for (int i =0; total < 2_459_000; i++) {
    total = total + total/100;
    total = total + salary;
    System.out.println("Месяц " + i + " итого " + total);
}
    }
}