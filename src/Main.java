public class Main {
    public static void main(String[] args) {
        // Task 1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 2
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 3
        for (int i = 0; i <= 17; i += 2) {
            if (i == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 4
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 5
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        // Task 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 7
        int result = 1;
        for (int i = 1; i <= 9; i++) {
            result = result * 2;
            System.out.print(result + " ");
        }
        System.out.println();

        // Task 8
        int rep = 0;
        int value = 29000;
        for (int i = 1; i <= 12; i++) {
            rep = rep + value;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + rep + " рублей");
        }

        // Task 9
        rep = 0; // объявлена в предыдущей задаче
        //int value = 29000; // объявлена в предыдущей задаче
        for (int i = 1; i <= 12; i++) {
            rep = rep + value;
            rep = rep + (rep/100);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + rep + " рублей");
        }

        // Task 10
        int mult = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(mult + "*" + i + "=" + mult*i);
        }
    }
}