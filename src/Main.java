public class Main {
    public static void main(String[] args) {
        //Домашнее задание - 1.
        //Задание 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //Задание 3
        for (int i = 0; i <= 17; i+=2) {
            System.out.println(i);
        }
        //Задание 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //Домашнее задание - 2.
        //Задание 1
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " год является високосным");
        }
        //Задание 2
        for (int i = 7; i <= 98; i+=7) {
            System.out.println(i);
        }
        //Задание 3
        for (int i = 1; i <= 512; i*=2) {
            System.out.println(i);
        }
        //Домашнее задание - 3.
        //Задание 1
        int total = 0;
        int salary = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц "+ i +", сумма накоплений равна "+ total +" рублей");
        }
        //Задание 2
        int bankDeposit = 0;
        int depositUp = 29000;
        for (int i = 1; i <= 12; i++) {
            bankDeposit = bankDeposit + bankDeposit / 100;
            bankDeposit = bankDeposit + depositUp;
            System.out.println("Месяц "+ i +", сумма накоплений равна "+ bankDeposit +" рублей");
        }
    }
}