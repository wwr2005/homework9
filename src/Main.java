import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] amountOfMoney = generateRandomArray();
        System.out.println(Arrays.toString(amountOfMoney));
        int amount = 0;
        for (int i = 0; i < amountOfMoney.length; i++) {
            amount = amount + amountOfMoney[i];
        }
        System.out.println("Сумма трат за месяц составила " + amount + " рублей");
    }

    public static void task2() {
        int[] amountOfMoney = generateRandomArray();
        System.out.println(Arrays.toString(amountOfMoney));
        int min = amountOfMoney[0];
        int max = amountOfMoney[0];
        for (int amounts : amountOfMoney) {
            if (amounts < min) {
                min = amounts;
            }
            if (amounts > max) {
                max = amounts;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей" + " Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        int[] amountOfMoney = generateRandomArray();
        System.out.println(Arrays.toString(amountOfMoney));
        int amount = 0;
        for (int i = 0; i < amountOfMoney.length; i++) {
            amount = amount + amountOfMoney[i];
        }
double average = (double) amount / amountOfMoney.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}