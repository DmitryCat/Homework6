public class Main {
    public static void main(String[] args) {
        // Задание 1
        for (int i = 1; i < 11; i++) {
            System.out.println("Воводим1 " + i);
        }
        // Задание 2
        for (int i = 10; i > 0; i--) {
            System.out.println("Выводим2 " + i);
        }
        //Задание 3
        for (int i = 0; i<17; i=i+2) {
            System.out.println("Воводим3 " + i);
        }
        // Задание 4
        for (int i = 10; i>-11; i=i-1) {
            System.out.println("Выводим44 " + i);
        }
        // Задание 5
        for (int i = 1904; i<2097; i=i+4) {
            System.out.println(i + " год является високосным");
        }
        // Задание 6
        for (int i=7; i<=98; i = i+7) {
            System.out.println(i);
        }
        // Задание 7
        for (int i = 1; i <= 512; i = i*2) {
            System.out.println(i);
        }
        // Задание 8
        int a = 0;
        int b = 29000;
        for (int i = 1; i <= 12; i++) {
            a=a+b;
            System.out.println("Месяц " + i + " сумма годовых накопления равна " + a);
        }
        // Задание 9
        for (int i =1; i<=12; i++) {
            a=a+b;
            a=a+a/100;
            System.out.println("Месяц " + i + " сумма годовых накопления равна " + a);
        }
        // Задание 10
        int z;
        for (int i=1; i<=10; i++) {
            z = i*2;
            System.out.println("2*" + i + "=" + z);
        }
    }
}